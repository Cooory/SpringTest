package com.cooory.spring.test.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cooory.spring.test.jsp.domain.Seller;
import com.cooory.spring.test.jsp.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired // 스프링이 알아서 객체 관리를 해준다.
	private SellerRepository sellerRepository;
	
	
	public int addSeller(String nickname, String profileImage, Double temperature) {
		int count = sellerRepository.insertSeller(nickname, profileImage, temperature);
				
		return count;
	}
	
	public Seller getLastSeller() {
		
		Seller seller = sellerRepository.selectLastSeller();
		
		return seller;
	}
	
	public Seller getSeller(int id) {
		
		Seller seller = sellerRepository.selectSeller(id);
	
		return seller;
	}
}
