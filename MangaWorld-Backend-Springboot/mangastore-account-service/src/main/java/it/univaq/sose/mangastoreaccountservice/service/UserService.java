package it.univaq.sose.mangastoreaccountservice.service;

import it.univaq.sose.mangastoreaccountservice.web.CreateUserRequest;
import it.univaq.sose.mangastoreaccountservice.web.GetUserInfoResponse;
import it.univaq.sose.mangastoreaccountservice.web.GetUserResponse;
import it.univaq.sose.mangastoreaccountservice.web.UpdateUserRequest;
import it.univaq.sose.mangastoreaccountservice.web.UpdateUserRequestFromAdmin;

import java.util.List;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * The UserService interface provides methods for managing user-related operations.
 */
public interface UserService {

  /**
   * Creates a new user based on the provided CreateUserRequest.
   *
   * @param createUserRequest The CreateUserRequest object containing user details.
   * @return The ID of the created user.
   */
  String createUser(CreateUserRequest createUserRequest);

  /**
   * Retrieves a user by their username.
   *
   * @param userName The username of the user to retrieve.
   * @return The GetUserResponse object containing user details.
   */
  GetUserResponse getUserByUserName(String userName);

  /**
   * Retrieves a user by their user ID.
   *
   * @param userId The ID of the user to retrieve.
   * @return The GetUserResponse object containing user details.
   */
  GetUserResponse getUserByUserId(String userId);

  /**
   * Retrieves information about the currently logged-in user.
   *
   * @return The GetUserInfoResponse object containing user information.
   */
  GetUserInfoResponse getUserInfo();

  /**
   * Updates the information of the currently logged-in user.
   *
   * @param updateUserRequest The UpdateUserRequest object containing updated user details.
   */
  void updateUserInfo(UpdateUserRequest updateUserRequest);

  /**
   * Deletes a user by their user ID.
   *
   * @param userId The ID of the user to delete.
   */
  void deleteUserById(String userId);

  /**
   * Retrieves a list of all users.
   *
   * @return A list of GetUserResponse objects containing user details.
   */
  List<GetUserResponse> getAllUsers();

  /**
   * Updates the information of a user by their user ID.
   *
   * @param userId The ID of the user to update.
   * @param updateUserRequestFromAdmin The UpdateUserRequestFromAdmin object containing updated user details.
   */
  void updateUser(String userId, UpdateUserRequestFromAdmin updateUserRequestFromAdmin);
}
