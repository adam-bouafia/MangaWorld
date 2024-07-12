package it.univaq.sose.mangastoreorderservice.repository;

import it.univaq.sose.mangastoreorderservice.repository.dao.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * The OrderRepository interface is responsible for providing CRUD operations for the Order entity.
 * It extends the CrudRepository interface, which provides basic CRUD functionality.
 */
public interface OrderRepository extends CrudRepository<Order, String> {

    /**
     * Finds an order by its orderId.
     *
     * @param orderId the orderId of the order to find
     * @return the found order, or null if no order is found
     */
    Order findByOrderId(String orderId);

    /**
     * Finds a list of orders by userId.
     *
     * @param userId the userId of the orders to find
     * @return a list of orders with the given userId
     */
    List<Order> findByUserId(String userId);
}
