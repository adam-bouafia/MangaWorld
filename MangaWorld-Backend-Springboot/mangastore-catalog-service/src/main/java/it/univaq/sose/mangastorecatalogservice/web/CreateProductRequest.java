package it.univaq.sose.mangastorecatalogservice.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Represents a request to create a product.
 * Contains information such as product name, description, price, image ID, category ID, and available item count.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {

    /**
     * The name of the product.
     */
    @NotNull(message = "productName should not be null!")
    @NotEmpty(message = "productName should not be empty!")
    private String productName;

    /**
     * The description of the product.
     */
    private String description;

    /**
     * The price of the product.
     */
    @Min(value = 0)
    private double price;

    /**
     * The ID of the image associated with the product.
     */
    private String imageId;

    /**
     * The ID of the category to which the product belongs.
     */
    @NotNull(message = "productCategoryId should not be null!")
    @NotEmpty(message = "productCategoryId should not be empty!")
    private String productCategoryId;

    /**
     * The number of available items for the product.
     */
    private int availableItemCount;

}
