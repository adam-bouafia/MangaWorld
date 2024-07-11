package it.univaq.sose.mangastoreorderservice.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 * Date : 2019-07-13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateCartResponse {
    private String cartId;
}
