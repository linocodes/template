package br.com.conciliasolucoes.product.api.model;


public class QueryProductResult {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public QueryProductResult setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public QueryProductResult setName(String name) {
        this.name = name;
        return this;
    }
}
