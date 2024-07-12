/**
 * This interface represents a Feign client for the mangastore-order-service.
 * It allows communication with the order service using Feign.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
package it.univaq.sose.mangastorecommons.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
@FeignClient("mangastore-order-service")
public interface OrderFeignClient {


}
