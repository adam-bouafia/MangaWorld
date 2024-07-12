/**
 * Represents a response object containing user information.
 * This class is used to transfer user data from the backend to the frontend.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
package it.univaq.sose.mangastorecommons.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
*
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetUserResponse {

    private String userId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

}
