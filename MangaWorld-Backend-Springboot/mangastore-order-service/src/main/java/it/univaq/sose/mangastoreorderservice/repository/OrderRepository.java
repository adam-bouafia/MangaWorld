package it.univaq.sose.mangastoreorderservice.repository;

import it.univaq.sose.mangastoreorderservice.repository.dao.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 * Date : 2019-09-18
 */
public interface OrderRepository extends CrudRepository<Order, String> {

    Order findByOrderId(String orderId);

    List<Order> findByUserId(String userId);
}