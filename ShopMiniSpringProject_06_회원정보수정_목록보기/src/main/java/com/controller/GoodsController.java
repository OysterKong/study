package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dto.GoodsDTO;
import com.service.GoodsService;

@Controller
public class GoodsController {
	
	@Autowired
	GoodsService service;
	
	@RequestMapping(value="/goodsList")
	public ModelAndView goodsList(@RequestParam("gCategory") String gCategory) {
		if(gCategory==null) {
			gCategory="top";
		}
		//System.out.println("service : "+service);
		List<GoodsDTO> list = service.goodsList(gCategory);
		//System.out.println(list);   //db에서 Category 가 top인 옷들의 목록을 꺼내와서 찍어보기
		ModelAndView mav = new ModelAndView();
		mav.addObject("goodsList", list); // 가져온 list를 goodsList 라는 키로 저장 ( request.setAttribute("goodsList", list) 와 동일 )
		mav.setViewName("main"); // views 밑의 main.jsp를 찾아가서 goodsList.jsp  에서 목록을 뿌려줌
		return mav;
	}

}
