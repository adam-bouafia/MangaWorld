/**
 * Represents a request to create an order.
 * Contains information about the billing address, shipping address, and payment method.
 *
 * @author Adam Bouafia
 * @date 29-06-2024
 */
package it.univaq.sose.mangastoreorderservice.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateOrderRequest {
    private String billingAddressId;
    @NotBlank
    private String shippingAddressId;
    @NotBlank
    private String paymentMethodId;
}
