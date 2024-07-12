package it.univaq.sose.mangastorebillingservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 * 
 */
/**
 * This class represents the Swagger configuration for the billing service.
 * It enables Swagger 2 and provides the necessary configurations for generating API documentation.
 * The API documentation includes information about the REST APIs, security schemes, and authorization scopes.
 * It also defines the contact information and license details for the API.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    /**
     * The API information for the billing service.
     * It includes the title, version, contact information, and license details.
     * This information is used for generating the API documentation.
     */
    @Autowired
    ApiInfo apiInfo;
    
    /**
     * Creates an instance of ApiInfo with the necessary information for the billing service API.
     * @return The ApiInfo instance.
     */
    @Bean
    ApiInfo apiInfo() {
        return new ApiInfo(
                "Billing Service REST Api's",
                "",
                "v1",
                "",
                new Contact("Adam Bouafia", "https://github.com/adam-bouafia", "adam.bouafia@student.univaq.it"),
                "License of API", "API license URL", Collections.emptyList());
    }
    
    /**
     * Creates a Docket instance for configuring Swagger.
     * It specifies the documentation type, security schemes, security context, and API selection criteria.
     * @return The Docket instance.
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                       .securitySchemes(Arrays.asList(apiKey()))
                       .securityContexts(Collections.singletonList(securityContext()))
                       .select()
                       .apis(RequestHandlerSelectors.basePackage("it.univaq.sose"))
                       .paths(PathSelectors.any())
                       .build()
                       .apiInfo(apiInfo);
    }
    
    /**
     * Creates a SecurityContext instance for specifying the security references and path selectors.
     * @return The SecurityContext instance.
     */
    @SuppressWarnings("deprecation")
    private SecurityContext securityContext() {
        return SecurityContext.builder().securityReferences(defaultAuth()).forPaths(PathSelectors.regex("/.*")).build();
    }
    
    /**
     * Creates a list of SecurityReference instances for specifying the authorization scopes.
     * @return The list of SecurityReference instances.
     */
    private List<SecurityReference> defaultAuth() {
        final AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        final AuthorizationScope[] authorizationScopes = new AuthorizationScope[]{authorizationScope};
        return Collections.singletonList(new SecurityReference("Bearer", authorizationScopes));
    }
    
    /**
     * Creates an instance of ApiKey for specifying the security scheme.
     * @return The ApiKey instance.
     */
    private ApiKey apiKey() {
        return new ApiKey("Bearer", "Authorization", "header");
    }
    
}
