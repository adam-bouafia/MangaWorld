package it.univaq.sose.mangastoreorderservice.service;

import it.univaq.sose.mangastoreorderservice.repository.dao.CartItem;
import it.univaq.sose.mangastoreorderservice.web.CartItemRequest;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 * Date : 2019-06-17
 */
public interface CartItemService {

    void addCartItem(CartItemRequest cartItemRequest);
    void removeCartItem(String cartItemId);
    CartItem getCartItem(String cartItemId);
    void removeAllCartItems(String cartId);

}
