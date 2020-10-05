package com.heygurudev.shashidemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ShashiController {
	
	@GetMapping(path = "/products")
	public String getProduct() {
		
		return "Product is here";
	}
	
	
	@GetMapping(path = "/products/{input}")
	public String getProduct(@PathVariable String input) {
		
		return input + " Product is here";
	}

}
