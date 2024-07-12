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
/**
 * Represents a request to create a user.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {

  /**
   * The unique identifier of the user.
   */
  private String userId;

  /**
   * The username of the user.
   * Should not exceed 40 characters in length.
   */
  @NotBlank
  @Size(max = 40, message = "UserName length should not be greater than 40 characters")
  private String userName;

  /**
   * The password of the user.
   * Should be between 6 and 20 characters in length.
   */
  @NotBlank
  @Size(min = 6, max = 20, message = "password length should be between 6 and 20 characters")
  private String password;

  /**
   * The first name of the user.
   * Should not exceed 40 characters in length.
   */
  @NotBlank
  @Size(max = 40, message = "First Name length should not be greater than 40 characters")
  private String firstName;

  /**
   * The last name of the user.
   */
  private String lastName;

  /**
   * The email address of the user.
   * Should not exceed 40 characters in length and should be a valid email address.
   */
  @NotBlank
  @Size(max = 40, message = "email length should not be greater than 40 characters")
  @Email
  private String email;

  /**
   * The list of role names assigned to the user.
   */
  private List<String> roleNames;
}
