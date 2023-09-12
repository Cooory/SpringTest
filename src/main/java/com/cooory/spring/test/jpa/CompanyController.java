package com.cooory.spring.test.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cooory.spring.test.jpa.Service.CompanyService;
import com.cooory.spring.test.jpa.domain.Company;

@RequestMapping("/jpa/company")
@Controller
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/create")
	@ResponseBody
	public List<Company> createCompany() {
		
		List<Company> companyList = new ArrayList<>();
		
		Company company = companyService.addCompany("넥손", "컨텐츠 게임", "대기업", 3585);
		companyList.add(company);
		
		
		company = companyService.addCompany("버블팡", "여신 금융업", "대기업", 6834);
		companyList.add(company);
		
		
		return companyList;
		
	}
	
	
	
	
	@GetMapping("/update")
	@ResponseBody
	public Company updateCompany() {
		
		// id가 8인 회사정보의 규모를 중소기업, 사원수 34명으로 수정
		Company company = companyService.updateCompany(8, "중소기업", 34);
		
		return company;
	}
	
	@GetMapping("/delete")
	@ResponseBody
	public String deleteCompany() {
		companyService.deleteCompany(8);
		
		return "Delete Completed";
	}
	
	
	
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
