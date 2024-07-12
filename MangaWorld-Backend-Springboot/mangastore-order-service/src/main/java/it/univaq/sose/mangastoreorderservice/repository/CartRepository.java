package it.univaq.sose.mangastoreorderservice.repository;

import it.univaq.sose.mangastoreorderservice.repository.dao.Cart;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * This interface represents the repository for managing Cart entities.
 * It extends the CrudRepository interface, providing basic CRUD operations for Cart objects.
 */
@Transactional
public interface CartRepository extends CrudRepository<Cart, String> {

    /**
     * Finds a Cart entity by the given userName.
     *
     * @param userName the userName to search for
     * @return the Cart entity with the given userName, or null if not found
     */
    Cart findCartByUserName(String userName);

    /**
     * Finds a Cart entity by the given cartId.
     *
     * @param cartId the cartId to search for
     * @return an Optional containing the Cart entity with the given cartId, or an empty Optional if not found
     */
    Optional<Cart> findByCartId(String cartId);
}
