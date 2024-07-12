/**
 * This interface represents the repository for managing Product entities.
 * It extends the JpaRepository interface, providing CRUD operations for Product entities.
 * The repository is responsible for persisting and retrieving Product entities from the underlying data source.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
package it.univaq.sose.mangastorecatalogservice.repository;

import it.univaq.sose.mangastorecatalogservice.repository.dao.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
*
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}
