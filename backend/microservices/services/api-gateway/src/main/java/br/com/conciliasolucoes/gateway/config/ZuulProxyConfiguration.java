package br.com.conciliasolucoes.gateway.config;

import br.com.conciliasolucoes.gateway.filter.CustomLocationRewriteFilter;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Zuul configuration.
 *
 * @author cassiomolin
 */
@Configuration
@EnableZuulProxy
public class ZuulProxyConfiguration {

    @Bean
    public CustomLocationRewriteFilter locationRewriteFilter() {
        return new CustomLocationRewriteFilter();
    }
}
