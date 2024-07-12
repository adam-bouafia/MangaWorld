package it.univaq.sose.mangastoreaccountservice.repository;


import it.univaq.sose.mangastoreaccountservice.repository.dao.User;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * The repository interface for managing User entities.
 * This interface provides methods for CRUD operations and custom queries related to User entities.
 */
@SuppressWarnings("unused")
@Transactional
public interface UserRepository extends CrudRepository<User, String> {

  /**
   * Retrieves an optional User entity by the given username.
   *
   * @param username The username to search for.
   * @return An optional User entity.
   */
  Optional<User> findByUserName(String username);

  /**
   * Retrieves an optional User entity by the given username or email.
   *
   * @param uName The username to search for.
   * @param eMail The email to search for.
   * @return An optional User entity.
   */
  Optional<User> findByUserNameOrEmail(String uName, String eMail);

  /**
   * Retrieves an optional User entity by the given userId.
   *
   * @param userId The userId to search for.
   * @return An optional User entity.
   */
  Optional<User> findByUserId(String userId);

  /**
   * Deletes a User entity by the given userId.
   *
   * @param userId The userId of the User entity to delete.
   */
  void deleteByUserId(String userId);

  /**
   * Checks if a User entity exists with the given username.
   *
   * @param userName The username to check.
   * @return True if a User entity exists with the given username, false otherwise.
   */
  Boolean existsByUserName(String userName);

  /**
   * Checks if a User entity exists with the given email.
   *
   * @param email The email to check.
   * @return True if a User entity exists with the given email, false otherwise.
   */
  Boolean existsByEmail(String email);

}
