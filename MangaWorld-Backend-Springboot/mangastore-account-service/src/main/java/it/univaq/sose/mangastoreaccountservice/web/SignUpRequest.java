package it.univaq.sose.mangastoreaccountservice.web;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * Represents a sign-up request for a user.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpRequest {

  /**
   * The user ID.
   */
  private String userId;

  /**
   * The user's username.
   */
  @NotBlank
  @Size(max = 40, message = "UserName length should not be greater than 40 characters")
  private String userName;

  /**
   * The user's password.
   */
  @NotBlank
  @Size(min = 6, max = 20, message = "password length should be between 6 and 20 characters")
  private String password;

  /**
   * The user's first name.
   */
  @NotBlank
  @Size(max = 40, message = "First Name length should not be greater than 40 characters")
  private String firstName;

  /**
   * The user's last name.
   */
  private String lastName;

  /**
   * The user's email address.
   */
  @NotBlank
  @Size(max = 40, message = "email length should not be greater than 40 characters")
  @Email
  private String email;

}
