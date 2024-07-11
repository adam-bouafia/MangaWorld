package it.univaq.sose.mangastorebillingservice.service;

import it.univaq.sose.mangastorebillingservice.web.CreateAddressRequest;
import it.univaq.sose.mangastorebillingservice.web.GetAddressResponse;
import it.univaq.sose.mangastorebillingservice.web.UpdateAddressRequest;

import java.util.List;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
public interface AddressService {

  void createAddress(CreateAddressRequest createAddressRequest);

  List<GetAddressResponse> getAddress();

  void updateAddress(UpdateAddressRequest updateAddressRequest);

  GetAddressResponse getAddressById(String addressId);

  void deleteAddressById(String addressId);
}
