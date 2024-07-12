package it.univaq.sose.mangastoreaccountservice.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * Represents the response for creating an OAuth client.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateOAuthClientResponse {

  private String client_id;
  private String client_secret;

}
