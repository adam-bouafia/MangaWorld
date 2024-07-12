package it.univaq.sose.mangastoreaccountservice.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */

/*
This is required for Feign clients to make request to services.
It takes the token from header and set the header in the feign request header.
 */
/**
 * This class is an implementation of the RequestInterceptor interface and is responsible for forwarding the Authorization header in the outgoing requests.
 * It retrieves the Authorization header from the incoming request and sets it as the Authorization header in the outgoing request template.
 */
@Component
public class AuthForwardInterceptor implements RequestInterceptor {

  @Override
  public void apply(RequestTemplate template) {
    HttpServletRequest request = ((ServletRequestAttributes) Objects
        .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
    template.header(HttpHeaders.AUTHORIZATION, request.getHeader(HttpHeaders.AUTHORIZATION));
  }
}
