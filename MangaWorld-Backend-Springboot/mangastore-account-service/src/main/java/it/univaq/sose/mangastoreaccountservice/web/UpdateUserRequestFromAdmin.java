package it.univaq.sose.mangastoreaccountservice.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * Represents a request object used for updating user information by an admin.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRequestFromAdmin {

    /**
     * The first name of the user.
     * Should not exceed 40 characters in length.
     */
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
    @Size(max = 40, message = "Email length should not be greater than 40 characters")
    @Email
    private String email;

    /**
     * The roles assigned to the user.
     */
    private List<String> roles = new ArrayList<>();

}
