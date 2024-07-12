package it.univaq.sose.mangastoreaccountservice.repository;


import it.univaq.sose.mangastoreaccountservice.repository.dao.User;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
@SuppressWarnings("unused")
@Transactional
public interface UserRepository extends CrudRepository<User, String> {

  Optional<User> findByUserName(String username);

  Optional<User> findByUserNameOrEmail(String uName, String eMail);

  Optional<User> findByUserId(String userId);

  void deleteByUserId(String userId);

  Boolean existsByUserName(String userName);

  Boolean existsByEmail(String email);

}
