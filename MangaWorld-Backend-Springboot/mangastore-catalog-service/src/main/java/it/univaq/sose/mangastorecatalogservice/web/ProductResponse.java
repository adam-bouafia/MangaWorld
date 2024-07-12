/**
 * Represents a response object for a product.
 * Contains information about a product, such as its ID, name, description, price, category, availability, ratings, and image ID.
 * This class is used to transfer product data between the backend and frontend of the MangaStore application.
 *
 * @author Adam Bouafia
 * @date 29-06-2024
 */
package it.univaq.sose.mangastorecatalogservice.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    private String productId;
    private String productName;
    private String description;
    private double price;
    private String productCategory;
    private int availableItemCount;
    private Double averageRating;
    private int noOfRatings;
    private String imageId;

}
