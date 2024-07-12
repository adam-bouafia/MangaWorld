package it.univaq.sose.mangastorecatalogservice.controller;

import it.univaq.sose.mangastorecatalogservice.repository.dao.Review;
import it.univaq.sose.mangastorecatalogservice.service.ReviewService;
import it.univaq.sose.mangastorecatalogservice.web.CreateOrUpdateReviewRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * The ReviewController class handles HTTP requests related to reviews.
 * It provides endpoints for creating or updating a review, and retrieving all reviews for a product.
 *
 * @author Adam Bouafia
 * @date 29-06-2024
 */
@RestController
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    /**
     * Endpoint for creating or updating a review.
     *
     * @param createOrUpdateReviewRequest The request object containing the review details.
     * @return ResponseEntity with no content if the review is created or updated successfully.
     */
    @PostMapping("/review")
    public ResponseEntity<?> createOrUpdateReview(@RequestBody @Valid CreateOrUpdateReviewRequest createOrUpdateReviewRequest) {
        reviewService.createOrUpdateReview(createOrUpdateReviewRequest);
        return ResponseEntity.ok().build();
    }

    /**
     * Endpoint for retrieving all reviews for a product.
     *
     * @param productId The ID of the product.
     * @return ResponseEntity with a list of Review objects representing the reviews for the product.
     */
    @GetMapping("/review")
    public ResponseEntity<?> getAllReviewsForProduct(@RequestParam("productId") String productId) {
        List<Review> reviewsForProduct = reviewService.getReviewsForProduct(productId);
        return ResponseEntity.ok(reviewsForProduct);
    }
}
