package com.cooory.spring.test.ajax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cooory.spring.test.ajax.domain.Booking;
import com.cooory.spring.test.ajax.service.BookingService;

@RequestMapping("/ajax/treeHouse")
@Controller
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	
	@GetMapping("/list")
	public String TreeHouseList(Model model) {
		
		List<Booking> bookingList = bookingService.getBookingList();
		
		model.addAttribute("bookingList", bookingList);
		
		return "/ajax/treeHouse/list";
	}
	
	
	@GetMapping("/input")
	public String TreeHouseInput() {
		
		
		
		return "/ajax/treeHouse/input";
	}
	
	@GetMapping("/main")
	public String TreeHouseMain() {
		
		
		
		return "/ajax/treeHouse/main";
	}
}
