package com.cooory.spring.test.jpa.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cooory.spring.test.jpa.domain.Recruit;

@Repository
public interface RecruitRepository extends JpaRepository<Recruit, Integer> {

	// 1. id 로 조회
	// id가 8인 공고를 조회하고 아래와 같이 출력하세요.
	
	public List<Recruit> findById(int id);
	
	
	// 2. Parameter 조건 조회
	// Request Parameter로 전달 받은 company id로 해당하는 회사의 공고를 조회하세요.
	// 조회 결과를 아래와 같이 출력하세요.
	
	public List<Recruit> findByCompanyId(int companyId);
	
	
	// 3. 복합 조건 조회
	// 웹 back-end 개발자 이고 정규직인 공고를 조회하고 아래와 같이 출력하세요.
	
	public List<Recruit> findByPositionAndType(String position, String type);
	
	
//	4. 복합 조건 조회
//	정규직이거나 연봉이 9000 이상인 공고를 조회하고 아래와 같이 출력하세요.
//	메소드명 규칙을 검색해서 찾아보세요.
	
	public List<Recruit> findByTypeOrGreaterThan(String type, int salary);
}
