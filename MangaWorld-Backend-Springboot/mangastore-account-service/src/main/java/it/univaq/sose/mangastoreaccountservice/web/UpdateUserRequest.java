package it.univaq.sose.mangastoreaccountservice.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * Represents a request to update user information.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRequest {

    /**
     * The password for the user.
     * Must be between 6 and 20 characters in length.
     */
    @Size(min = 6, max = 20, message = "password length should be between 6 and 20 characters")
    private String password;

    /**
     * The first name of the user.
     * Must not exceed 40 characters in length.
     */
    @Size(max = 40, message = "First Name length should not exceed 40 characters")
    private String firstName;

    /**
     * The last name of the user.
     */
    private String lastName;

    /**
     * The email address of the user.
     * Must not exceed 40 characters in length and should be a valid email address.
     */
    @Size(max = 40, message = "email length should not exceed 40 characters")
    @Email
    private String email;

}
