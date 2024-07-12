/**
 * Represents an error response containing a unique identifier and a list of errors.
 * 
 * This class is used to encapsulate error information and send it as a response in case of exceptions or errors.
 * It contains a UUID (Universally Unique Identifier) to uniquely identify the error response and a list of Error objects
 * that represent individual errors.
 * 
 * @author Adam Bouafia
 * @date 07-01-2024
 */
package it.univaq.sose.mangastorecommons.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponse {

  private UUID uuid;
  private List<Error> errors;

}
