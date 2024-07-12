package it.univaq.sose.mangastoreorderservice.repository;

import it.univaq.sose.mangastoreorderservice.repository.dao.CartItem;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 * 
 */

/**
 * The repository interface for managing CartItem entities.
 */
public interface CartItemRepository extends CrudRepository<CartItem, String> {

    /**
     * Deletes a cart item by its ID.
     *
     * @param cartItemId The ID of the cart item to delete.
     */
    @Modifying
    @Transactional
    void deleteByCartItemId(String cartItemId);

    /**
     * Finds a cart item by its ID.
     *
     * @param cartItemId The ID of the cart item to find.
     * @return An Optional containing the found cart item, or an empty Optional if not found.
     */
    Optional<CartItem> findByCartItemId(String cartItemId);
}
