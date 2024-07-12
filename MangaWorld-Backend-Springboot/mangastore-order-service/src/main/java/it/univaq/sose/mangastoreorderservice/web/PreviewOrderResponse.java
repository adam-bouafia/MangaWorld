/**
 * Represents the response object for previewing an order.
 * Contains information about the order items, shipping and billing addresses, card details, and pricing.
 *
 * @author Adam Bouafia
 * @date 29-06-2024
 */
package it.univaq.sose.mangastoreorderservice.web;

import it.univaq.sose.mangastorecommons.web.GetAddressResponse;
import it.univaq.sose.mangastoreorderservice.repository.dao.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PreviewOrderResponse {
    private List<OrderItem> orderItems = new ArrayList<>();
    private GetAddressResponse shippingAddress;
    private GetAddressResponse billingAddress;
    private Card card;
    private Double itemsTotalPrice;
    private Double taxPrice;
    private Double shippingPrice;
    private Double totalPrice;
}
