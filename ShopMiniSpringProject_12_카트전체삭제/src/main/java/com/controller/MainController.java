package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.GoodsDTO;
import com.service.GoodsService;

@Controller
public class MainController {
	
	@Autowired
	GoodsService service;
	
	@RequestMapping(value="/") //����Ʈ�� ������ �Ѹ���
	public ModelAndView goodsList() {
		List<GoodsDTO> list = service.goodsList("top");
		System.out.println(list); // gCategory�� top�� �����۵� 12���� �����ͼ� ����
		ModelAndView mav = new ModelAndView();
		mav.addObject("goodsList", list);
		//request.setAttribute �� ����
		mav.setViewName("main"); // main.jsp
		return mav;
	}

}
