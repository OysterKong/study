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
	
	@RequestMapping("/list")//list.jsp
	public String list(Model m) {   //list.jsp
		System.out.println("list()=================");
		List<DeptDTO> list=service.list();
		//System.out.println(list);		
		m.addAttribute("list", list);
		return "list";//list.jsp
	}
	
	@RequestMapping("/add")
	public String add(DeptDTO dto) {
	//	System.out.println(dto);
		service.add(dto);
		return "redirect:list";
	}
	
	@RequestMapping("/update")
	public String update(DeptDTO dto) {
	//	System.out.println(dto);
		service.update(dto);
		return "redirect:list";
	}
	
	@RequestMapping("/del")
	public String del(String deptno) {
		System.out.println(deptno);	
		
		service.del(Integer.parseInt(deptno));		
		return "redirect:list";
	}

	
	
}
