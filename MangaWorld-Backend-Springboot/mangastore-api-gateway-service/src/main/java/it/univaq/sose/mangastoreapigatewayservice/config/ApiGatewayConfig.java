package it.univaq.sose.mangastoreapigatewayservice.config;

import brave.sampler.Sampler;
import it.univaq.sose.mangastoreapigatewayservice.filters.PostFilter;
import it.univaq.sose.mangastoreapigatewayservice.filters.PreFilter;
import it.univaq.sose.mangastoreapigatewayservice.filters.RouteFilter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Adam Bouafia, Date : 07-01-2024

 */
/**
 * Configuration class for the API Gateway.
 * This class defines the beans required for the API Gateway configuration.
 */
@Configuration
public class ApiGatewayConfig {

    @Bean
    public Sampler sampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }

}
