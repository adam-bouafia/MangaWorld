package it.univaq.sose.mangastoreaccountservice.web;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * Represents a request to create a role.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRoleRequest {

  /**
   * The name of the role.
   */
  @NotBlank
  private String roleName;

  /**
   * The description of the role.
   */
  @NotBlank
  private String roleDescription;

}
