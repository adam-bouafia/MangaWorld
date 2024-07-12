/**
 * The main class for the MangaStore Order Service application.
 * This class is responsible for starting the application and configuring the necessary components.
 * It enables Feign clients, Eureka client, and scans the base packages for component scanning.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
package it.univaq.sose.mangastoreorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
*
 */
@SpringBootApplication(scanBasePackages = {"it.univaq.sose.mangastorecommons"})
@ComponentScan(basePackages = {"it.univaq.sose"})
//, excludeFilters={
//		@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, value=GlobalSecurityConfig.class)})
@EnableFeignClients(value = "it.univaq.sose")
@EnableEurekaClient
public class MangastoreOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangastoreOrderServiceApplication.class, args);
    }

}
