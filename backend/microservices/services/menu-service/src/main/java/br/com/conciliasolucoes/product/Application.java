package br.com.conciliasolucoes.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

import br.com.conciliasolucoes.product.service.MenuOutputChannel;


@SpringBootApplication
@EnableDiscoveryClient
//@EnableBinding({ProductOutputChannel.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}