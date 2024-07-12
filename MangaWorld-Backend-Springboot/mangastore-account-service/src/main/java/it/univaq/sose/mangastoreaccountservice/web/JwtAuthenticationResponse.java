package it.univaq.sose.mangastoreaccountservice.web;

import lombok.Value;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
/**
 * Represents a response containing a JWT authentication token.
 */
@Value
public class JwtAuthenticationResponse {

  /**
   * The access token.
   */
  private String access_token;

  /**
   * The token type.
   */
  private String token_type = "Bearer";

  /**
   * The refresh token.
   */
  private String refresh_token;

  /**
   * The expiration time of the token in seconds.
   */
  private Long expires_in;
}
