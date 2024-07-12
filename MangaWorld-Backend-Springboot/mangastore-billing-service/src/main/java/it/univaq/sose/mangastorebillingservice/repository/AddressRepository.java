package it.univaq.sose.mangastorebillingservice.repository;

import it.univaq.sose.mangastorebillingservice.repository.dao.AddressDao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * This interface represents the repository for managing addresses in the MangaStore Billing Service.
 * It extends the CrudRepository interface, providing basic CRUD operations for AddressDao objects.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
public interface AddressRepository extends CrudRepository<AddressDao, String> {

    /**
     * Retrieves a list of addresses associated with a specific user ID.
     * 
     * @param userId the ID of the user
     * @return an optional list of AddressDao objects
     */
    Optional<List<AddressDao>> findByUserId(String userId);

    /**
     * Retrieves an address by its address ID.
     * 
     * @param addressId the ID of the address
     * @return an optional AddressDao object
     */
    Optional<AddressDao> findByAddressId(String addressId);

    /**
     * Checks if an address exists for a specific user ID.
     * 
     * @param userId the ID of the user
     * @return true if an address exists, false otherwise
     */
    Boolean existsByUserId(String userId);
    
}
