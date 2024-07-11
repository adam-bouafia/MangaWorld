package it.univaq.sose.mangastoreeurekadiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: Adam Bouafia,

 */
@SpringBootApplication
@EnableEurekaServer
public class MangastoreEurekaDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangastoreEurekaDiscoveryServiceApplication.class, args);
	}

}
