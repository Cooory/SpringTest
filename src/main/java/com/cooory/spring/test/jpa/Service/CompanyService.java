package com.cooory.spring.test.jpa.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cooory.spring.test.jpa.Repository.CompanyRepository;
import com.cooory.spring.test.jpa.domain.Company;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	
	public Company addCompany(String name, String business, String scale, int headcount) {
		
		
		Company company = Company.builder()
							.name(name)
							.business(business)
							.scale(scale)
							.headcount(headcount)
							.build();
		
		company = companyRepository.save(company);
		
		return company; // 해당 Repository와 연관된 엔티티 클래스를 리턴한다.
	}
	
	
	
	// 전달 받은 id 회사 정보를 전달 받은 규모와 사원수로 수정
	
	public Company updateCompany(int id, String scale, int headcount) {
		
		// id로 수정대상 행 조회
		// 조회 된 객체로 값 수정
		// 수정 된 객체를 저장
		Optional<Company> optionalCompany = companyRepository.findById(id);
		Company company = optionalCompany.orElse(null);
		
		if (company != null) {
			company = company.toBuilder()
				.scale(scale)
				.headcount(headcount)
				.build();
			
			company = companyRepository.save(company);
		}
		
		return company;
	}
	
	public void deleteCompany(int id) {
		// id를 기반으로 한 행을 조회
		// 조회된 객체로 해당 행 삭제
		
		companyRepository.findById(id).ifPresent(company -> companyRepository.delete(company));
		
	}
	
}
