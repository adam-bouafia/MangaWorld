package it.univaq.sose.mangastoreorderservice.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Represents a request for a cart item.
 * 
 * This class is used to encapsulate the information required to add an item to a cart.
 * It contains the product ID and the quantity of the item to be added.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartItemRequest {
    
    /**
     * The ID of the product to be added to the cart.
     */
    @NotNull(message = "productId should not be null!")
    @NotEmpty(message = "productId should not be empty!")
    private String productId;

    /**
     * The quantity of the product to be added to the cart.
     * It should be greater than 0.
     */
    @Min(message = "quantity should be greater than 0", value = 1)
    private Integer quantity;
    
}
