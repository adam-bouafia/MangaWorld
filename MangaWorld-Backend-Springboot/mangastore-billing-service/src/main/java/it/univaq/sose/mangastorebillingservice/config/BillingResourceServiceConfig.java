package it.univaq.sose.mangastorebillingservice.config;

import it.univaq.sose.mangastorecommons.security.GlobalResourceServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

/**
 * Configuration class for the billing resource service.
 * Extends the GlobalResourceServerConfig class to configure the resource server.
 */
@Configuration
public class BillingResourceServiceConfig extends GlobalResourceServerConfig {
    
    @Autowired
    private ResourceServerTokenServices tokenServices;
    
    /**
     * Configures the resource server security.
     * Sets the resource ID and token services for the resources.
     * 
     * @param resources the ResourceServerSecurityConfigurer object to configure the resource server security
     */
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.resourceId("web").tokenServices(tokenServices);
    }
    
}
