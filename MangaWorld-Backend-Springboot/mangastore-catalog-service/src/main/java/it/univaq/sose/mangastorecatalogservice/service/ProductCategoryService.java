package it.univaq.sose.mangastorecatalogservice.service;

import it.univaq.sose.mangastorecatalogservice.repository.dao.ProductCategory;
import it.univaq.sose.mangastorecatalogservice.web.CreateProductCategoryRequest;
import it.univaq.sose.mangastorecatalogservice.web.UpdateProductCategoryRequest;
import javax.validation.Valid;
import org.springframework.data.domain.Page;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
public interface ProductCategoryService {

  String createProductCategory(@Valid CreateProductCategoryRequest createProductCategoryRequest);

  ProductCategory getProductCategory(String productCategoryId);

  void deleteProductCategory(String productCategoryId);

  void updateProductCategory(UpdateProductCategoryRequest updateProductCategoryRequest);

  Page<ProductCategory> getAllProductCategories(String sort, Integer page, Integer size);
}
