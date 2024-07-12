package it.univaq.sose.mangastorecatalogservice.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Represents a request to update a product.
 * This class contains the information required to update a product in the catalog.
 * It includes the product ID, product name, description, price, image ID, product category ID, and available item count.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductRequest {

    /**
     * The ID of the product to be updated.
     */
    @NotNull(message = "productId should not be null!")
    @NotEmpty(message = "productId should not be empty!")
    private String productId;

    /**
     * The new name of the product.
     */
    private String productName;

    /**
     * The new description of the product.
     */
    private String description;

    /**
     * The new price of the product.
     * Must be a non-negative value.
     */
    @Min(value = 0)
    private Double price;

    /**
     * The ID of the new image for the product.
     */
    private String imageId;

    /**
     * The ID of the new product category for the product.
     */
    private String productCategoryId;

    /**
     * The new available item count for the product.
     */
    private Integer availableItemCount;

}
