package it.univaq.sose.mangastoreorderservice.service;

import it.univaq.sose.mangastoreorderservice.repository.dao.Cart;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 * Date : 2019-06-17
 */
public interface CartService {

    Cart getCart();
    
    Cart getCartByCartId(String cartId);

    String createCart();

    Cart getCartByUserName(String userName);

}
