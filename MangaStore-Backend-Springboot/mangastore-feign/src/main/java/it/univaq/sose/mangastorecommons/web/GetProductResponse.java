package it.univaq.sose.mangastorecommons.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Adam Bouafia, Date : 07-01-2024
 * Date : 2019-06-04
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetProductResponse {

    private String productId;
    private String productName;
    private String description;
    private double price;
    private String productCategory;
    private int availableItemCount;

}
