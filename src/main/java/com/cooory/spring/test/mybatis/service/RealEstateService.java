package com.cooory.spring.test.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cooory.spring.test.mybatis.domain.RealEstate;
import com.cooory.spring.test.mybatis.repository.RealEstateRepository;

@Service
public class RealEstateService {
	
	@Autowired
	private RealEstateRepository realEstateRepository;

	// 전달받은 id와 일치하는 매물 정보를 돌려주는 기능
	public RealEstate getRealEstate(int id) {
		RealEstate realEstate = realEstateRepository.selectRealEstate(id);
		
		return realEstate;
	}
	
	// 전달받은 웰세보다 낮은 매물정보를 돌려주는 기능
	public List<RealEstate> getRealEstateByRentPrice(int rentPrice) {
		List<RealEstate> realEstateList = realEstateRepository.selectRealEstateByRentPrice(rentPrice);
		
		return realEstateList;
	}
	
	// 넓이와 가격 조건에 따른 매물 정보 돌려주는 기능
	public List<RealEstate> getRealEstateByAreaAndPrice(int area, int price) {
		
		List<RealEstate> realEstateList = realEstateRepository.selectRealEstateByAreaAndPrice(area, price);
		
		return realEstateList;
	}
	
	// INSERT 1
	public int addRealEstateByObject(RealEstate realEstate) {
		int count = realEstateRepository.insertRealEstateByObject(realEstate);
		
		return count; // 리턴 타입 int
	}
	
	// INSERT 2
	public int addRealEstateByField(int realtorId, String address, int area, String type, int price, int rentPrice) {
		int count = realEstateRepository.insertRealEstateByField(realtorId, address, area, type, price, rentPrice);
		
		return count;
	}
	
	// UPDATE (전달 받은 id 와 일치하는 매물 정보를 전달 받은 type과 price로 수정한다.)
	public int updateRealEstate(int id, String type, int price) {
		int count = realEstateRepository.updateRealEstate(id, type, price);
		
		return count; //  온전히 이 메소드만 보면 된다.
	}
	
	// DELETE 
	public int deleteRealEstate(int id) {
		int count = realEstateRepository.deleteRealEstate(id);
		
		return count;
	}
}
