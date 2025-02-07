package it.univaq.sose.mangastoreaccountservice.service.impl;

import it.univaq.sose.mangastoreaccountservice.repository.RoleRepository;
import it.univaq.sose.mangastoreaccountservice.repository.dao.Role;
import it.univaq.sose.mangastoreaccountservice.service.RoleService;
import it.univaq.sose.mangastoreaccountservice.web.CreateRoleRequest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * This class implements the RoleService interface and provides the implementation for managing roles.
 */
@Service
public class RoleServiceImpl implements RoleService {

  @Autowired
  RoleRepository roleRepository;


  @Override
  public String createRole(CreateRoleRequest createRoleRequest) {

    Role role = Role.builder()
        .roleName(createRoleRequest.getRoleName())
        .roleDescription(createRoleRequest.getRoleDescription())
        .build();

    Role savedRole = roleRepository.save(role);
    return savedRole.getId();
  }

  @Override
  public List<Role> getAllRoles() {
    List<Role> allRoles = roleRepository.findAll();
    return allRoles;
  }
}
