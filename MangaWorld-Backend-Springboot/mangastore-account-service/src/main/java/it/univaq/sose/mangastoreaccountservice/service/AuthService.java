package it.univaq.sose.mangastoreaccountservice.service;

import it.univaq.sose.mangastoreaccountservice.web.CreateOAuthClientRequest;
import it.univaq.sose.mangastoreaccountservice.web.CreateOAuthClientResponse;
import it.univaq.sose.mangastoreaccountservice.web.CreateUserResponse;
import it.univaq.sose.mangastoreaccountservice.web.SignUpRequest;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * The AuthService interface provides methods for authentication and user registration.
 */
public interface AuthService {

  /**
   * Creates an OAuth client based on the provided request.
   *
   * @param createOAuthClientRequest The request object containing the details of the OAuth client to be created.
   * @return The response object containing the details of the created OAuth client.
   */
  CreateOAuthClientResponse createOAuthClient(CreateOAuthClientRequest createOAuthClientRequest);

  /**
   * Registers a new user based on the provided sign-up request.
   *
   * @param signUpRequest The request object containing the details of the user to be registered.
   * @return The response object containing the details of the registered user.
   */
  CreateUserResponse registerUser(SignUpRequest signUpRequest);
}
