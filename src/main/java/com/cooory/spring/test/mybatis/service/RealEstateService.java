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
}