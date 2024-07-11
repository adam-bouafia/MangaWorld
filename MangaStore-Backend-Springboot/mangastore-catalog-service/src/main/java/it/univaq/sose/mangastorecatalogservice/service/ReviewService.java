package it.univaq.sose.mangastorecatalogservice.service;

import it.univaq.sose.mangastorecatalogservice.repository.dao.Review;
import it.univaq.sose.mangastorecatalogservice.web.CreateOrUpdateReviewRequest;

import java.util.List;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
public interface ReviewService {

    void createOrUpdateReview(CreateOrUpdateReviewRequest createOrUpdateReviewRequest);

    List<Review> getReviewsForProduct(String productId);

}
