package it.univaq.sose.mangastorecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * The main class for the MangaStore Catalog Service application.
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("it.univaq.sose")
@EnableFeignClients(basePackages = "it.univaq.sose")
public class MangastoreCatalogServiceApplication {

	/**
	 * The entry point of the application.
	 *
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		SpringApplication.run(MangastoreCatalogServiceApplication.class, args);
	}

	/**
	 * Configures CORS (Cross-Origin Resource Sharing) for the application.
	 *
	 * @return The WebMvcConfigurer object with CORS configuration.
	 */
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("*").allowedOrigins("*");
			}
		};
	}
}
