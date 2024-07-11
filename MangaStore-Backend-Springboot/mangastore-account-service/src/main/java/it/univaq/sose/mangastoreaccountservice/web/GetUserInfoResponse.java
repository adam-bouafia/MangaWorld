package it.univaq.sose.mangastoreaccountservice.web;

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
