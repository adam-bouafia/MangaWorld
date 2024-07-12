package it.univaq.sose.mangastorepaymentservice.service;

import it.univaq.sose.mangastorepaymentservice.web.CreatePaymentRequest;
import it.univaq.sose.mangastorepaymentservice.web.CreatePaymentResponse;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
public interface PaymentsService {
    CreatePaymentResponse createPaymentRequest(CreatePaymentRequest createPaymentRequest);
}
