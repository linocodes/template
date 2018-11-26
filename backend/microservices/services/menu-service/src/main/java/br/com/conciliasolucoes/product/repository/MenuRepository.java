package br.com.conciliasolucoes.product.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.conciliasolucoes.product.domain.Menu;

public interface MenuRepository extends CrudRepository<Menu, String> {

}
