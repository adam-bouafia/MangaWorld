package it.univaq.sose.mangastoreorderservice.web;

import it.univaq.sose.mangastoreorderservice.repository.dao.OrderBillingAddress;
import it.univaq.sose.mangastoreorderservice.repository.dao.OrderItem;
import it.univaq.sose.mangastoreorderservice.repository.dao.OrderShippingAddress;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 * 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateOrderResponse {
    private String orderId;
    private List<OrderItem> orderItems = new ArrayList<>();
    private OrderShippingAddress shippingAddress;
    private OrderBillingAddress billingAddress;
    private Card card;
    /**
     * Represents the response object for creating an order.
     * Contains the total price of the items in the order.
     */
    private Double itemsTotalPrice;
    private Double taxPrice;
    private Double shippingPrice;
    private Double totalPrice;
    private boolean isPaid;
    private LocalDateTime paymentDate;
    private boolean isDelivered;
    private String paymentReceiptUrl;
    private LocalDateTime deliveredDate;
    private Instant created_at;
}
