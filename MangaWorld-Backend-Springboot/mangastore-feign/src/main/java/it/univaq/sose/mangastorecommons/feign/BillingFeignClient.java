package it.univaq.sose.mangastorecommons.feign;

import it.univaq.sose.mangastorecommons.web.GetAddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * This interface represents the Feign client for the Billing service in the MangaStore application.
 * It provides methods to interact with the Billing service's API.
 * 
 * The @FeignClient annotation specifies the name of the target service to be invoked.
 * In this case, the target service is "mangastore-billing-service".
 */
@FeignClient("mangastore-billing-service")
public interface BillingFeignClient {

    /**
     * Retrieves the address information for a given address ID.
     * 
     * @param addressId the ID of the address to retrieve
     * @return the GetAddressResponse object containing the address information
     */
    @GetMapping("/address/{addressId}")
    GetAddressResponse getAddressById(@PathVariable("addressId") String addressId);

}
