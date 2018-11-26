package br.com.conciliasolucoes.product.api.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;


public class CreateOrUpdateProductPayload {

    @NotNull
    @NotBlank
    private String name;

    public String getName() {
        return name;
    }

    public CreateOrUpdateProductPayload setName(String name) {
        this.name = name;
        return this;
    }
}
