package it.univaq.sose.mangastorecommons.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

import java.util.Map;

/**
 * This class provides common utility methods for handling authentication in the MangaStore application.
 * It includes methods to retrieve user ID and user name from the authentication token.
 *
 * @author Adam Bouafia
 * @date 29-06-2024
 */
public class CommonUtilityMethods {

    /**
     * Retrieves the user ID from the authentication token.
     *
     * @param authentication The authentication object containing the user details.
     * @return The user ID extracted from the authentication token.
     */
    public static String getUserIdFromToken(Authentication authentication) {
        Map<String, String> map = (Map)((OAuth2Authentication) authentication).getUserAuthentication().getDetails();
        return map.get("user_id");
    }

    /**
     * Retrieves the user name from the authentication token.
     *
     * @param authentication The authentication object containing the user details.
     * @return The user name extracted from the authentication token.
     */
    public static String getUserNameFromToken(Authentication authentication) {
        Map<String, String> map = (Map)((OAuth2Authentication) authentication).getUserAuthentication().getDetails();
        return map.get("user_name");
    }
}
