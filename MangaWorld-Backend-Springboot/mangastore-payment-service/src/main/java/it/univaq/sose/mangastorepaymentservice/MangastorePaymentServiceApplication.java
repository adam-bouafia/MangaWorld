package it.univaq.sose.mangastorepaymentservice;

import com.stripe.Stripe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
@SpringBootApplication
@ComponentScan(basePackages = {"it.univaq.sose"})
@EnableFeignClients(basePackages = {"it.univaq.sose"})
@EnableDiscoveryClient
public class MangastorePaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MangastorePaymentServiceApplication.class, args);
		Stripe.apiKey = "sk_test_51HyGx6G9R9y827ntfKTizO243LzKHnaNIucO8i7apU0zuTIE5iNAes6l64aoWczGwiCnnBNsvvrgS95nfpbWa2cw00FnScmrhd";
	}

}

