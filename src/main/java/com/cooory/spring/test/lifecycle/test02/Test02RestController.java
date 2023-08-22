package com.cooory.spring.test.lifecycle.test02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lifecycle/test02")
public class Test02RestController {

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
	
	
	@RequestMapping("/2")
	public List<Post> postList() {
		List<Post> postList = new ArrayList<>();
		
		Post post = new Post("안녕하세요 가입인사 드립니다.", "cooory", "안녕하세요. 가입했어요. 앞으로 잘 부탁드립니다.");
		postList.add(post);
		post = new Post("헐 대박.", "bada", "오늘 목요일이었어... 금요일인줄");
		postList.add(post);
		post = new Post("오늘 데이트 한 이야기 해드릴게요.", "dulmary", "....");
		postList.add(post);
		return postList;
	}
	
	
	@RequestMapping("/3")
	public ResponseEntity<Post> postError() {
		Post post = new Post("안녕하세요 가입인사 드립니다.", "cooory", "안녕하세요. 가입했어요. 앞으로 잘 부탁드립니다.");
		
		ResponseEntity<Post> entity = new ResponseEntity<>(post, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
	}
	
}
