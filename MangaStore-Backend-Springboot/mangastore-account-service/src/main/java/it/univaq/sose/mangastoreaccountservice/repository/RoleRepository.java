package it.univaq.sose.mangastoreaccountservice.repository;

import it.univaq.sose.mangastoreaccountservice.repository.dao.Role;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
public interface RoleRepository extends CrudRepository<Role, String> {

  Optional<Role> findByRoleName(String name);

  Boolean existsByRoleName(String roleName);

  @Override
  List<Role> findAll();
}
