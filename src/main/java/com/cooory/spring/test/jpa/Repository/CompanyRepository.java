package com.cooory.spring.test.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cooory.spring.test.jpa.domain.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{
	
	
}
