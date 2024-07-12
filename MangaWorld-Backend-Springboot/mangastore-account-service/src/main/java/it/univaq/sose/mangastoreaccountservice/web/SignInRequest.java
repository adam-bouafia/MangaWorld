package it.univaq.sose.mangastoreaccountservice.web;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * Represents a sign-in request object containing the username or email and password.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignInRequest {

  /**
   * The username or email provided for sign-in.
   */
  @NotBlank
  private String usernameOrEmail;

  /**
   * The password provided for sign-in.
   */
  @NotBlank
  private String password;
}

