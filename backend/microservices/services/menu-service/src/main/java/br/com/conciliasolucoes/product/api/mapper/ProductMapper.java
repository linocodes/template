package br.com.conciliasolucoes.product.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import br.com.conciliasolucoes.product.api.model.CreateOrUpdateProductPayload;
import br.com.conciliasolucoes.product.api.model.QueryProductResult;
import br.com.conciliasolucoes.product.domain.Menu;

@Mapper
public interface ProductMapper {

    Menu toProduct(CreateOrUpdateProductPayload payload);

    QueryProductResult toQueryProductResult(Menu product);

    void updateProduct(CreateOrUpdateProductPayload payload, @MappingTarget Menu product);
}