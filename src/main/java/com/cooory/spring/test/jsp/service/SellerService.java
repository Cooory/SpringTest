package com.cooory.spring.test.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cooory.spring.test.jsp.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	
	public int addSeller(String nickname, String profileImage, Double temperature) {
		int count = sellerRepository.insertSeller(nickname, profileImage, temperature);
				
		return count;
	}
	
}
