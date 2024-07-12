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
public interface UserService {

  String createUser(CreateUserRequest createUserRequest);

  GetUserResponse getUserByUserName(String userName);

  GetUserResponse getUserByUserId(String userId);

  GetUserInfoResponse getUserInfo();

  void updateUserInfo(UpdateUserRequest updateUserRequest);

  void deleteUserById(String userId);

  List<GetUserResponse> getAllUsers();

  void updateUser(String userId, UpdateUserRequestFromAdmin updateUserRequestFromAdmin);
}
