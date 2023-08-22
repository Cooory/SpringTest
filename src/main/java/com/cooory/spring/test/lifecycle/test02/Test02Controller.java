package com.cooory.spring.test.lifecycle.test02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lifecycle/test02")
public class Test02Controller {

	@RequestMapping("/1")
	public List<Map<String, Object>> movieList() {
		List<Map<String, Object>> movieList = new ArrayList<>();
		Map<String, Object> map1 = new HashMap<>();
		map1.put("rate", 15);
		map1.put("director", "봉준호");
		map1.put("time", 131);
		map1.put("title", "기생충");
		movieList.add(map1);
		
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("rate", 0);
		map2.put("director", "로베트로 베니니");
		map2.put("time", 116);
		map2.put("title", "인생은 아름다워");
		movieList.add(map2);
		
		Map<String, Object> map3 = new HashMap<>();
		map3.put("rate", 12);
		map3.put("director", "크리스토퍼 놀란");
		map3.put("time", 147);
		map3.put("title", "인셉션");
		movieList.add(map3);
		
		Map<String, Object> map4 = new HashMap<>();
		map4.put("rate", 12);
		map4.put("director", "크리스토퍼 놀란");
		map4.put("time", 147);
		map4.put("title", "인셉션");
		movieList.add(map4);
		
		Map<String, Object> map5 = new HashMap<>();
		map5.put("rate", 15);
		map5.put("director", "프란시스 로센스");
		map5.put("time", 137);
		map5.put("title", "헝거게임");
		movieList.add(map5);
		
		return movieList;
	}
	
}
