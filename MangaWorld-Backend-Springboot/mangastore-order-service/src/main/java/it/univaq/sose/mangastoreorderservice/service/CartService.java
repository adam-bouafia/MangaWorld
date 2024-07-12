package it.univaq.sose.mangastoreorderservice.service;

import it.univaq.sose.mangastoreorderservice.repository.dao.Cart;

/**
 * The CartService interface provides methods to interact with the shopping cart functionality.
 * It allows retrieving, creating, and updating shopping carts.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
public interface CartService {

    /**
     * Retrieves the current cart.
     * 
     * @return The current cart.
     */
    Cart getCart();
    
    /**
     * Retrieves the cart with the specified cart ID.
     * 
     * @param cartId The ID of the cart to retrieve.
     * @return The cart with the specified ID.
     */
    Cart getCartByCartId(String cartId);

    /**
     * Creates a new cart.
     * 
     * @return The ID of the newly created cart.
     */
    String createCart();

    /**
     * Retrieves the cart associated with the specified user name.
     * 
     * @param userName The user name associated with the cart.
     * @return The cart associated with the specified user name.
     */
    Cart getCartByUserName(String userName);

}
