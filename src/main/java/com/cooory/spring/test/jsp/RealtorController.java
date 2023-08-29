package com.cooory.spring.test.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RealtorController {

	@PostMapping("/jsp/realtor/create")
	public createRealtor(
			@RequestParam("office") String office
			, @RequestParam("phoneNumber") String phoneNumber
			, @RequestParam("address")String address
			, @RequestParam("grade")String grade
			, Model model) {
			
		Realtor realtor = new Realtor();
		
		
	}
}
