package it.univaq.sose.mangastorecommons.feign;

import it.univaq.sose.mangastorecommons.web.GetProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * This interface represents the Feign client for the Catalog service in the MangaStore application.
 * It provides methods to interact with the Catalog service.
 */
@FeignClient("mangastore-catalog-service")
public interface CatalogFeignClient {

    /**
     * Retrieves the product information from the Catalog service based on the given product ID.
     *
     * @param productId the ID of the product to retrieve
     * @return the response containing the product information
     */
    @GetMapping("/product/{productId}")
    GetProductResponse getProduct(@PathVariable("productId") String productId);

}
