package it.univaq.sose.mangastorecommons.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Error {

  private String code;
  private String message;
}
