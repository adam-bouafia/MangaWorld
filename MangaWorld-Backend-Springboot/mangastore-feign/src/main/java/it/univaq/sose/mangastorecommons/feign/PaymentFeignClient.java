package it.univaq.sose.mangastorecommons.feign;

import it.univaq.sose.mangastorecommons.web.CreatePaymentRequest;
import it.univaq.sose.mangastorecommons.web.CreatePaymentResponse;
import it.univaq.sose.mangastorecommons.web.GetPaymentMethodResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * This interface represents the Feign client for the payment service in the MangaStore application.
 * It provides methods for retrieving payment methods and making payments.
 */
@FeignClient("mangastore-payment-service")
public interface PaymentFeignClient {

    /**
     * Retrieves a payment method by its ID.
     *
     * @param paymentMethodId the ID of the payment method to retrieve
     * @return the response containing the payment method information
     */
    @GetMapping("/paymentMethod/{paymentMethodId}")
    GetPaymentMethodResponse getMyPaymentMethodById(@PathVariable("paymentMethodId") String paymentMethodId);

    /**
     * Makes a payment using the provided payment request.
     *
     * @param createPaymentRequest the request containing the payment details
     * @return the response containing the payment result
     */
    @PostMapping("/pay")
    CreatePaymentResponse doPayment(CreatePaymentRequest createPaymentRequest);
}
