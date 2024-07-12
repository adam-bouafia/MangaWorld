package it.univaq.sose.mangastoreaccountservice.controller;

import it.univaq.sose.mangastoreaccountservice.repository.dao.Role;
import it.univaq.sose.mangastoreaccountservice.service.RoleService;
import it.univaq.sose.mangastoreaccountservice.web.CreateRoleRequest;
import java.net.URI;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * The RoleController class handles HTTP requests related to roles in the MangaStore application.
 */
@RestController
public class RoleController {

  @Autowired
  private RoleService roleService;

  @PostMapping("/role")
  @PreAuthorize("hasAuthority('ADMIN_USER')")
  public ResponseEntity<?> createRole(@RequestBody @Valid CreateRoleRequest createRoleRequest) {

    String userId = roleService.createRole(createRoleRequest);

    URI location = ServletUriComponentsBuilder
        .fromCurrentRequest().path("/{roleId}")
        .buildAndExpand(userId).toUri();

    return ResponseEntity.created(location).build();
  }

  @GetMapping("/roles")
  @PreAuthorize("hasAuthority('ADMIN_USER')")
  public ResponseEntity<?> getAllRoles() {
    List<Role> allRoles = roleService.getAllRoles();
    return ResponseEntity.ok(allRoles);

  }

  //TODO CRUD for role
}
