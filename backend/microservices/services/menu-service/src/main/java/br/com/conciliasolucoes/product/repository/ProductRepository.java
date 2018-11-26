package br.com.conciliasolucoes.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.conciliasolucoes.product.domain.Product;

/**
 * MongoDB repository for products.
 *
 * @author cassiomolin
 */
public interface ProductRepository extends MongoRepository<Product, String> {

}
