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
	
	@RequestMapping("/select/1")
	@ResponseBody
	public RealEstate realEstate(@RequestParam("id") int id) {
		RealEstate realEstate1 = realEstateService.getRealEstate(id);
		
		return realEstate1;
	}
	
	@RequestMapping("/select/2")
	@ResponseBody
	public List<RealEstate> realEstateByRentPrice(@RequestParam("rentPrice") int rentPrice) {
		List<RealEstate> realEstateList = realEstateService.getRealEstateByRentPrice(rentPrice);
		
		return realEstateList;
	}
	
	@RequestMapping("/select/3")
	@ResponseBody
	public List<RealEstate> realEstateBtAreaAndPrice(
			@RequestParam("area") int area
			, @RequestParam("price") int price) {
		List<RealEstate> realEstateList = realEstateService.getRealEstateByAreaAndPrice(area, price);
		
		return realEstateList;
		
	}
	
	
	
	@RequestMapping("/insert/1")
	@ResponseBody
	public String createRealEstateByObject() {
		RealEstate realEstate = new RealEstate(); // 객체 생성!
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		
		int count = realEstateService.addRealEstateByObject(realEstate);
		
		return "입력 성공 : " + count; 
	}
	
	@RequestMapping("insert/2")
	@ResponseBody
	public String createRealEstateByField(@RequestParam("realtorId") int realtorId) {
		int count2 = realEstateService.addRealEstateByField(realtorId, "쌍떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
		
		return "입력 성공 : " + count2;
	}
	
	
	@RequestMapping("update/1")
	@ResponseBody
	public String updateRealEstate() {
		
	}
}
