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
		//System.out.println(list);   //db���� Category �� top�� �ʵ��� ����� �����ͼ� ����
		ModelAndView mav = new ModelAndView();
		mav.addObject("goodsList", list); // ������ list�� goodsList ��� Ű�� ���� ( request.setAttribute("goodsList", list) �� ���� )
		mav.setViewName("main"); // views ���� main.jsp�� ã�ư��� goodsList.jsp  ���� ����� �ѷ���
		return mav;
	}

}
