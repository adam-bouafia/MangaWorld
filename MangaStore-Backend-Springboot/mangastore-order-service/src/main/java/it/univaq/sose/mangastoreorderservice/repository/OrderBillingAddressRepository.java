package it.univaq.sose.mangastoreorderservice.repository;

import it.univaq.sose.mangastoreorderservice.repository.dao.OrderBillingAddress;
import org.springframework.data.repository.CrudRepository;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
public interface OrderBillingAddressRepository extends CrudRepository<OrderBillingAddress, String> {
    OrderBillingAddress findByOrderId(String orderId);
}
