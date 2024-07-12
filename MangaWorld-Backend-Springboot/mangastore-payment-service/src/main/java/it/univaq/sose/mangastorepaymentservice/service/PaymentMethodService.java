package it.univaq.sose.mangastorepaymentservice.service;

import it.univaq.sose.mangastorepaymentservice.web.CreatePaymentMethodRequest;
import it.univaq.sose.mangastorepaymentservice.web.GetPaymentMethodResponse;

import java.util.List;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
public interface PaymentMethodService {
    void createPaymentMethod(CreatePaymentMethodRequest createPaymentMethodRequest);

    List<GetPaymentMethodResponse> getAllMyPaymentMethods();

    GetPaymentMethodResponse getMyPaymentMethodById(String paymentMethodId);
}
