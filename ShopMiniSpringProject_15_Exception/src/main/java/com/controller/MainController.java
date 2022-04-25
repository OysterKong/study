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
	
	@RequestMapping(value="/") //����Ʈ�� ������ �Ѹ���
	public ModelAndView goodsList() throws Exception {
		//int num = 10/0; //���� �׽�Ʈ��
		List<GoodsDTO> list = service.goodsList("top");
		System.out.println(list); // gCategory�� top�� �����۵� 12���� �����ͼ� ����
		ModelAndView mav = new ModelAndView();
		mav.addObject("goodsList", list);
		//request.setAttribute �� ����
		mav.setViewName("main"); // main.jsp
		return mav;
	}

}
