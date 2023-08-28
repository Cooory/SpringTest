package com.cooory.spring.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cooory.spring.test.jsp.service.SellerService;

@Controller
public class SellerController {
	
	@Autowired
	private SellerService sellerService;

	@PostMapping("/jsp/seller/create")
	public String createSeller(
			@RequestParam("nickname") String nickname
			, @RequestParam("profileImage") String profileImage
			, @RequestParam("temperature") double temperature) {
		
		int count = SellerService.addSeller
			
	}
}
