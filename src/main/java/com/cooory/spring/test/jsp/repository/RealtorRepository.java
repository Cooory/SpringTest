package com.cooory.spring.test.jsp.repository;

import org.springframework.stereotype.Repository;

import com.cooory.spring.test.jsp.domain.Realtor;

@Repository
public interface RealtorRepository {

	public int insertRealtor(Realtor realtor);
		
		
}
