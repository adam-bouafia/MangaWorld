package it.univaq.sose.mangastoreorderservice.service.impl;

import it.univaq.sose.mangastoreorderservice.repository.dao.Cart;
import it.univaq.sose.mangastoreorderservice.repository.dao.CartItem;
import it.univaq.sose.mangastoreorderservice.repository.CartRepository;
import it.univaq.sose.mangastoreorderservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
*
 */
/**
 * This class implements the CartService interface and provides the functionality
 * to manage user shopping carts.
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart getCart() {
    
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = (String) authentication.getPrincipal();
    
        Cart cartByUserName = cartRepository.findCartByUserName(userName);

        synchronized (CartServiceImpl.class){
            if (cartByUserName == null) {
                createCart();
                cartByUserName = cartRepository.findCartByUserName(userName);
            }
        }
    
        double totalPrice = cartByUserName.getCartItems()
                                          .stream()
                                          .mapToDouble(CartItem::getExtendedPrice)
                                          .sum();
    
        cartByUserName.setTotalPrice(totalPrice);
    
        return cartByUserName;
    }
    
    @Override
    public Cart getCartByCartId(String cartId) {
        Optional<Cart> byCartId = cartRepository.findByCartId(cartId);
        return byCartId.orElseThrow(() -> new RuntimeException("Cart doesn't exist!!"));
    }

    @Override
    public String createCart() {

        //Get the userName from the token.
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = (String) authentication.getPrincipal();

        Cart cartByUserName = cartRepository.findCartByUserName(userName);

        if (cartByUserName != null) {
            return cartByUserName.getCartId();
        }

        Cart cart = Cart.builder()
                .cartItems(new ArrayList<>())
                .userName(userName)
                .build();

        Cart savedCart = cartRepository.save(cart);

        return savedCart.getCartId();

    }


    public Cart getCartByUserName(String userName) {

        Cart cartByUserName = cartRepository.findCartByUserName(userName);
        return cartByUserName;
    }
}
