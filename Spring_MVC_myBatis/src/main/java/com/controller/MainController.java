package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.DeptDTO;
import com.member.service.MemberService;

@Controller
public class MainController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping("/list")
	public void list(Model m) {  //void 타입이니 return 이 없으므로 url 이 요청값 ( list.jsp )
		System.out.println("list()=================");
		List<DeptDTO> list = service.list();
		System.out.println(list);
		m.addAttribute("list", list);  // "list" 라는 키로 list 를 전달, jsp 단에서 뽑아출력
	}

}
