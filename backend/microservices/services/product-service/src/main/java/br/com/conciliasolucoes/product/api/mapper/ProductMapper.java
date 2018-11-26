package br.com.conciliasolucoes.product.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import br.com.conciliasolucoes.product.api.model.CreateOrUpdateProductPayload;
import br.com.conciliasolucoes.product.api.model.QueryProductResult;
import br.com.conciliasolucoes.product.domain.Product;

/**
 * Component that maps a domain model to an API model and vice-versa.
 *
 * @author cassiomolin
 */
@Mapper
public interface ProductMapper {

    Product toProduct(CreateOrUpdateProductPayload payload);

    QueryProductResult toQueryProductResult(Product product);

    void updateProduct(CreateOrUpdateProductPayload payload, @MappingTarget Product product);
}