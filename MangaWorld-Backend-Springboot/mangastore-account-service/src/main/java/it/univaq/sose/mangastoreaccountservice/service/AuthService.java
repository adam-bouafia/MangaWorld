package it.univaq.sose.mangastoreaccountservice.service;

import it.univaq.sose.mangastoreaccountservice.web.CreateOAuthClientRequest;
import it.univaq.sose.mangastoreaccountservice.web.CreateOAuthClientResponse;
import it.univaq.sose.mangastoreaccountservice.web.CreateUserResponse;
import it.univaq.sose.mangastoreaccountservice.web.SignUpRequest;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
public interface AuthService {

  CreateOAuthClientResponse createOAuthClient(CreateOAuthClientRequest createOAuthClientRequest);

  CreateUserResponse registerUser(SignUpRequest signUpRequest);
}
