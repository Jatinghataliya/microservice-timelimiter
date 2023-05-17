/**
 * 
 */
package com.resilient.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jatin.ghataliya
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class ProductDto {

    private int productId;
    private String description;
    private double price;
    private ProductRatingDto productRating;

}