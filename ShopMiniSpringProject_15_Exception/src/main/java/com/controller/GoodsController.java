package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.dto.OrderDTO;
import com.service.GoodsService;
import com.service.MemberService;

@Controller
public class GoodsController {
	
	@Autowired
	GoodsService service;
	
	@Autowired
	MemberService mService;
	
	@ExceptionHandler({Exception.class})
	public String errorPage() {
		return "error/error"; // error.error.jsp
	}
	
	
	@RequestMapping(value="/loginCheck/orderDone")
	public String orderDone(OrderDTO oDTO, int orderNum, HttpSession session, RedirectAttributes xxx ) throws Exception {
		System.out.println("�ֹ��ѻ�ǰ���� : " + oDTO + "\t" + "�ֹ���ȣ : "+ orderNum); //�ֹ��� ��ǰ�������� �ֹ���ȣ, ���̵�, �ֹ���¥�� ��������
		MemberDTO dto = (MemberDTO) session.getAttribute("login"); //���ǿ��� ���̵� ��������
		oDTO.setUserid(dto.getUserid());
		oDTO.setNum(orderNum);
		service.orderDone(oDTO, orderNum); //insert, delete
		xxx.addFlashAttribute("oDTO", oDTO);
		return "redirect:../orderDone";
	}	
	
	
	@RequestMapping(value="/loginCheck/orderConfirm")
	public String orderConfirm(@RequestParam("num") int num, HttpSession session, RedirectAttributes xxx) throws Exception {
		MemberDTO mDTO = (MemberDTO) session.getAttribute("login"); //���ǿ��� �α���Ű�� �����ͼ�
		String userid = mDTO.getUserid(); // �������̵� �̾ƿ���
		mDTO = mService.myPage(userid); // �������̵�� ��������� ��������
		CartDTO cDTO = service.orderConfirmByNum(num); //��ٱ��� ���� ��������
		System.out.println("�ֹ��� �ֹ���ȣ�� �������� : " +num);
		System.out.println("cart : " + cDTO);
		xxx.addFlashAttribute("mDTO", mDTO); // request �� ȸ�������� ����
		xxx.addFlashAttribute("cDTO", cDTO); // request �� īƮ������ ����
		return "redirect:../orderConfirm"; // serlvet-context �� ���
	}
	
	
	@RequestMapping(value="/loginCheck/delAllCart")
	public String delAllCart(@RequestParam("check") ArrayList<String> list) throws Exception { //String [] check �� ����
		System.out.println(list); // [] �迭���·� �Ѿ������
		System.out.println(list.size());
		service.delAllCart(list);
		return "redirect:../loginCheck/CartList"; //@RequestMapping(value="/loginCheck/CartList") �� ����
	}
			
	
	@RequestMapping(value="/loginCheck/cartDelete")
	@ResponseBody
	public void cartDelete(@RequestParam("num") int num) throws Exception {
		System.out.println(num);
		service.cartDelete(num);
	}
	
	
	@RequestMapping(value="/loginCheck/cartUpdate")
	@ResponseBody
	public void cartUpdate(@RequestParam Map<String, String> map) throws Exception {
		System.out.println(map); //�ֹ���ȣ num �� �ֹ����� gAmount �� �Ѿ���� �� Ȯ��
		service.cartUpdate(map); // db ������Ʈ ���� ���� ��� cartMapper.cartUpdate

	}
	
	@RequestMapping(value="/loginCheck/CartList")
	public String cartList(RedirectAttributes attr, HttpSession session) throws Exception { //RedirectAttribute ���ÿ��� servlet-context.xml�� annotation-driven�� ���־����
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String userid = dto.getUserid();
		//System.out.println(userid);
		List<CartDTO> list = service.cartList(userid);
		System.out.println(list);
		attr.addFlashAttribute("cartList", list); //�����̷�Ʈ�� ������ ����
		return "redirect:../cartList"; //serlvet-context �� ���
	}
	
	
	
	@RequestMapping(value="/loginCheck/cartAdd")
	public String cartAdd(CartDTO cart, HttpSession session	) throws Exception {
		MemberDTO mDTO = (MemberDTO) session.getAttribute("login");
		cart.setUserid(mDTO.getUserid());
		session.setAttribute("mesg", cart.getgCode());
		service.cartAdd(cart);
		//System.out.println(cart); //���� �ֹ��� ������ �������� Ȯ�� ( db�� ������͵� Ȯ�� )
		return "redirect:../goodsRetrieve?gCode="+cart.getgCode();  //��ٱ��Ͽ� ����� �ٽ� goodsRetrieve �� ���ư��� ( ȭ���� �ٽ� �ҷ������� )�� gCode�� ����־���ϹǷ�...cartDTO���� gCode�� �̾Ƽ�
	}
	
	
	@RequestMapping(value="/goodsRetrieve")  //goodsRetrive.jsp�� view ��û�������� ��
	@ModelAttribute("goodsRetrieve")  //Ű�� ����
	public GoodsDTO goodsRetrieve(@RequestParam("gCode") String gCode) throws Exception {
		GoodsDTO dto = service.goodsRetrieve(gCode);
		//System.out.println("dto���� : "+dto);
		return dto;
	}
	
	@RequestMapping(value="/goodsList")
	public ModelAndView goodsList(@RequestParam("gCategory") String gCategory) throws Exception {
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
