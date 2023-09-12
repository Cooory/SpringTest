package com.cooory.spring.test.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cooory.spring.test.jpa.Repository.RecruitRepository;
import com.cooory.spring.test.jpa.domain.Recruit;

@Controller
public class RecruitController {

	@Autowired
	private RecruitRepository recruitRepository;
	
	
	@GetMapping("/jpa/recruit/select")
	@ResponseBody
	public List<Recruit> selectRecruit() {
		
		// 1. id 로 조회
		// id가 8인 공고를 조회하고 아래와 같이 출력하세요.
		
//		List<Recruit> recruitList = recruitRepository.findById(8);
		
		
		// 2. Parameter 조건 조회
		// Request Parameter로 전달 받은 company id로 해당하는 회사의 공고를 조회하세요.
		// 조회 결과를 아래와 같이 출력하세요.
		
//		List<Recruit> recruitList = recruitRepository.findByCompanyId(1);
		
		
		// 3. 복합 조건 조회
		// 웹 back-end 개발자 이고 정규직인 공고를 조회하고 아래와 같이 출력하세요.
		
//		List<Recruit> recruitList = recruitRepository.findByPositionAndType("웹 back-end 개발자", "정규직");
		
		
//		4. 복합 조건 조회
//		정규직이거나 연봉이 9000 이상인 공고를 조회하고 아래와 같이 출력하세요.
//		메소드명 규칙을 검색해서 찾아보세요.
		
		List<Recruit> recruitList = recruitRepository.findByTypeOrGreaterThan("정규직", 9000);
		
		return recruitList;
	}
}
