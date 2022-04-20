package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.DeptDTO;
import com.service.DeptService;

@Controller
public class TestController {
	
	@Autowired
	DeptService service;
	
	@RequestMapping("/list")
	public String list(Model m) {
		List<DeptDTO> list = service.list();
		System.out.println(list);
		m.addAttribute("list", list);
		return "list";
	}
	
	@RequestMapping("/add")
	public String add(DeptDTO dto) {
		service.add(dto);
		return "redirect:list";
	}
	
	@RequestMapping("/update")
	public String update(DeptDTO dto) {
		service.update(dto);
		return "redirect:list";
	}
	
	@RequestMapping("/del")
	public String del(String deptno) {
		System.out.println(deptno);
		service.delete(Integer.parseInt(deptno));
		return "redirect:list";
	}

}
