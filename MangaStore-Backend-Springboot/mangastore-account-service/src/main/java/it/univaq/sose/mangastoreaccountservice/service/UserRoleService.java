package it.univaq.sose.mangastoreaccountservice.service;

import it.univaq.sose.mangastoreaccountservice.web.MapRoleToUsersRequest;
import it.univaq.sose.mangastoreaccountservice.web.MapUserToRolesRequest;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
public interface UserRoleService {

  void mapUserToRoles(String userNameOrEmail, MapUserToRolesRequest mapUserToRolesRequest);

  void removeRolesFromUser(String userNameOrEmail, MapUserToRolesRequest mapUserToRolesRequest);

  void mapRoleToUsers(String roleName, MapRoleToUsersRequest mapRoleToUsersRequest);
}
