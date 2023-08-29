package com.cooory.spring.test.jsp.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtorRepository {

	public int insertRealtor(
			@Param("office") String office
			, @Param("phoneNumber") String phoneNumber
			, @Param("address") String address
			, @Param("grade") String grade);
}
