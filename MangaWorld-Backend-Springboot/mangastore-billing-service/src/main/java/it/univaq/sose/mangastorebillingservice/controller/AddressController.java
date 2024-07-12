package it.univaq.sose.mangastorebillingservice.controller;

import it.univaq.sose.mangastorebillingservice.service.AddressService;
import it.univaq.sose.mangastorebillingservice.web.CreateAddressRequest;
import it.univaq.sose.mangastorebillingservice.web.GetAddressResponse;
import it.univaq.sose.mangastorebillingservice.web.UpdateAddressRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The AddressController class handles HTTP requests related to addresses.
 * It provides endpoints for creating, updating, retrieving, and deleting addresses.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
@RestController
public class AddressController {
    
    @Autowired
    AddressService addressService;
    
    /**
     * Creates a new address.
     * 
     * @param createAddressRequest The request object containing the address details.
     * @return A ResponseEntity with the HTTP status code indicating the success or failure of the operation.
     */
    @PostMapping("/address")
    public ResponseEntity<Object> createAddress(@RequestBody CreateAddressRequest createAddressRequest) {
        addressService.createAddress(createAddressRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /**
     * Updates an existing address.
     * 
     * @param updateAddressRequest The request object containing the updated address details.
     * @return A ResponseEntity with the HTTP status code indicating the success or failure of the operation.
     */
    @PutMapping("/address")
    public ResponseEntity<Object> updateAddress(@RequestBody UpdateAddressRequest updateAddressRequest) {
        addressService.updateAddress(updateAddressRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /**
     * Retrieves all addresses.
     * 
     * @return A ResponseEntity containing a list of GetAddressResponse objects representing the addresses.
     */
    @GetMapping("/address")
    public ResponseEntity<List<GetAddressResponse>> getAddress() {
        List<GetAddressResponse> address = addressService.getAddress();
        return ResponseEntity.ok(address);
    }

    /**
     * Retrieves an address by its ID.
     * 
     * @param addressId The ID of the address to retrieve.
     * @return A ResponseEntity containing the GetAddressResponse object representing the address.
     */
    @GetMapping("/address/{addressId}")
    public ResponseEntity<GetAddressResponse> getAddressById(@PathVariable("addressId") String addressId) {
        GetAddressResponse address = addressService.getAddressById(addressId);
        return ResponseEntity.ok(address);
    }

    /**
     * Deletes an address by its ID.
     * 
     * @param addressId The ID of the address to delete.
     * @return A ResponseEntity with the HTTP status code indicating the success or failure of the operation.
     */
    @DeleteMapping("/address/{addressId}")
    public ResponseEntity<?> deleteAddressById(@PathVariable("addressId") String addressId) {
        addressService.deleteAddressById(addressId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    
}
