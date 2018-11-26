package br.com.conciliasolucoes.product.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import br.com.conciliasolucoes.product.api.model.CreateOrUpdateMenuPayload;
import br.com.conciliasolucoes.product.api.model.QueryMenuResult;
import br.com.conciliasolucoes.product.domain.Menu;

@Mapper
public interface MenuMapper {

    Menu toProduct(CreateOrUpdateMenuPayload payload);

    QueryMenuResult toQueryProductResult(Menu product);

    void updateProduct(CreateOrUpdateMenuPayload payload, @MappingTarget Menu product);
}