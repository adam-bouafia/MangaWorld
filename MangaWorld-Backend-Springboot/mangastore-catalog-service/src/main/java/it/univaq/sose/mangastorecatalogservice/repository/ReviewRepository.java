package it.univaq.sose.mangastorecatalogservice.repository;

import it.univaq.sose.mangastorecatalogservice.repository.dao.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * This interface represents the repository for managing Review entities.
 * It extends the JpaRepository interface to inherit basic CRUD operations.
 */
@Repository
public interface ReviewRepository extends JpaRepository<Review, String> {

    /**
     * Finds a review by the given user ID and product ID.
     *
     * @param userId    the ID of the user
     * @param productId the ID of the product
     * @return an Optional containing the review, or an empty Optional if not found
     */
    Optional<Review> findByUserIdAndProductId(String userId, String productId);

    /**
     * Finds all reviews for a given product ID.
     *
     * @param productId the ID of the product
     * @return an Optional containing a list of reviews, or an empty Optional if not found
     */
    Optional<List<Review>> findAllByProductId(String productId);

    /**
     * Counts the number of reviews for a given product ID.
     *
     * @param productId the ID of the product
     * @return the number of reviews
     */
    long countAllByProductId(String productId);
}
