package com.cooory.spring.test.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.cooory.spring.test.mybatis.domain.RealEstate;

@Repository
public interface RealEstateRepository {
	// 전달 받은 id와 일치하는 한 행의 매물 정보를 돌려주는 기능
	public RealEstate selectRealEstate(@Param("id") int id);
	
	// 전달 받은 웰세보다 낮은 매물 정보 행들을 돌려주는 기능
	public List<RealEstate> selectRealEstateByRentPrice(@Param("rentPrice") int rentPrice);
	
	// 가격 넓이 조건에 맞는 매물 정보 행을 돌려주느 기능
	public List<RealEstate> selectRealEstateByAreaAndPrice(
			@Param("area") int area
			, @Param("price") int price);
	
	// INSERT 1
	public int insertRealEstateByObject(RealEstate realestate);
	
	// INSERT 2
	public int insertRealEstateByField(
			@Param("realtorId") int realtorId
			, @Param("address") String address
			, @Param("area") int area
			, @Param("type") String type
			, @Param("price") int price
			, @Param("rentPrice") int rentPrice);
	
	// UPDATE
	public int updateRealEstate( // 쿼리 수행 메소드
			@Param("id") int id      // myBatis를 통함
			, @Param("type") String type
			, @Param("price") int price);
	
	// DELETE
	public int deleteRealEstate(@Param("id") int id);
}
