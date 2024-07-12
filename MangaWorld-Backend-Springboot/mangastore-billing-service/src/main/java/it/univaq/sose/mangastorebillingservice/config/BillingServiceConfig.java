package it.univaq.sose.mangastorebillingservice.config;

import feign.Logger;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 * 
 */
/**
 * Configuration class for the billing service.
 */
@Configuration
public class BillingServiceConfig {
    
    /**
     * Configures the Feign logger level.
     * @return The logger level.
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
    
    /**
     * Configures the RestTemplate with load balancing support.
     * @return The configured RestTemplate.
     */
    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
}
