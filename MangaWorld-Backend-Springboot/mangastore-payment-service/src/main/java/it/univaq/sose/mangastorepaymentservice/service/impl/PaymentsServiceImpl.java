package it.univaq.sose.mangastorepaymentservice.service.impl;

import it.univaq.sose.mangastorecommons.exception.RunTimeExceptionPlaceHolder;
import it.univaq.sose.mangastorepaymentservice.repository.UserPaymentCustomerRepository;
import it.univaq.sose.mangastorepaymentservice.repository.dao.UserPaymentCustomer;
import it.univaq.sose.mangastorepaymentservice.service.PaymentsService;
import it.univaq.sose.mangastorepaymentservice.web.CreatePaymentRequest;
import it.univaq.sose.mangastorepaymentservice.web.CreatePaymentResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.PaymentIntent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TimeZone;

import static it.univaq.sose.mangastorecommons.util.CommonUtilityMethods.getUserIdFromToken;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
@Service
public class PaymentsServiceImpl implements PaymentsService {

    @Autowired
    private UserPaymentCustomerRepository userPaymentCustomerRepository;

    @Override
    public CreatePaymentResponse createPaymentRequest(CreatePaymentRequest createPaymentRequest) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userIdFromToken = getUserIdFromToken(authentication);
        UserPaymentCustomer customer = userPaymentCustomerRepository.findByUserId(userIdFromToken);

        Map<String, Object> params = new HashMap<>();
        params.put("amount", createPaymentRequest.getAmount());
        params.put("currency", createPaymentRequest.getCurrency());
        params.put("payment_method", createPaymentRequest.getPaymentMethodId());
        params.put("customer", customer.getPaymentCustomerId());
        params.put("confirm", true);

        try {
            PaymentIntent paymentIntent = PaymentIntent.create(params);
            CreatePaymentResponse createPaymentResponse = new CreatePaymentResponse();

            Optional<Charge> paidRecord = paymentIntent.getCharges().getData().stream().filter(Charge::getPaid).findAny();

            if (paidRecord.isPresent()) {
                createPaymentResponse.setPaymentId(paidRecord.get().getId());
                LocalDateTime paymentTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(paidRecord.get().getCreated()), TimeZone.getDefault().toZoneId());
                createPaymentResponse.setPaymentDate(paymentTime);
                createPaymentResponse.setCaptured(true);
                createPaymentResponse.setReceipt_url(paidRecord.get().getReceiptUrl());
                return createPaymentResponse;
            } else {
                createPaymentResponse.setCaptured(false);
                return createPaymentResponse;
            }

        } catch (StripeException e) {
            e.printStackTrace();
            throw new RunTimeExceptionPlaceHolder("Error while doing payment!!");
        }

    }
}
