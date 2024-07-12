package it.univaq.sose.mangastoreorderservice.service;

import it.univaq.sose.mangastoreorderservice.web.CreateOrderRequest;
import it.univaq.sose.mangastoreorderservice.web.CreateOrderResponse;
import it.univaq.sose.mangastoreorderservice.web.PreviewOrderRequest;
import it.univaq.sose.mangastoreorderservice.web.PreviewOrderResponse;

import java.util.List;

/**
 * The OrderService interface provides methods to manage orders in the MangaStore application.
 * It allows creating orders, previewing orders, retrieving orders by ID, and retrieving all orders.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
public interface OrderService {

    /**
     * Creates a new order based on the provided createOrderRequest.
     * 
     * @param createOrderRequest The request object containing the details of the order to be created.
     * @return The response object containing the result of the order creation.
     */
    CreateOrderResponse createOrder(CreateOrderRequest createOrderRequest);

    /**
     * Previews an order based on the provided previewOrderRequest.
     * 
     * @param previewOrderRequest The request object containing the details of the order to be previewed.
     * @return The response object containing the preview information of the order.
     */
    PreviewOrderResponse previewOrder(PreviewOrderRequest previewOrderRequest);

    /**
     * Retrieves an order by its ID.
     * 
     * @param orderId The ID of the order to retrieve.
     * @return The response object containing the order details.
     */
    CreateOrderResponse getOrderById(String orderId);

    /**
     * Retrieves all orders associated with the current user.
     * 
     * @return A list of response objects containing the details of the user's orders.
     */
    List<CreateOrderResponse> getMyOrders();

    /**
     * Retrieves all orders in the system.
     * 
     * @return A list of response objects containing the details of all orders.
     */
    List<CreateOrderResponse> getAllOrders();
}
