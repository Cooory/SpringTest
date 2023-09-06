package com.cooory.spring.test.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cooory.spring.test.ajax.domain.Favorite;
import com.cooory.spring.test.ajax.service.FavoriteService;

@Controller
public class FavoriteController {
	
	@Autowired
	private FavoriteService favoriteService;
	
	@GetMapping("/ajax/input")
	public String favoriteInput(Model model) {
		
		List<Favorite> favoriteList = favoriteService.getFavoriteList();
		
		model.addAttribute("favoriteList", favoriteList);
		
		return "ajax/favoriteInput";
	}
	

	@GetMapping("/ajax/list")
	public String favoriteList(Model model) {
		
		List<Favorite> favoriteList = favoriteService.getFavoriteList();
		
		model.addAttribute("favoriteList", favoriteList);
		
		
		return "ajax/favoriteList";
	}
	
	@PostMapping("/ajax/create")
	@ResponseBody
	public Map<String, String> createFavorite(
			@RequestParam("name") String name
			,@RequestParam("url")  String url) {
		
		int count = favoriteService.addFavorite(name, url);
		
		// 성공  : {"result":"success"}
		// 실패 : {"result":"fail"}
		
		Map<String, String> resultMap = new HashMap<>();
		
		if (count == 1) {
			resultMap.put("result", "success");
		} else {
			resultMap.put("result", "fail");
		}
		
		return resultMap;
	}
	
	@GetMapping("/ajax/duplicate-url")
	@ResponseBody
	public Map<String, Boolean> isDuplicateUrl(@RequestParam("url") String url) {
		
//		boolean isDuplicate = favoriteService.isDuplicateUrl(url);
		
		// 중복됨 {"isDuplicate":true}
		// 중복 안됨 {"isDuplicate":false}
		
		Map<String, Boolean> resultMap = new HashMap<>();
		
//		if (favoriteService.isDuplicateUrl(url)) {
//			resultMap.put("isDuplicate", true);
//		} else {
//			resultMap.put("isDuplicate", false);
//		}
		
		resultMap.put("isDuplicate", favoriteService.isDuplicateUrl(url));
		
		return resultMap;
		
	}
	
} 