package it.univaq.sose.mangastorecatalogservice.model;

import it.univaq.sose.mangastorecatalogservice.repository.dao.Product;
import lombok.Data;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;

/**
 * Represents a resource for a product.
 * Extends the EntityModel class from Spring HATEOAS.
 */
@Data
public class ProductResource extends EntityModel<Product> {
    
    private Pageable pageable;
    
    /**
     * Constructs a new ProductResource object.
     * 
     * @param content The product content.
     * @param links   The links associated with the product.
     */
    public ProductResource(Product content, Link... links) {
        EntityModel.of(content, links);
    }
}
