package it.univaq.sose.mangastorecommons.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
@FeignClient("mangastore-order-service")
public interface OrderFeignClient {


}
