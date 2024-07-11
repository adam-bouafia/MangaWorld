package it.univaq.sose.mangastorepaymentservice.repository;

import it.univaq.sose.mangastorepaymentservice.repository.dao.UserPaymentCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
@author Adam Bouafia, Date : 29-06-2024
 */
@Repository
public interface UserPaymentCustomerRepository extends JpaRepository<UserPaymentCustomer, String> {

    UserPaymentCustomer findByUserId(String userId);
}
