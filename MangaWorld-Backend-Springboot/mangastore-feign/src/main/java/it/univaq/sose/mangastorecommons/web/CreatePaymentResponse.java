/**
 * Represents a response object for creating a payment.
 * Contains information about the payment ID, payment date, capture status, and receipt URL.
 *
 * @author Adam Bouafia
 * @date 29-06-2024
 */
package it.univaq.sose.mangastorecommons.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreatePaymentResponse {
    private String paymentId;
    private LocalDateTime paymentDate;
    private boolean captured;
    private String receipt_url;
}
