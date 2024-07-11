package it.univaq.sose.mangastoreorderservice.repository;

import it.univaq.sose.mangastoreorderservice.repository.dao.Cart;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 * Date : 2019-07-08
 */
@Transactional
public interface CartRepository extends CrudRepository<Cart, String> {

    Cart findCartByUserName(String userName);

    Optional<Cart> findByCartId(String cartId);
}
