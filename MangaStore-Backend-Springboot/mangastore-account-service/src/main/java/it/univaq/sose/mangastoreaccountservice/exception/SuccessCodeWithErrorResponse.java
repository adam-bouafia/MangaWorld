package it.univaq.sose.mangastoreaccountservice.exception;

import it.univaq.sose.mangastorecommons.exception.ErrorResponse;
import lombok.Getter;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
public class SuccessCodeWithErrorResponse extends RuntimeException {

  @Getter
  private ErrorResponse errorResponse;

  @Getter
  private String id;

  public SuccessCodeWithErrorResponse(String id, ErrorResponse errorResponse) {
    this.id = id;
    this.errorResponse = errorResponse;
  }

  public SuccessCodeWithErrorResponse(ErrorResponse errorResponse) {
    this.errorResponse = errorResponse;
  }

}
