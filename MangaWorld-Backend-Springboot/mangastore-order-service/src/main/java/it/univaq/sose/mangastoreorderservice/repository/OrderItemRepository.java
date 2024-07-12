/**
 * This interface represents a repository for managing order items.
 * It extends the CrudRepository interface, providing basic CRUD operations for the OrderItem entity.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
package it.univaq.sose.mangastoreorderservice.repository;

import it.univaq.sose.mangastoreorderservice.repository.dao.OrderItem;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
*
 */
public interface OrderItemRepository extends CrudRepository<OrderItem, String> {
}
