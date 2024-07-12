package it.univaq.sose.mangastoreaccountservice.repository;

import it.univaq.sose.mangastoreaccountservice.repository.dao.Role;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * The RoleRepository interface provides methods to interact with the Role entity in the database.
 */
public interface RoleRepository extends CrudRepository<Role, String> {

  /**
   * Finds a role by its name.
   *
   * @param name the name of the role
   * @return an Optional containing the role if found, or an empty Optional if not found
   */
  Optional<Role> findByRoleName(String name);

  /**
   * Checks if a role with the given name exists.
   *
   * @param roleName the name of the role
   * @return true if a role with the given name exists, false otherwise
   */
  Boolean existsByRoleName(String roleName);

  /**
   * Retrieves all roles.
   *
   * @return a list of all roles
   */
  @Override
  List<Role> findAll();
}
