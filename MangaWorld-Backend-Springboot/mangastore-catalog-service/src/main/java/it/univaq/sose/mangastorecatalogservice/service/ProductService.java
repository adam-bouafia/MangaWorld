package it.univaq.sose.mangastorecatalogservice.service;

import it.univaq.sose.mangastorecatalogservice.repository.dao.Product;
import it.univaq.sose.mangastorecatalogservice.web.CreateProductRequest;
import it.univaq.sose.mangastorecatalogservice.web.ProductResponse;
import it.univaq.sose.mangastorecatalogservice.web.UpdateProductRequest;
import javax.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * The ProductService interface provides methods to manage products in the MangaStore catalog.
 * It defines operations for creating, retrieving, updating, and deleting products.
 * It also provides methods for retrieving all products and paginated results.
 */
public interface ProductService {

  /**
   * Creates a new product in the catalog.
   *
   * @param createProductRequest the request object containing the details of the product to be created
   * @return the ID of the newly created product
   */
  String createProduct(@Valid CreateProductRequest createProductRequest);

  /**
   * Retrieves a product from the catalog based on the given product ID.
   *
   * @param productId the ID of the product to retrieve
   * @return the response object containing the details of the retrieved product
   */
  ProductResponse getProduct(String productId);

  /**
   * Deletes a product from the catalog based on the given product ID.
   *
   * @param productId the ID of the product to delete
   */
  void deleteProduct(String productId);

  /**
   * Updates a product in the catalog based on the given update request.
   *
   * @param updateProductRequest the request object containing the updated details of the product
   */
  void updateProduct(UpdateProductRequest updateProductRequest);

  /**
   * Retrieves all products from the catalog in a paginated manner.
   *
   * @param pageable the object specifying the pagination parameters
   * @return a page of Product objects
   */
  Page<Product> findAllProducts(Pageable pageable);

  /**
   * Retrieves all products from the catalog in a paginated manner, with optional sorting.
   *
   * @param sort the sorting criteria for the products
   * @param page the page number to retrieve
   * @param size the number of products per page
   * @return a page of ProductResponse objects
   */
  Page<ProductResponse> getAllProducts(String sort, Integer page, Integer size);
}
