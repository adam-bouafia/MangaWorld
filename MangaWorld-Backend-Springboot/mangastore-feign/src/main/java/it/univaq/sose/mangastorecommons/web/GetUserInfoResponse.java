/**
 * Represents a response object containing user information.
 * This class is used to store the user information retrieved from the backend.
 * It includes the user ID, username, first name, last name, and email.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
package it.univaq.sose.mangastorecommons.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetUserInfoResponse {

  private String userId;
  private String userName;
  private String firstName;
  private String lastName;
  private String email;

}
