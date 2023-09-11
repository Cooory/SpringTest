package com.cooory.spring.test.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ajax/treeHouse")
@Controller
public class BookingController {
	
	@GetMapping("/list")
	public String TreeHouseList() {
		
		
		
		return "/ajax/treeHouse/list";
	}
	
	
	@GetMapping("/input")
	public String TreeHouseInput() {
		
		
		
		return "/ajax/treeHouse/input";
	}
	
	@GetMapping("/main")
	public String TreeHouseMain() {
		
		
		
		return "/ajax/treeHouse/main";
	}
}
