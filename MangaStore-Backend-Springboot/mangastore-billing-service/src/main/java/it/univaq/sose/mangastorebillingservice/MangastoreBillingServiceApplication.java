package it.univaq.sose.mangastorebillingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"it.univaq.sose"})
@EnableFeignClients(basePackages = {"it.univaq.sose"})
@EnableDiscoveryClient
public class MangastoreBillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangastoreBillingServiceApplication.class, args);
	}

}

