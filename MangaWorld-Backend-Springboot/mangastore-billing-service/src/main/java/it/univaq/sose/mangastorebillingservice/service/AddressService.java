package it.univaq.sose.mangastorebillingservice.service;

import it.univaq.sose.mangastorebillingservice.web.CreateAddressRequest;
import it.univaq.sose.mangastorebillingservice.web.GetAddressResponse;
import it.univaq.sose.mangastorebillingservice.web.UpdateAddressRequest;

import java.util.List;

/**
 * The AddressService interface provides methods for managing addresses.
 * These methods allow creating, retrieving, updating, and deleting addresses.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
public interface AddressService {

  /**
   * Creates a new address based on the provided request.
   * 
   * @param createAddressRequest The request object containing the address details.
   */
  void createAddress(CreateAddressRequest createAddressRequest);

  /**
   * Retrieves a list of all addresses.
   * 
   * @return A list of GetAddressResponse objects representing the addresses.
   */
  List<GetAddressResponse> getAddress();

  /**
   * Updates an existing address based on the provided request.
   * 
   * @param updateAddressRequest The request object containing the updated address details.
   */
  void updateAddress(UpdateAddressRequest updateAddressRequest);

  /**
   * Retrieves an address by its ID.
   * 
   * @param addressId The ID of the address to retrieve.
   * @return The GetAddressResponse object representing the address.
   */
  GetAddressResponse getAddressById(String addressId);

  /**
   * Deletes an address by its ID.
   * 
   * @param addressId The ID of the address to delete.
   */
  void deleteAddressById(String addressId);
}
