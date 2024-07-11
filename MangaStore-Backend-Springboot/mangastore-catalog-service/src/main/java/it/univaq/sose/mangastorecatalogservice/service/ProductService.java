package it.univaq.sose.mangastorecatalogservice.service;

import it.univaq.sose.mangastorecatalogservice.repository.dao.Product;
import it.univaq.sose.mangastorecatalogservice.web.CreateProductRequest;
import it.univaq.sose.mangastorecatalogservice.web.ProductResponse;
import it.univaq.sose.mangastorecatalogservice.web.UpdateProductRequest;
import javax.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
public interface ProductService {

  String createProduct(@Valid CreateProductRequest createProductRequest);

  ProductResponse getProduct(String productId);

  void deleteProduct(String productId);

  void updateProduct(UpdateProductRequest updateProductRequest);

  Page<Product> findAllProducts(Pageable pageable);

  Page<ProductResponse> getAllProducts(String sort, Integer page, Integer size);
}
