package it.univaq.sose.mangastorebillingservice.repository.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import it.univaq.sose.mangastorecommons.util.DateAudit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.GenericGenerator;

/**
 * Represents an address entity in the database.
 * This class is used to store address information for users.
 * Extends the DateAudit class for auditing purposes.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
@Entity
@Table(name = "ADDRESS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressDao extends DateAudit {
    
    /**
     * The unique identifier for the address.
     */
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "ADDRESS_ID", updatable = false, nullable = false)
    private String addressId;
    
    /**
     * The user ID associated with the address.
     */
    @Column(name = "USER_ID", nullable = false)
    private String userId;
    
    /**
     * The first line of the address.
     */
    @Column(name = "ADDRESS_LINE1", nullable = false)
    private String addressLine1;
    
    /**
     * The second line of the address (optional).
     */
    @Column(name = "ADDRESS_LINE2")
    private String addressLine2;
    
    /**
     * The city of the address.
     */
    @Column(name = "CITY", nullable = false)
    private String city;

    /**
     * The state of the address.
     */
    @Column(name = "STATE", nullable = false)
    private String state;
    
    /**
     * The postal code of the address.
     */
    @Column(name = "POSTAL_CODE", nullable = false)
    private String postalCode;
    
    /**
     * The country of the address.
     * Must be a 2-letter ISO country code.
     */
    @Pattern(regexp = "[A-Z]{2}", message = "2-letter ISO country code required")
    @NonNull
    private String country;

    /**
     * The phone number associated with the address (optional).
     */
    @Column(name = "PHONE")
    private String phone;
}
