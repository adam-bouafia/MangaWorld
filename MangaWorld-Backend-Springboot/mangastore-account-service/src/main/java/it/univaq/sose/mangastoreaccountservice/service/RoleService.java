package it.univaq.sose.mangastoreaccountservice.service;

import it.univaq.sose.mangastoreaccountservice.repository.dao.Role;
import it.univaq.sose.mangastoreaccountservice.web.CreateRoleRequest;
import java.util.List;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * The RoleService interface provides methods to manage roles in the MangaStore application.
 */
public interface RoleService {

  /**
   * Creates a new role based on the provided createRoleRequest.
   *
   * @param createRoleRequest The request object containing the details of the role to be created.
   * @return The ID of the newly created role.
   */
  String createRole(CreateRoleRequest createRoleRequest);

  /**
   * Retrieves a list of all roles in the MangaStore application.
   *
   * @return A list of Role objects representing all the roles.
   */
  List<Role> getAllRoles();
}
