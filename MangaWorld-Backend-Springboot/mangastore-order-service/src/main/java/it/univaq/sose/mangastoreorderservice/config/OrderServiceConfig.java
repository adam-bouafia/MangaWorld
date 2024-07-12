package it.univaq.sose.mangastoreorderservice.config;

import feign.Logger;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Configuration class for the Order Service.
 */
@Configuration
public class OrderServiceConfig {

    /**
     * Creates a load-balanced RestTemplate bean.
     * @return the RestTemplate bean
     */
    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
