/**
 * 
 */
package com.resilient.dto;

import java.util.List;

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
public class ProductRatingDto {

    private double avgRating;
    private List<ReviewDto> reviews;

}