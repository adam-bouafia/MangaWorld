package it.univaq.sose.mangastoreorderservice.repository;

import it.univaq.sose.mangastoreorderservice.repository.dao.OrderBillingAddress;
import org.springframework.data.repository.CrudRepository;

/**
 * This interface represents the repository for managing order billing addresses.
 * It extends the CrudRepository interface, providing basic CRUD operations for the OrderBillingAddress entity.
 * 
 * @author Adam Bouafia
 * @date 29-06-2024
 */
public interface OrderBillingAddressRepository extends CrudRepository<OrderBillingAddress, String> {
    /**
     * Finds an order billing address by its order ID.
     * 
     * @param orderId the ID of the order
     * @return the order billing address associated with the given order ID, or null if not found
     */
    OrderBillingAddress findByOrderId(String orderId);
}
