/**
 * Represents a request to create a product category.
 * This class contains the necessary information for creating a new product category.
 * It includes the name and description of the product category.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
package it.univaq.sose.mangastorecatalogservice.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductCategoryRequest {

    /**
     * The name of the product category.
     * This field is required and should not be null or empty.
     */
    @NotNull(message = "productCategoryName should not be null!")
    @NotEmpty(message = "productCategoryName should not be empty!")
    private String productCategoryName;

    /**
     * The description of the product category.
     * This field is optional.
     */
    private String description;

}
