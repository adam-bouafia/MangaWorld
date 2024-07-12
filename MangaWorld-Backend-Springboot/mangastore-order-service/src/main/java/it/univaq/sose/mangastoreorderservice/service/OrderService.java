package it.univaq.sose.mangastoreorderservice.service;

import it.univaq.sose.mangastoreorderservice.web.CreateOrderRequest;
import it.univaq.sose.mangastoreorderservice.web.CreateOrderResponse;
import it.univaq.sose.mangastoreorderservice.web.PreviewOrderRequest;
import it.univaq.sose.mangastoreorderservice.web.PreviewOrderResponse;

import java.util.List;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 * Date : 2019-09-20
 */
public interface OrderService {

    CreateOrderResponse createOrder(CreateOrderRequest createOrderRequest);

    PreviewOrderResponse previewOrder(PreviewOrderRequest previewOrderRequest);

    CreateOrderResponse getOrderById(String orderId);

    List<CreateOrderResponse> getMyOrders();

    List<CreateOrderResponse> getAllOrders();
}
