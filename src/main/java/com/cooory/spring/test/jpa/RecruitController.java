package com.cooory.spring.test.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cooory.spring.test.jpa.Repository.RecruitRepository;
import com.cooory.spring.test.jpa.domain.Recruit;

@RequestMapping("/jpa/recruit/select")
@Controller
public class RecruitController {

	@Autowired
	private RecruitRepository recruitRepository;
	
	
	@GetMapping("/1")
	@ResponseBody

		// 1. id 로 조회
		// id가 8인 공고를 조회하고 아래와 같이 출력하세요.
		
	public Recruit jpaTest01() {
		
		Optional<Recruit> optionalRecruit = recruitRepository.findById(8);
		Recruit recruit = optionalRecruit.orElse(null);
		
		return recruit;		

	}
	
	
	// 2. Parameter 조건 조회
	// Request Parameter로 전달 받은 company id로 해당하는 회사의 공고를 조회하세요.
	// 조회 결과를 아래와 같이 출력하세요.
	// companyId 컬럼이 일치하는 행 조회
	// WHERE `companyId` = ??
	
	@GetMapping("/2")
	@ResponseBody
	
	public List<Recruit> jpaTest02(@RequestParam("companyId") int companyId) {
		
		List<Recruit> recruitList = recruitRepository.findByCompanyId(companyId);
		
		return recruitList;
	}
	
	
	// 3. 복합 조건 조회
	// 웹 back-end 개발자 이고 정규직인 공고를 조회하고 아래와 같이 출력하세요.
	// position컬ㄹ머과 type컬럼이 모두 일치하는 행 조회
	// WHERE `position` = ?? AND `type` = ??
	
	@GetMapping("/3")
	@ResponseBody
	public List<Recruit> jpaTest03() {
		
		List<Recruit> recruitList = recruitRepository.findByPositionAndType("웹 back-end 개발자", "정규직");
		
		return recruitList;
	}
	
	
	
	//	4. 복합 조건 조회
	//	정규직이거나 연봉이 9000 이상인 공고를 조회하고 아래와 같이 출력하세요.
	//	메소드명 규칙을 검색해서 찾아보세요.
	// type 컬럼이 일치하거나 salary 컬럼의 값이 특정 값보다 이상인 행 조회
	// WHERE `type` = ?? OR `salary` >= ???
	
	@GetMapping("/4")
	@ResponseBody
	public List<Recruit> jpaTest04() {
		
		List<Recruit> recruitList = recruitRepository.findByTypeOrSalaryGreaterThanEqual("정규직", 9000);
		
		return recruitList;
	}
	
	
//	5. 정렬 제한 조건(/lesson07/quiz02/5)
//	계약직 목록을 연봉 기준으로 내림차순 정렬해서 3개만 조회하세요.
//	조회 결과를 아래와 같이 출력하세요.
// 	type 컬럼이 일치하는 행을 염봉 기준으로 내림차순으로 3개 조회
//  WHERE `type` = ?? ORDER BY `salary` DESC LIMIT 3
	
	@GetMapping("/5")
	@ResponseBody
	public List<Recruit> jpaTest05() {
		
		List<Recruit> recruitList = recruitRepository.findTop3ByTypeOrderBySalaryDesc("계약직");
		
		return recruitList;
	}
	
	
//	6. 범위 조회 (/lesson07/quiz02/6)
//	성남시 분당구가 지역인 연봉 7000 이상 8500 이하인 공고를 조회하고 아래와 같이 출력하세요.
// 	region 컬럼이 일치하고  salary 컬럼이 특정값 사이의 조건에 대응되는 행 조회
// 	WHERE `region` = ?? AND `salary` BETWEEN ?? AND ??
	
	@GetMapping("/6")
	@ResponseBody
	public List<Recruit> jpaTest06() {
		
		List<Recruit> recruitList = recruitRepository.findByRegionAndSalaryBetween("성남시 분당구", 7000, 8500);
		
		return recruitList;
		
	}
	
//	7. Native query(/lesson07/quiz02/7)
//	마감일이 2026-04-10 이후이고 연봉이 8100 이상인 정규직 공고를 연봉 내림차순으로 조회하세요.
//	조회 결과를 아래와 같이 출력하세요.
	
	@GetMapping("/7")
	@ResponseBody
	public List<Recruit> jpaTest07() {
		
		List<Recruit> recruitList = recruitRepository.findByNativeQuery("2026-04-10 00:00:00", 8100, "정규직");
		
		return recruitList;
		
	}
	
		
}
