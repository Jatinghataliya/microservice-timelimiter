/**
 * 
 */
package com.resilient.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author jatin.ghataliya
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@Setter
@Getter
public class Product {

    private int productId;
    private String description;
    private double price;

}