package it.univaq.sose.mangastorecatalogservice.service;

import it.univaq.sose.mangastorecatalogservice.repository.dao.ProductCategory;
import it.univaq.sose.mangastorecatalogservice.web.CreateProductCategoryRequest;
import it.univaq.sose.mangastorecatalogservice.web.UpdateProductCategoryRequest;
import javax.validation.Valid;
import org.springframework.data.domain.Page;

/**
 * This interface defines the operations for managing product categories.
 */
public interface ProductCategoryService {

  /**
   * Creates a new product category.
   *
   * @param createProductCategoryRequest The request object containing the details of the product category to be created.
   * @return The ID of the newly created product category.
   */
  String createProductCategory(@Valid CreateProductCategoryRequest createProductCategoryRequest);

  /**
   * Retrieves a product category by its ID.
   *
   * @param productCategoryId The ID of the product category to retrieve.
   * @return The product category with the specified ID.
   */
  ProductCategory getProductCategory(String productCategoryId);

  /**
   * Deletes a product category by its ID.
   *
   * @param productCategoryId The ID of the product category to delete.
   */
  void deleteProductCategory(String productCategoryId);

  /**
   * Updates a product category.
   *
   * @param updateProductCategoryRequest The request object containing the updated details of the product category.
   */
  void updateProductCategory(UpdateProductCategoryRequest updateProductCategoryRequest);

  /**
   * Retrieves all product categories.
   *
   * @param sort The sorting order for the product categories (e.g., "name", "date").
   * @param page The page number of the results.
   * @param size The number of product categories to retrieve per page.
   * @return A page of product categories.
   */
  Page<ProductCategory> getAllProductCategories(String sort, Integer page, Integer size);
}
