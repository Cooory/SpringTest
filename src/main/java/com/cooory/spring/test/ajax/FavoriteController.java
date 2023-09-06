package com.cooory.spring.test.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FavoriteController {
	
	@GetMapping("/ajax/input")
	public String test01() {
		
		
		
		
		return "ajax/favoriteInput";
	}
} 