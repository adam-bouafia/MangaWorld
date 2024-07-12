package it.univaq.sose.mangastoreorderservice.controller;

import it.univaq.sose.mangastoreorderservice.service.CartItemService;
import it.univaq.sose.mangastoreorderservice.web.CartItemRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
*
 */
/**
 * The controller class for managing cart items.
 */
@RestController
@CrossOrigin
public class CartItemController {

    @Autowired
    CartItemService cartItemService;
    
    /**
     * Adds a cart item.
     * 
     * @param cartItemRequest The request object containing the cart item details.
     */
    @PostMapping("/cart/cartItem")
    @ResponseStatus(value = HttpStatus.OK)
    public void addCartItem(@RequestBody CartItemRequest cartItemRequest) {
        cartItemService.addCartItem(cartItemRequest);
    }
    
    /**
     * Removes a cart item.
     * 
     * @param cartItemId The ID of the cart item to be removed.
     */
    @DeleteMapping("/cart/cartItem/{cartItemId}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void removeCartItem(@PathVariable(value = "cartItemId") String cartItemId) {
        cartItemService.removeCartItem(cartItemId);
    }
    
    /**
     * Removes all cart items from a cart.
     * 
     * @param cartId The ID of the cart from which all cart items should be removed.
     */
    @DeleteMapping("/cart/cartItem")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void removeAllCartItems(@RequestParam(value = "cartId") String cartId) {
        cartItemService.removeAllCartItems(cartId);
    }
    
}
