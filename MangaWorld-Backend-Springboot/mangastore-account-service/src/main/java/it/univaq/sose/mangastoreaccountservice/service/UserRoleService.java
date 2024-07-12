package it.univaq.sose.mangastoreaccountservice.service;

import it.univaq.sose.mangastoreaccountservice.web.MapRoleToUsersRequest;
import it.univaq.sose.mangastoreaccountservice.web.MapUserToRolesRequest;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * The UserRoleService interface provides methods for mapping users to roles and roles to users.
 */
public interface UserRoleService {

  /**
   * Maps a user to roles based on the provided user name or email and the mapUserToRolesRequest.
   *
   * @param userNameOrEmail The user name or email of the user to map roles to.
   * @param mapUserToRolesRequest The request object containing the roles to map to the user.
   */
  void mapUserToRoles(String userNameOrEmail, MapUserToRolesRequest mapUserToRolesRequest);

  /**
   * Removes roles from a user based on the provided user name or email and the mapUserToRolesRequest.
   *
   * @param userNameOrEmail The user name or email of the user to remove roles from.
   * @param mapUserToRolesRequest The request object containing the roles to remove from the user.
   */
  void removeRolesFromUser(String userNameOrEmail, MapUserToRolesRequest mapUserToRolesRequest);

  /**
   * Maps a role to users based on the provided role name and the mapRoleToUsersRequest.
   *
   * @param roleName The name of the role to map users to.
   * @param mapRoleToUsersRequest The request object containing the users to map to the role.
   */
  void mapRoleToUsers(String roleName, MapRoleToUsersRequest mapRoleToUsersRequest);
}
