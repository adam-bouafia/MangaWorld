package it.univaq.sose.mangastorecommons.feign;

import it.univaq.sose.mangastorecommons.web.GetUserInfoResponse;
import it.univaq.sose.mangastorecommons.web.GetUserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * This interface represents the Feign client for the Account service in the MangaStore application.
 * It provides methods to interact with the Account service endpoints.
 */
@FeignClient("mangastore-account-service")
public interface AccountFeignClient {

    /**
     * Retrieves a user by their username.
     *
     * @param userName the username of the user to retrieve
     * @return a GetUserResponse object containing the user information
     */
    @GetMapping("/user")
    GetUserResponse getUserByUserName(@RequestParam("userName") String userName);

    /**
     * Retrieves a user by their user ID.
     *
     * @param userId the ID of the user to retrieve
     * @return a GetUserResponse object containing the user information
     */
    @GetMapping("/user")
    GetUserResponse getUserById(@RequestParam("userId") String userId);

    /**
     * Retrieves the user information.
     *
     * @return a GetUserInfoResponse object containing the user information
     */
    @GetMapping("/userInfo")
    GetUserInfoResponse getUserInfo();

}
