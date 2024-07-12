/**
 * This interface represents the repository for managing product categories.
 * It extends the JpaRepository interface, providing CRUD operations for the ProductCategory entity.
 * The entity class is ProductCategory and the primary key type is String.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
package it.univaq.sose.mangastorecatalogservice.repository;

import it.univaq.sose.mangastorecatalogservice.repository.dao.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
*
 */
@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, String> {
}
