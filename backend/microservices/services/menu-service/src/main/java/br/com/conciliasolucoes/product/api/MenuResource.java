package br.com.conciliasolucoes.product.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.conciliasolucoes.product.api.mapper.MenuMapper;
import br.com.conciliasolucoes.product.api.model.CreateOrUpdateMenuPayload;
import br.com.conciliasolucoes.product.api.model.QueryMenuResult;
import br.com.conciliasolucoes.product.domain.Menu;
import br.com.conciliasolucoes.product.service.MenuService;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;
import java.util.stream.Collectors;


@Component
@Path("products")
public class MenuResource {

    @Context
    private UriInfo uriInfo;

    @Autowired
    private MenuMapper productMapper;

    @Autowired
    private MenuService productService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProducts() {
        List<Menu> products = productService.getProducts();
        List<QueryMenuResult> queryResults = products.stream().map(productMapper::toQueryProductResult).collect(Collectors.toList());
        return Response.ok(queryResults).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createProduct(@Valid @NotNull CreateOrUpdateMenuPayload productPayload) {
        Menu product = productMapper.toProduct(productPayload);
        String id = productService.createProduct(product);
        return Response.created(uriInfo.getAbsolutePathBuilder().path(id).build()).build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProduct(@PathParam("id") String id) {
        Menu product = productService.getProduct(id);
        QueryMenuResult queryResult = productMapper.toQueryProductResult(product);
        return Response.ok(queryResult).build();
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateProduct(@PathParam("id") String id, @Valid @NotNull CreateOrUpdateMenuPayload payload) {
        Menu product = productService.getProduct(id);
        productMapper.updateProduct(payload, product);
        productService.updateProduct(product);
        return Response.noContent().build();
    }

    @DELETE
    @Path("{id}")
    public Response deleteProduct(@PathParam("id") String id) {
        productService.deleteProduct(id);
        return Response.noContent().build();
    }
}