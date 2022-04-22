package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.service.GoodsService;

@Controller
public class GoodsController {
	
	@Autowired
	GoodsService service;
	
	@RequestMapping(value="loginCheck/cartAdd")
	public String cartAdd(CartDTO cart, HttpSession session	) {
		MemberDTO mDTO = (MemberDTO) session.getAttribute("login");
		cart.setUserid(mDTO.getUserid());
		session.setAttribute("mesg", cart.getgCode());
		service.cartAdd(cart);
		//System.out.println(cart); //���� �ֹ��� ������ �������� Ȯ�� ( db�� ������͵� Ȯ�� )
		return "redirect:../goodsRetrieve?gCode="+cart.getgCode();  //��ٱ��Ͽ� ����� �ٽ� goodsRetrieve �� ���ư��� ( ȭ���� �ٽ� �ҷ������� )�� gCode�� ����־���ϹǷ�...cartDTO���� gCode�� �̾Ƽ�
	}
	
	
	@RequestMapping(value="/goodsRetrieve")  //goodsRetrive.jsp�� view ��û�������� ��
	@ModelAttribute("goodsRetrieve")  //Ű�� ����
	public GoodsDTO goodsRetrieve(@RequestParam("gCode") String gCode) {
		GoodsDTO dto = service.goodsRetrieve(gCode);
		//System.out.println("dto���� : "+dto);
		return dto;
	}
	
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
