package it.univaq.sose.mangastorecatalogservice.service;

import it.univaq.sose.mangastorecatalogservice.repository.dao.Review;
import it.univaq.sose.mangastorecatalogservice.web.CreateOrUpdateReviewRequest;

import java.util.List;

/**
 * The ReviewService interface provides methods to create or update reviews and retrieve reviews for a product.
 * This interface is implemented by classes that provide the actual implementation of these methods.
 * 
 * @author Adam Bouafia
 * @date 29-06-2024
 */
public interface ReviewService {

    /**
     * Creates or updates a review based on the provided request.
     * 
     * @param createOrUpdateReviewRequest The request object containing the review details.
     */
    void createOrUpdateReview(CreateOrUpdateReviewRequest createOrUpdateReviewRequest);

    /**
     * Retrieves a list of reviews for a specific product.
     * 
     * @param productId The ID of the product for which to retrieve the reviews.
     * @return A list of Review objects representing the reviews for the product.
     */
    List<Review> getReviewsForProduct(String productId);

}
