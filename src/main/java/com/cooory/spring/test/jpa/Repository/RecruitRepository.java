package com.cooory.spring.test.jpa.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cooory.spring.test.jpa.domain.Recruit;

@Repository
public interface RecruitRepository extends JpaRepository<Recruit, Integer> {


	
	
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
	
	public List<Recruit> findByTypeOrSalaryGreaterThanEqual(String type, int salary);
	
	
//	5. 정렬 제한 조건(/lesson07/quiz02/5)
//	계약직 목록을 연봉 기준으로 내림차순 정렬해서 3개만 조회하세요.
//	조회 결과를 아래와 같이 출력하세요.
// 	type 컬럼이 일치하는 행을 염봉 기준으로 내림차순으로 3개 조회
//  WHERE `type` = ?? ORDER BY `salary` DESC LIMIT 3
	public List<Recruit> findTop3ByTypeOrderBySalaryDesc(String type);
	
	
	
//	6. 범위 조회 (/lesson07/quiz02/6)
//	성남시 분당구가 지역인 연봉 7000 이상 8500 이하인 공고를 조회하고 아래와 같이 출력하세요.
// 	region 컬럼이 일치하고  salary 컬럼이 특정값 사이의 조건에 대응되는 행 조회
// 	WHERE `region` = ?? AND `salary` BETWEEN ?? AND ??
	public List<Recruit> findByRegionAndSalaryBetween(String region, int salaryStart, int salaryEnd);
	
	
//	7. Native query(/lesson07/quiz02/7)
//	마감일이 2026-04-10 이후이고 연봉이 8100 이상인 정규직 공고를 연봉 내림차순으로 조회하세요.
//	조회 결과를 아래와 같이 출력하세요.
//	deadline 컬럼이 특정 값보다 크고 salary가 특정 값 보다 크고 type이 일치하는 데이터를 연봉 내림차순으로 조회
	
	@Query(value="SELECT * FROM `recruit` "
			+ "WHERE `deadline` > :deadline "
			+ "AND `salary` >= :salary "
			+ "AND `type` = :type "
			+ "ORDER BY `salary` DESC", nativeQuery=true) 
	public List<Recruit> findByNativeQuery(
			@Param("deadline") String deadline
			, @Param("salary") int salary
			, @Param("type") String type);
	
}
