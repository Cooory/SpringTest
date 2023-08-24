package com.cooory.spring.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cooory.spring.test.mybatis.domain.RealEstate;
import com.cooory.spring.test.mybatis.service.RealEstateService;

@RequestMapping("/mybatis/real-estate")
@Controller
public class RealEstateController {

	@Autowired
	private RealEstateService realEstateService;
	
	@RequestMapping("/1")
	@ResponseBody
	public RealEstate realEstate(@RequestParam("id") int id) {
		RealEstate realEstate1 = realEstateService.getRealEstate(id);
		
		return realEstate1;
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public List<RealEstate> realEstateByRentPrice(@RequestParam("rentPrice") int rentPrice) {
		List<RealEstate> realEstateList = realEstateService.getRealEstateByRentPrice(rentPrice);
		
		return realEstateList;
	}
}
