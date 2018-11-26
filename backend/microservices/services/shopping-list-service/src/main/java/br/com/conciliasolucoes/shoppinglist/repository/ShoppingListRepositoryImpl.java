package br.com.conciliasolucoes.shoppinglist.repository;

import com.mongodb.BasicDBObject;

import br.com.conciliasolucoes.shoppinglist.domain.ShoppingList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

/**
 * Implementation of the additional methods for the shopping list repository.
 *
 * @author cassiomolin
 */
public class ShoppingListRepositoryImpl implements ShoppingListRepositoryCustom {

    @Autowired
    private MongoOperations mongoOperations;

    @Override
    public void deleteProductsById(String id) {
        mongoOperations.updateMulti(new Query(), new Update().pull("items", new BasicDBObject("id", id)), ShoppingList.class);
    }
}
