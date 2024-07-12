package it.univaq.sose.mangastoreaccountservice.exception;

import it.univaq.sose.mangastorecommons.exception.ErrorResponse;
import lombok.Getter;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
/**
 * Represents an exception that is thrown when a success code is received along with an error response.
 * This exception is typically used in the context of handling errors in the MangaStore Account Service.
 */
public class SuccessCodeWithErrorResponse extends RuntimeException {

  /**
   * The error response associated with the exception.
   */
  @Getter
  private ErrorResponse errorResponse;

  /**
   * The ID associated with the exception.
   */
  @Getter
  private String id;

  /**
   * Constructs a new SuccessCodeWithErrorResponse object with the specified ID and error response.
   * 
   * @param id The ID associated with the exception.
   * @param errorResponse The error response associated with the exception.
   */
  public SuccessCodeWithErrorResponse(String id, ErrorResponse errorResponse) {
    this.id = id;
    this.errorResponse = errorResponse;
  }

  /**
   * Constructs a new SuccessCodeWithErrorResponse object with the specified error response.
   * 
   * @param errorResponse The error response associated with the exception.
   */
  public SuccessCodeWithErrorResponse(ErrorResponse errorResponse) {
    this.errorResponse = errorResponse;
  }

}
