/**
 * Represents a response object containing information about a product.
 * This class is used to transfer product data from the backend to the frontend.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
package it.univaq.sose.mangastorecommons.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
*
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetProductResponse {

    private String productId;
    private String productName;
    private String description;
    private double price;
    private String productCategory;
    private int availableItemCount;

}
