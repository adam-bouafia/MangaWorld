package it.univaq.sose.mangastorecommons.feign;

import it.univaq.sose.mangastorecommons.web.GetAddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
@FeignClient("mangastore-billing-service")
public interface BillingFeignClient {

    @GetMapping("/address/{addressId}")
    GetAddressResponse getAddressById(@PathVariable("addressId") String addressId);

}
