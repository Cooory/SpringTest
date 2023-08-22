package com.cooory.spring.test.lifecycle.test01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("lifecycle/test01")
public class Test01Controller {

	@ResponseBody
	@RequestMapping("/2")
	public String Test() {
		return "<h1>테스트 프로젝트 완성</h1>"
				+ "<h2>해당 프로젝트를 통해서 문제 풀이를 진행 합니다</h2>";
	}
	
	
	
	@ResponseBody
	@RequestMapping("/3")
	public Map<String, Integer> scoreData() {
		Map<String, Integer> scoreMap = new HashMap<>();
		scoreMap.put("국어", 80);
		scoreMap.put("수학", 90);
		scoreMap.put("영어", 85);
		
		return scoreMap;
	}
	

}
