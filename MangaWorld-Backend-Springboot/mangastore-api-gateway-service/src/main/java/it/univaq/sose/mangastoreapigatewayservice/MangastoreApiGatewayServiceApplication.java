package it.univaq.sose.mangastoreapigatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author: Adam Bouafia, Date : 07-01-2024

 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class MangastoreApiGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangastoreApiGatewayServiceApplication.class, args);
	}

}