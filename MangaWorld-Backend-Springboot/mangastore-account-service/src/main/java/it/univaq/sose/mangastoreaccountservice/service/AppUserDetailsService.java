package it.univaq.sose.mangastoreaccountservice.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * This interface represents the service responsible for loading user details for authentication and authorization.
 * It extends the UserDetailsService interface provided by Spring Security.
 */
public interface AppUserDetailsService extends UserDetailsService {

  /**
   * Loads the user details for the given username or email.
   *
   * @param userNameOrEmail the username or email of the user
   * @return the UserDetails object representing the user details
   * @throws UsernameNotFoundException if the user is not found
   */
  @Override
  UserDetails loadUserByUsername(String userNameOrEmail) throws UsernameNotFoundException;

}
