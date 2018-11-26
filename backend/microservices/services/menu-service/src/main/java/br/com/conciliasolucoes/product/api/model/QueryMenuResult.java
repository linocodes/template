package br.com.conciliasolucoes.product.api.model;


public class QueryMenuResult {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public QueryMenuResult setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public QueryMenuResult setName(String name) {
        this.name = name;
        return this;
    }
}
