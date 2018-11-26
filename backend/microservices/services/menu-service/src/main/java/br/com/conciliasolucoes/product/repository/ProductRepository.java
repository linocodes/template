package br.com.conciliasolucoes.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.conciliasolucoes.product.domain.Menu;


public interface ProductRepository extends MongoRepository<Menu, String> {

}
