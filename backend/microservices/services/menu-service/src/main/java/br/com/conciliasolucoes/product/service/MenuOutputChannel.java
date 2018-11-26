package br.com.conciliasolucoes.product.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


public interface MenuOutputChannel {

    String PRODUCT_DELETED_OUTPUT = "productDeletedOutput";

    String PRODUCT_UPDATED_OUTPUT = "productUpdatedOutput";

    @Output(PRODUCT_DELETED_OUTPUT)
    MessageChannel productDeletedOutput();

    @Output(PRODUCT_UPDATED_OUTPUT)
    MessageChannel productUpdatedOutput();
}