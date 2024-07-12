/**
 * Represents a request to create a payment.
 * Contains information about the amount, currency, and payment method ID.
 * 
 * @author Adam Bouafia
 * @date 29-06-2024
 */
package it.univaq.sose.mangastorecommons.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
@author Adam Bouafia, Date : 29-06-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePaymentRequest {
    private int amount;
    private String currency;
    private String paymentMethodId;

}
