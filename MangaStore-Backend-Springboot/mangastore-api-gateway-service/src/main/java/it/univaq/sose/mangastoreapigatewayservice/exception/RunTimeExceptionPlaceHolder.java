package it.univaq.sose.mangastoreapigatewayservice.exception;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
public class RunTimeExceptionPlaceHolder extends RuntimeException {

  int httpStatus;

  public RunTimeExceptionPlaceHolder(String message, int httpStatus) {
    super(message);
    this.httpStatus = httpStatus;
  }

  public int getHttpStatus() {
    return httpStatus;
  }

}
