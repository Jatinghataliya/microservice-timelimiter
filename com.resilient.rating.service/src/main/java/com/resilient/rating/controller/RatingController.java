/**
 * 
 */
package com.resilient.rating.controller;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resilient.rating.dto.ProductRatingDto;
import com.resilient.rating.services.RatingService;

/**
 * @author jatin.ghataliya
 *
 */
@RestController
@RequestMapping("ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @GetMapping("{prodId}")
    public ProductRatingDto getRating(@PathVariable int prodId) throws InterruptedException {
        Thread.sleep(ThreadLocalRandom.current().nextInt(10, 10000));
        return this.ratingService.getRatingForProduct(prodId);
    }

}