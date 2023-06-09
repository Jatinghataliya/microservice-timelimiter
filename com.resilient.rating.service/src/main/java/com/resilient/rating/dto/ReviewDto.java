/**
 * 
 */
package com.resilient.rating.dto;

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
public class ReviewDto {

    private String userFirstname;
    private String userLastname;
    private int productId;
    private int rating;
    private String comment;

}