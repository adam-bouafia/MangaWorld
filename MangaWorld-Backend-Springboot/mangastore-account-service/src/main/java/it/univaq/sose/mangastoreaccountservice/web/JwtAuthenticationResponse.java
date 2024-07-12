package it.univaq.sose.mangastoreaccountservice.web;

import lombok.Value;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
@Value
public class JwtAuthenticationResponse {

  private String access_token;
  private String token_type = "Bearer";
  private String refresh_token;
  private Long expires_in;
}
