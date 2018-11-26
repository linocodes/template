package br.com.conciliasolucoes.shoppinglist.api;

import br.com.conciliasolucoes.commons.api.provider.*;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Jersey configuration.
 *
 * @author cassiomolin
 */
@Component
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        registerResources();
        registerProviders();
    }

    private void registerResources() {
        register(ShoppingListResource.class);
    }

    private void registerProviders() {
        register(ObjectMapperContextResolver.class);
        register(ConstraintViolationExceptionMapper.class);
        register(GenericExceptionMapper.class);
        register(JsonMappingExceptionMapper.class, 1);
        register(JsonParseExceptionMapper.class, 1);
    }
}