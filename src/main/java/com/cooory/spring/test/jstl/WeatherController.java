package com.cooory.spring.test.jstl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherController {

	@GetMapping("/jstl/test05")
	public String test05() {
		
		
		
		return "jstl/test05";
	}
}
