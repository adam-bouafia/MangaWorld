/**
 * Represents a paged response for products.
 * Contains the page information and links for pagination.
 */
package it.univaq.sose.mangastorecatalogservice.web;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
*
 */
@Data
public class ProductsPagedResponse {

    Page<ProductResponse> page;
    Map<String, String> _links = new HashMap<>();
    
}
