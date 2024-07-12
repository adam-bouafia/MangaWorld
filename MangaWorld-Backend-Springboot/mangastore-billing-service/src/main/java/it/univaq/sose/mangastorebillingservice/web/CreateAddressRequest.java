package it.univaq.sose.mangastorebillingservice.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.Pattern;

/**
 * Represents a request to create an address.
 * Contains the necessary information for creating an address.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateAddressRequest {

    /**
     * The first line of the address.
     */
    @NonNull
    private String addressLine1;

    /**
     * The second line of the address.
     */
    private String addressLine2;

    /**
     * The city of the address.
     */
    @NonNull
    private String city;

    /**
     * The state of the address.
     */
    @NonNull
    private String state;

    /**
     * The postal code of the address.
     */
    @NonNull
    private String postalCode;

    /**
     * The country of the address.
     * Must be a 2-letter ISO country code.
     */
    @Pattern(regexp = "[A-Z]{2}", message = "2-letter ISO country code required")
    @NonNull
    private String country;

    /**
     * The phone number associated with the address.
     */
    @NonNull
    private String phone;

}
