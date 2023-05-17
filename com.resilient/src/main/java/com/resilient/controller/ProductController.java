/**
 * 
 */
package com.resilient.controller;

import java.util.concurrent.CompletionStage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resilient.dto.ProductDto;
import com.resilient.service.ProductService;

/**
 * @author jatin.ghataliya
 *
 */
@RestController
@RequestMapping("product")
public class ProductController {

	
	@Autowired
	private ProductService productService;
	
	@GetMapping("{productId}")
	public CompletionStage<ProductDto> getProduct(@PathVariable("productId") int productId) {
		return productService.getProductDto(productId);
	}
	
}
