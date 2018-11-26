package br.com.conciliasolucoes.shoppinglist.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import br.com.conciliasolucoes.shoppinglist.api.model.CreateOrUpdateShoppingListPayload;
import br.com.conciliasolucoes.shoppinglist.api.model.QueryShoppingListResult;
import br.com.conciliasolucoes.shoppinglist.domain.ShoppingList;

/**
 * Component that maps a domain model to an API model and vice-versa.
 *
 * @author cassiomolin
 */
@Mapper
public interface ShoppingListMapper {

    ShoppingList toShoppingList(CreateOrUpdateShoppingListPayload payload);

    QueryShoppingListResult toQueryShoppingListResult(ShoppingList shoppingList);

    void updateShoppingList(CreateOrUpdateShoppingListPayload payload, @MappingTarget ShoppingList shoppingList);
}
