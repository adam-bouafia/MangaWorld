package it.univaq.sose.mangastorebillingservice.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * Represents a request to update an address.
 * Contains the necessary fields to update the address details.
 *
 * @author Adam Bouafia
 * @date 29-06-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateAddressRequest {

    /**
     * The ID of the address to be updated.
     */
    @NotBlank
    private String addressId;

    /**
     * The first line of the address.
     */
    @NonNull
    private String addressLine1;

    /**
     * The second line of the address (optional).
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
     * The country of the address (2-letter ISO country code).
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
