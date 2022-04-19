package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Login;


//DTO 에 @JsonIgnore 를 맴버변수에 달아주면 front 단으로 정보가 출력이 안됨

//@RestController   // 모든 주소처리 응답이  @RestController 로 자동 처리됨  , 일일히 @ResponseBody 달 필요가 없음 ( 비동기처리 할 부분만 모아서 달아주는게 효율적 )
@Controller //주의
public class TestController {
	
	@RequestMapping("/aaa")
	@ResponseBody
	public Login aaa() {    //@ResponseBody : 응답 jsp 없이 리턴데이터를 비동기로 response 응답
		System.out.println("aaa() 함수 호출============");
		Login login = new Login();
		login.setUserid("홍길동");
		login.setPasswd("1234");
		return login;
	}
	
	@RequestMapping("/bbb")
	@ResponseBody
	public ArrayList<Login> bbb() {
		System.out.println("bbb() 함수 호출============");
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("홍길동1", "10"));
		list.add(new Login("홍길동2", "20"));
		list.add(new Login("홍길동3", "30"));
		list.add(new Login("홍길동4", "40"));
		return list;
	}
	
	@RequestMapping("/ccc")
	@ResponseBody
	public HashMap<String, ArrayList<Login>> ccc() {
		HashMap<String, ArrayList<Login>> map = new HashMap<String, ArrayList<Login>>();
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("홍길동1", "10"));
		list.add(new Login("홍길동2", "20"));
		list.add(new Login("홍길동3", "30"));
		ArrayList<Login> list2 = new ArrayList<Login>();
		list2.add(new Login("유관순1", "10"));
		list2.add(new Login("유관순2", "20"));
		list2.add(new Login("유관순3", "30"));
		map.put("one", list);
		map.put("two", list2);
		return map;
	}
	
	//  ddd는 @ResponseBody 를 안쓰면 ResponseEntity<> 를 사용해야함  ,but @ResponseBody 이 편함
	@RequestMapping("/ddd")  //몬자열로 데이터를 받게 됨 home.jsp가 아님
	public ResponseEntity<Login> ddd(){
		System.out.println("ddd 호출됨===");
		Login login = new Login("윤동주", "20");
		ResponseEntity<Login> entity = ResponseEntity.status(200).body(login); //200 정상처리
		return entity;  // entity 객체에 상태값 body 추가 200정상 body에 추가
	}
	
	
	@RequestMapping("/eee")
	@ResponseBody
	public String eee() {
		return "hello"; // @ResponseBody 가 붙어있으면  hello.jsp 를 의미하는게 아니라 hello 문자열을 리턴하는 것이므로 착오말자
	}
	

}
