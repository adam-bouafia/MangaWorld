/**
 * Represents a payment card used for transactions.
 * 
 * This class provides information about the payment method ID, card brand, and last 4 digits of the card.
 * 
 * @author Adam Bouafia
 * @date 29-06-2024
 */
package it.univaq.sose.mangastoreorderservice.web;

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
    private String paymentMethodId;
    private String cardBrand;
    private String last4Digits;
}
