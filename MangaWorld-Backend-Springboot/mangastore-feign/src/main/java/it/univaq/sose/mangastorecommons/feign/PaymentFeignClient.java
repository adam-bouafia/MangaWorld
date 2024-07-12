package it.univaq.sose.mangastorecommons.feign;

import it.univaq.sose.mangastorecommons.web.CreatePaymentRequest;
import it.univaq.sose.mangastorecommons.web.CreatePaymentResponse;
import it.univaq.sose.mangastorecommons.web.GetPaymentMethodResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
@FeignClient("mangastore-payment-service")
public interface PaymentFeignClient {

    @GetMapping("/paymentMethod/{paymentMethodId}")
    GetPaymentMethodResponse getMyPaymentMethodById(@PathVariable("paymentMethodId") String paymentMethodId);

    @PostMapping("/pay")
    CreatePaymentResponse doPayment(CreatePaymentRequest createPaymentRequest);
}
