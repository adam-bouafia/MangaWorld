package it.univaq.sose.mangastorecatalogservice.web;

import it.univaq.sose.mangastorecatalogservice.repository.dao.ProductCategory;
import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a paged response for product categories.
 * Contains the page information and links for navigation.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
@Data
public class ProductCategoriesPagedResponse {
    
    /**
     * The page containing the product categories.
     */
    Page<ProductCategory> page;
    
    /**
     * The links for navigation.
     */
    Map<String, String> _links = new HashMap<>();
    
}
