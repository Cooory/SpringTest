package com.cooory.spring.test.ajax.repository;

import java.util.List;

import com.cooory.spring.test.ajax.domain.Booking;

public interface BookingRepository {

	public List<Booking> selectBookingList();
}
