package it.univaq.sose.mangastoreaccountservice.web;

import java.util.List;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {

  private String userId;

  @NotBlank
  @Size(max = 40, message = "UserName length should not be grater than 40 characters")
  private String userName;

  @NotBlank
  @Size(min = 6, max = 20, message = "password length should not be between 6 and 20 characters")
  private String password;

  @NotBlank
  @Size(max = 40, message = "First Name length should not be grater than 40 characters")
  private String firstName;

  private String lastName;

  @NotBlank
  @Size(max = 40, message = "email length should not be grater than 40 characters")
  @Email
  private String email;

  private List<String> roleNames;
}