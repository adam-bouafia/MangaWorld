package it.univaq.sose.mangastoreaccountservice.repository;

import it.univaq.sose.mangastoreaccountservice.repository.dao.OAuthClient;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * The OAuthClientRepository interface provides CRUD operations for managing OAuth clients.
 */
public interface OAuthClientRepository extends CrudRepository<OAuthClient, String> {

}
