package it.univaq.sose.mangastoreorderservice.repository;

import it.univaq.sose.mangastoreorderservice.repository.dao.OrderShippingAddress;
import org.springframework.data.repository.CrudRepository;

/**
 * This interface represents the repository for managing order shipping addresses.
 * It extends the CrudRepository interface, providing basic CRUD operations for the OrderShippingAddress entity.
 * 
 * @author Adam Bouafia
 * @date 29-06-2024
 */
public interface OrderShippingAddressRepository extends CrudRepository<OrderShippingAddress, String> {
    /**
     * Finds an order shipping address by its order ID.
     * 
     * @param orderId the ID of the order
     * @return the order shipping address associated with the given order ID, or null if not found
     */
    OrderShippingAddress findByOrderId(String orderId);
}
