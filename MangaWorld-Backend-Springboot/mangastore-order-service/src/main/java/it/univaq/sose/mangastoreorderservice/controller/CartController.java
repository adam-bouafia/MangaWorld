package it.univaq.sose.mangastoreorderservice.controller;

import it.univaq.sose.mangastoreorderservice.web.CreateCartResponse;
import it.univaq.sose.mangastoreorderservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
*
 */
/**
 * The CartController class handles HTTP requests related to the shopping cart functionality.
 */
@RestController
@CrossOrigin
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/cart")
    @PreAuthorize("hasAuthority('STANDARD_USER') or hasAuthority('ADMIN_USER')" )
    public ResponseEntity<CreateCartResponse> createCart() {

        String cartId = cartService.createCart();

        CreateCartResponse createCartResponse = CreateCartResponse.builder()
                .cartId(cartId)
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(createCartResponse);
    }
    
    @GetMapping("/cart")
    public ResponseEntity<?> getCart(){
    
        return ResponseEntity.ok(cartService.getCart());
        
    }

}
