package it.univaq.sose.mangastorecommons.exception;

/**
 * This class represents a custom runtime exception placeholder.
 * It extends the RuntimeException class and is used to handle custom runtime exceptions in the MangaStore application.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
public class RunTimeExceptionPlaceHolder extends RuntimeException {

  /**
   * Constructs a new RunTimeExceptionPlaceHolder with the specified detail message.
   * 
   * @param message the detail message (which is saved for later retrieval by the getMessage() method)
   */
  public RunTimeExceptionPlaceHolder(String message) {
    super(message);
  }
}
