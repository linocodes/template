package br.com.conciliasolucoes.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import br.com.conciliasolucoes.product.domain.Menu;
import br.com.conciliasolucoes.product.repository.MenuRepository;

import javax.ws.rs.NotFoundException;
import java.util.List;


@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    @Qualifier(MenuOutputChannel.PRODUCT_DELETED_OUTPUT)
    private MessageChannel menuDeletedMessageChannel;

    @Autowired
    @Qualifier(MenuOutputChannel.PRODUCT_UPDATED_OUTPUT)
    private MessageChannel menuUpdatedMessageChannel;

    public List<Menu> getProducts() {
        return menuRepository.findAll();
    }

    public Long createProduct(Menu product) {
        product = menuRepository.save(product);
        return product.getId();
    }

    public void updateProduct(Menu product) {
        product = productRepository.save(product);
        productUpdatedMessageChannel.send(MessageBuilder.withPayload(product).build());
    }

    public Menu getProduct(String id) {
        Menu product = productRepository.findOne(id);
        if (product == null) {
            throw new NotFoundException();
        }
        return product;
    }

    public void deleteProduct(String id) {
        Menu product = productRepository.findOne(id);
        if (product == null) {
            throw new NotFoundException();
        } else {
            productRepository.delete(id);
            productDeletedMessageChannel.send(MessageBuilder.withPayload(product).build());
        }
    }
}