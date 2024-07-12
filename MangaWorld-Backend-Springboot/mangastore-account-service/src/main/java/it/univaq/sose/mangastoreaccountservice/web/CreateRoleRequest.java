package it.univaq.sose.mangastoreaccountservice.web;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRoleRequest{

  @NotBlank
  private String roleName;
  @NotBlank
  private String roleDescription;

}