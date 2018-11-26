package br.com.conciliasolucoes.shoppinglist.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.conciliasolucoes.shoppinglist.domain.ShoppingList;

/**
 * MongoDB repository for shopping lists.
 *
 * @author cassiomolin
 */
public interface ShoppingListRepository extends MongoRepository<ShoppingList, String>, ShoppingListRepositoryCustom {

}
