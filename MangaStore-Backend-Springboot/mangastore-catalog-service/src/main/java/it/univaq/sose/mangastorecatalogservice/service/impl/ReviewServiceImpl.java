package it.univaq.sose.mangastorecatalogservice.service.impl;

import it.univaq.sose.mangastorecatalogservice.repository.ReviewRepository;
import it.univaq.sose.mangastorecatalogservice.repository.dao.Review;
import it.univaq.sose.mangastorecatalogservice.service.ProductService;
import it.univaq.sose.mangastorecatalogservice.service.ReviewService;
import it.univaq.sose.mangastorecatalogservice.web.CreateOrUpdateReviewRequest;
import it.univaq.sose.mangastorecatalogservice.web.ProductResponse;
import it.univaq.sose.mangastorecommons.feign.AccountFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static it.univaq.sose.mangastorecommons.util.CommonUtilityMethods.getUserIdFromToken;
import static it.univaq.sose.mangastorecommons.util.CommonUtilityMethods.getUserNameFromToken;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    AccountFeignClient accountFeignClient;

    @Autowired
    ProductService productService;

    @Override
    public void createOrUpdateReview(CreateOrUpdateReviewRequest createOrUpdateReviewRequest) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userIdFromToken = getUserIdFromToken(authentication);
        String userNameFromToken = getUserNameFromToken(authentication);

        //check whether product exists.
        ProductResponse product = productService.getProduct(createOrUpdateReviewRequest.getProductId());
        if (product == null) {
            throw new RuntimeException("Product doesn't exist!");
        }

        Optional<Review> review = reviewRepository.findByUserIdAndProductId(userIdFromToken, createOrUpdateReviewRequest.getProductId());

        if (review.isPresent()) {
            Review updatedReview = review.get();
            updatedReview.setRatingValue(createOrUpdateReviewRequest.getRatingValue());
            updatedReview.setReviewMessage(createOrUpdateReviewRequest.getReviewMessage());
            reviewRepository.save(updatedReview);
        } else {
            Review newReview = Review.builder()
                    .reviewMessage(createOrUpdateReviewRequest.getReviewMessage())
                    .ratingValue(createOrUpdateReviewRequest.getRatingValue())
                    .userId(userIdFromToken)
                    .userName(userNameFromToken)
                    .productId(createOrUpdateReviewRequest.getProductId())
                    .build();
            reviewRepository.save(newReview);
        }
    }

    @Override
    public List<Review> getReviewsForProduct(String productId) {

        Optional<List<Review>> reviewsForProduct = reviewRepository.findAllByProductId(productId);
        return reviewsForProduct.orElseGet(ArrayList::new);

    }
}
