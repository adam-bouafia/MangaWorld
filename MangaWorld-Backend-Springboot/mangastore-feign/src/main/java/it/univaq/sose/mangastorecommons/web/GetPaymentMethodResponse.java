/**
 * Represents the response object for retrieving payment methods.
 * Contains information about a specific payment method.
 *
 * @author Adam Bouafia
 * @date 29-06-2024
 */
package it.univaq.sose.mangastorecommons.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetPaymentMethodResponse {

    private String paymentMethodId;
    private String cardType;
    private String cardLast4Digits;
    private Long cardExpirationMonth;
    private Long cardExpirationYear;
    private String cardCountry;

}
