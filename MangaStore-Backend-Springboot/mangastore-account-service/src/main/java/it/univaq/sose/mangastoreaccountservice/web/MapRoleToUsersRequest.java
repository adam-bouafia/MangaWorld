package it.univaq.sose.mangastoreaccountservice.web;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MapRoleToUsersRequest {

  private List<String> userNames;
}
