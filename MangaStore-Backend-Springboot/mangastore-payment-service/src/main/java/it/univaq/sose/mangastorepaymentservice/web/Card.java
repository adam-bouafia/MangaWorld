package it.univaq.sose.mangastorepaymentservice.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String firstName;
    private String lastName;
    private String cardNumber;
    private String last4Digits;
    private int expirationMonth;
    private int expirationYear;
    private int cvv;
}
