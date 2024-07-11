package it.univaq.sose.mangastorebillingservice.repository;

import it.univaq.sose.mangastorebillingservice.repository.dao.AddressDao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 * Date : 2019-09-20
 */
public interface AddressRepository extends CrudRepository<AddressDao, String> {

    Optional<List<AddressDao>> findByUserId(String userId);

    Optional<AddressDao> findByAddressId(String addressId);

    Boolean existsByUserId(String userId);
    
}
