package com.cooory.spring.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cooory.spring.test.jsp.domain.Realtor;
import com.cooory.spring.test.jsp.repository.RealtorRepository;
import com.cooory.spring.test.jsp.service.RealtorService;


@RequestMapping("/jsp/realtor")
@Controller
public class RealtorController {
	
	// 전달 된 공인중개사 정보를 저장하고, 결과를 태그로 구성해서 response에 담는다.
	
	
	@Autowired
	private RealtorService realtorService;

	@GetMapping("/create")
	public String createRealtor (
			@RequestParam("office") String office
			, @RequestParam("phoneNumber") String phoneNumber
			, @RequestParam("address") String address
			, @RequestParam("grade") String grade
			, Model model) {
		
		Realtor realtor = new Realtor();
		realtor.setOffice(office);
		realtor.setPhoneNumber(phoneNumber);
		realtor.setAddress(address);
		realtor.setGrade(grade);
		
		int count = realtorService.addRealtor(realtor);
		
		model.addAttribute("realtor", realtor);
		
		return "/jsp/realtorInfo";
	}
	
	@GetMapping("/input")
	public String realtorInput() {
		return "jsp/realtorInput";
	}
		
	
}
