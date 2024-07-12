package it.univaq.sose.mangastorebillingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * The main class for the Mangastore Billing Service application.
 * This class is responsible for starting the Spring Boot application and configuring necessary components.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"it.univaq.sose"})
@EnableFeignClients(basePackages = {"it.univaq.sose"})
@EnableDiscoveryClient
public class MangastoreBillingServiceApplication {

	/**
	 * The entry point of the Mangastore Billing Service application.
	 * This method starts the Spring Boot application.
	 *
	 * @param args The command line arguments passed to the application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(MangastoreBillingServiceApplication.class, args);
	}

}

