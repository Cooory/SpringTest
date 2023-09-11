package com.cooory.spring.test.jpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cooory.spring.test.jpa.domain.Company;

@Controller
public class CompanyController {
	
	@GetMapping("/lombok/test1")
	@ResponseBody
	public Company lombokTest() {
		
		Company company = Company.builder()
							.name("넥손")
							.business("컨텐츠 게임")
							.scale("대기업")
							.headcount(3585)
							.build();
		
		return company;
		
	}
}
