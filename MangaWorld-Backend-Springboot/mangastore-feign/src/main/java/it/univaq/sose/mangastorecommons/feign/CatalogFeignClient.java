package it.univaq.sose.mangastorecommons.feign;

import it.univaq.sose.mangastorecommons.web.GetProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 * Date : 2019-06-03
 */
@FeignClient("mangastore-catalog-service")
public interface CatalogFeignClient {

    @GetMapping("/product/{productId}")
    GetProductResponse getProduct(@PathVariable("productId") String productId);

}
