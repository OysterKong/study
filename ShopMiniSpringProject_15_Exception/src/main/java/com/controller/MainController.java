package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.GoodsDTO;
import com.service.GoodsService;

@Controller
public class MainController {
	
	@Autowired
	GoodsService service;
	
	@ExceptionHandler({Exception.class})
	public String errorPage() {
		return "error/error"; // error.error.jsp
	}
	
	@RequestMapping(value="/") //리스트를 무조건 뿌리기
	public ModelAndView goodsList() throws Exception {
		//int num = 10/0; //에러 테스트용
		List<GoodsDTO> list = service.goodsList("top");
		System.out.println(list); // gCategory가 top인 아이템들 12개를 가져와서 찍어보기
		ModelAndView mav = new ModelAndView();
		mav.addObject("goodsList", list);
		//request.setAttribute 와 동일
		mav.setViewName("main"); // main.jsp
		return mav;
	}

}
