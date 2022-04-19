package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;


@Controller
public class TestController {
	
	//1. ����Ÿ�� String => �丸 �˷���
	@RequestMapping(value=("/aaa"), method = RequestMethod.GET)
	public String aaa() {
		System.out.println("aaa()�Լ� �����============");
		return "main";  //main.jsp
	}
	
	//1-2. redirect : �����ּҷ� ���ο� ��û , �����ּ��� return �������� ���� �������� ��
	@RequestMapping(value="/hhh", method = RequestMethod.GET)
	public String hhh(HttpServletRequest request) {
		System.out.println("hhh()�Լ� �����============");
		request.setAttribute("test", "ȫ�浿");  //���� �ȵ�
		return "redirect:aaa";  //redirect �� request.setAttribute ������ �ȵ� ( �ݵ�� ������ �� )
	}
	
	//2. ModelAndView => Model �� �並 ��� �˷���
	@RequestMapping(value="/bbb", method = RequestMethod.GET)
	public ModelAndView bbb() {
		System.out.println("bbb()�Լ� �����============");
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "ȫ�浿");
		mav.setViewName("main2"); //main.jsp
		return mav;  //ModelAndView ����
	}
	
	
	//3. ����Ÿ�� DTO => �𵨸� �˷��� , view �� �����Ƿ� �����̳ʰ� ���� (ccc.jsp) : url �� ���������� �̸��� ��
	@RequestMapping(value="/ccc", method = RequestMethod.GET)
	public LoginDTO ccc() {
		System.out.println("/ccc �����============");
		LoginDTO dto = new LoginDTO();
		dto.setUserid("ȫ�浿");
		dto.setPasswd("1234");
		return dto;  // ���������� �ƴ�, Ű���� �ҹ��� class�̸� loginDTO, �������� ���� ���� ��
	}
	
	//3. ����Ÿ�� DTO => �𵨸� �˷��� , view �� �����Ƿ� �����̳ʰ� ���� (ddd.jsp) : url �� ���������� �̸��� ��
	@RequestMapping(value="/ddd", method = RequestMethod.GET)
	@ModelAttribute("xxx") //Ű ���� xxx�� ��
	public LoginDTO xxx2() {
		System.out.println("/ddd �����============");
		LoginDTO dto = new LoginDTO();
		dto.setUserid("ȫ�浿");
		dto.setPasswd("1234");
		return dto;  // ���������� �ƴ�, Ű����  @ModelAttribute("xxx") // Ű���� xxx�� ��
	}
	
	//4. ����Ÿ�� ArrayList => �𵨸� �˷��� , view �� �����Ƿ� �����̳ʰ� ���� (eee.jsp) : url �� ���������� �̸��� ��
	@RequestMapping(value="/eee", method = RequestMethod.GET)
	@ModelAttribute("yyy") //Ű ���� xxx�� ��
	public ArrayList<String> eee() {
		System.out.println("/eee �����============");
		ArrayList<String> list = new ArrayList<String>();
		list.add("ȫ�浿01");
		list.add("ȫ�浿02");
		list.add("ȫ�浿03");
		return list;  // ���������� �ƴ�, Ű����  @ModelAttribute("yyy") // Ű���� yyy�� ��
	}
	
	//5. void ==> �𵨰� �並 ��� �Ⱦ˷��� view fff.jsp
	@RequestMapping(value="/fff", method=RequestMethod.GET)
	public void fff(HttpServletRequest request) {
		request.setAttribute("username", "ȫ�浿");  //Ű�� username
		System.out.println("/fff====================");
	}
	
	//6. void ==> �𵨰� �並 ��� �Ⱦ˷��� view ggg.jsp
	@RequestMapping(value="/ggg", method=RequestMethod.GET)
	public void ggg(Model m) {
		m.addAttribute("username", "ȫ�浿");  //Ű�� username
		System.out.println("/ggg====================");
	}


	
}
