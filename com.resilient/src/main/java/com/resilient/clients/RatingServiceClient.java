/**
 * 
 */
package com.resilient.clients;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.resilient.dto.ProductRatingDto;

import io.github.resilience4j.timelimiter.annotation.TimeLimiter;

/**
 * @author jatin.ghataliya
 *
 */
@Service
public class RatingServiceClient {

	private final RestTemplate restTemplate = new RestTemplate();

    @Value("${rating.service.endpoint}")
    private String ratingService;

    @TimeLimiter(name = "ratingService", fallbackMethod = "getDefault")
    public CompletionStage<ProductRatingDto> getProductRatingDto(int productId){
    	System.out.println("URL : " + ratingService + productId);
        Supplier<ProductRatingDto> supplier = () ->
            this.restTemplate.getForEntity(this.ratingService + productId, ProductRatingDto.class)
                    .getBody();
        return CompletableFuture.supplyAsync(supplier);
    }

    private CompletionStage<ProductRatingDto> getDefault(int productId, Throwable throwable){
        return CompletableFuture.supplyAsync(() -> ProductRatingDto.of(Double.valueOf("0").doubleValue(), Collections.emptyList()));
    }
	
}