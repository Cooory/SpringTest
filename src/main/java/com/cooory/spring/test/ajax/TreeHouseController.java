package com.cooory.spring.test.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ajax/treeHouse")
@Controller
public class TreeHouseController {

	@GetMapping("/mainPage")
	public String TreeHouseMain() {
		
		return "/ajax/treeHouse/mainPage";
	}
	
	
	@GetMapping("/list")
	public String TreeHouseList() {
		
		return "/ajax/treeHouse/list";
	}
	
}
