package it.univaq.sose.mangastorecatalogservice.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Represents a request to create or update a review for a product.
 * Contains the necessary information for creating or updating a review.
 * This class is used by the catalog service in the MangaStore application.
 *
 * @author Adam Bouafia
 * @date 29-06-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrUpdateReviewRequest {

    /**
     * The ID of the product for which the review is being created or updated.
     */
    @NotNull(message = "productId should not be null!")
    @NotEmpty(message = "productId should not be empty!")
    private String productId;

    /**
     * The message content of the review.
     */
    private String reviewMessage;

    /**
     * The rating value of the review, ranging from 1 to 5.
     */
    @Min(value = 1)
    @Max(value = 5)
    private double ratingValue;
}
