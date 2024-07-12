package it.univaq.sose.mangastoreorderservice.service;

import it.univaq.sose.mangastoreorderservice.repository.dao.CartItem;
import it.univaq.sose.mangastoreorderservice.web.CartItemRequest;

/**
 * This interface represents the service for managing cart items in the MangaStore order service.
 * It provides methods for adding, removing, and retrieving cart items.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
public interface CartItemService {

    /**
     * Adds a cart item based on the provided cart item request.
     * 
     * @param cartItemRequest The cart item request containing the details of the cart item to be added.
     */
    void addCartItem(CartItemRequest cartItemRequest);

    /**
     * Removes a cart item with the specified cart item ID.
     * 
     * @param cartItemId The ID of the cart item to be removed.
     */
    void removeCartItem(String cartItemId);

    /**
     * Retrieves a cart item with the specified cart item ID.
     * 
     * @param cartItemId The ID of the cart item to be retrieved.
     * @return The cart item with the specified ID, or null if not found.
     */
    CartItem getCartItem(String cartItemId);

    /**
     * Removes all cart items associated with the specified cart ID.
     * 
     * @param cartId The ID of the cart for which all cart items should be removed.
     */
    void removeAllCartItems(String cartId);

}
