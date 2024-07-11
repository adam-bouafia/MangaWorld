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
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRequestFromAdmin {

    @Size(max = 40, message = "First Name length should not be grater than 40 characters")
    private String firstName;

    private String lastName;

    @Size(max = 40, message = "email length should not be grater than 40 characters")
    @Email
    private String email;

    private List<String> roles = new ArrayList<>();


}