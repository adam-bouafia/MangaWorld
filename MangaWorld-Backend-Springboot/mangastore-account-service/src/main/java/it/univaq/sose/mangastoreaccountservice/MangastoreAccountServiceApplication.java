package it.univaq.sose.mangastoreaccountservice;

import it.univaq.sose.mangastorecommons.security.GlobalResourceServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * The main class for the MangaStore Account Service application.
 * This class is responsible for starting the application and initializing the necessary components.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"it.univaq.sose"}, excludeFilters = {
    @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = GlobalResourceServerConfig.class)})
@EnableFeignClients
@EnableDiscoveryClient
public class MangastoreAccountServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(MangastoreAccountServiceApplication.class, args);
  }

}
