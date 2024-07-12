package it.univaq.sose.mangastoreaccountservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

/**
 * Configuration class for the Resource Server.
 * This class extends the ResourceServerConfigurerAdapter class and provides configuration for the resource server.
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

  @Autowired
  private ResourceServerTokenServices tokenServices;

  /**
   * Configures the resource server security.
   * Sets the resource id and token services for the resource server.
   *
   * @param resources the ResourceServerSecurityConfigurer object
   * @throws Exception if an error occurs during configuration
   */
  @Override
  public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
    resources.resourceId("web").tokenServices(tokenServices);
  }

  /**
   * Configures the HTTP security for the resource server.
   * Sets up CORS, disables frame options, and configures request matchers and authorization rules.
   *
   * @param http the HttpSecurity object
   * @throws Exception if an error occurs during configuration
   */
  @Override
  public void configure(HttpSecurity http) throws Exception {
    http
        .cors()
        .and()
        .headers()
        .frameOptions()
        .disable()
        .and()
        .requestMatchers()
        .and()
        .authorizeRequests()
        .antMatchers("/actuator/**", "/api-docs/**", "/h2-console/**", "/signin", "/authorize", "/signup").permitAll()
        .antMatchers(HttpMethod.POST, "/oauth/token").permitAll()
        .antMatchers("/**").authenticated();
  }
}
