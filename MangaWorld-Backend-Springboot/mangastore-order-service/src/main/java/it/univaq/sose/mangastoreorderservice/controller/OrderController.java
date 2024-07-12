package it.univaq.sose.mangastoreorderservice.controller;

import it.univaq.sose.mangastoreorderservice.web.CreateOrderRequest;
import it.univaq.sose.mangastoreorderservice.service.OrderService;
import it.univaq.sose.mangastoreorderservice.web.CreateOrderResponse;
import it.univaq.sose.mangastoreorderservice.web.PreviewOrderRequest;
import it.univaq.sose.mangastoreorderservice.web.PreviewOrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * The OrderController class handles HTTP requests related to orders.
 */
@RestController
public class OrderController {
    
    @Autowired
    OrderService orderService;
    
    /**
     * Creates a new order.
     * 
     * @param createOrderRequest The request object containing the order details.
     * @return The response object containing the created order details.
     */
    @PostMapping("/order")
    public ResponseEntity<CreateOrderResponse> createOrder(@RequestBody @Valid CreateOrderRequest createOrderRequest) {

        CreateOrderResponse createOrderResponse = orderService.createOrder(createOrderRequest);
        return ResponseEntity.ok(createOrderResponse);
    }

    /**
     * Retrieves an order by its ID.
     * 
     * @param orderId The ID of the order to retrieve.
     * @return The response object containing the order details.
     */
    @GetMapping("/order/{orderId}")
    public ResponseEntity<CreateOrderResponse> getOrderById(@PathVariable("orderId") String orderId) {

        CreateOrderResponse createOrderResponse = orderService.getOrderById(orderId);
        return ResponseEntity.ok(createOrderResponse);
    }

    /**
     * Retrieves all orders for the current user.
     * 
     * @return The response object containing the list of orders.
     */
    @GetMapping("/order/myorders")
    public ResponseEntity<List<CreateOrderResponse>> getMyOrders() {

        List<CreateOrderResponse> createOrderResponse = orderService.getMyOrders();
        return ResponseEntity.ok(createOrderResponse);
    }

    /**
     * Retrieves all orders.
     * Only accessible by users with the 'ADMIN_USER' authority.
     * 
     * @return The response object containing the list of orders.
     */
    @GetMapping("/orders")
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public ResponseEntity<List<CreateOrderResponse>> getAllOrders() {
        List<CreateOrderResponse> createOrderResponse = orderService.getAllOrders();
        return ResponseEntity.ok(createOrderResponse);
    }

    /**
     * Previews an order before creating it.
     * 
     * @param previewOrderRequest The request object containing the order details to preview.
     * @return The response object containing the previewed order details.
     */
    @PostMapping("/previewOrder")
    public ResponseEntity<PreviewOrderResponse> previewOrder(@RequestBody @Valid PreviewOrderRequest previewOrderRequest) {

        PreviewOrderResponse previewOrderResponse = orderService.previewOrder(previewOrderRequest);

        return ResponseEntity.ok(previewOrderResponse);
    }
}
