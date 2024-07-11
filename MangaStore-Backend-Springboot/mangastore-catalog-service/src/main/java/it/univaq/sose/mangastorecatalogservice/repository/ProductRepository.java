package it.univaq.sose.mangastorecatalogservice.repository;

import it.univaq.sose.mangastorecatalogservice.repository.dao.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 * Date : 2019-06-06
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}
