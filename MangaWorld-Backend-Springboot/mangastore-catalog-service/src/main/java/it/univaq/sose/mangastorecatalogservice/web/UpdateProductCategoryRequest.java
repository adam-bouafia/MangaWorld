package it.univaq.sose.mangastorecatalogservice.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Represents a request to update a product category.
 * Contains the necessary information for updating a product category, such as the category ID, name, and description.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductCategoryRequest {

    /**
     * The ID of the product category to be updated.
     */
    @NotNull(message = "productCategoryId should not be null!")
    @NotEmpty(message = "productCategoryId should not be empty!")
    private String productCategoryId;

    /**
     * The new name of the product category.
     */
    @NotNull(message = "productCategoryName should not be null!")
    @NotEmpty(message = "productCategoryName should not be empty!")
    private String productCategoryName;

    /**
     * The new description of the product category.
     */
    private String description;

}
