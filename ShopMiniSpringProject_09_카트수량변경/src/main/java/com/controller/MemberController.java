package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService service;
	
	
	@RequestMapping(value="/loginCheck/memberUpdate")
	public String memberUpdate( MemberDTO m, HttpSession session) { //ȸ����������
		System.out.println("memberUpdate===="+ m);
		service.memberUpdate(m);
		//sysout update ����
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String userid = dto.getUserid();
		dto =  service.myPage(userid);
		session.setAttribute("login", dto); //�������� ���� �����
		return "redirect:../loginCheck/myPage";
		//return "redirect:../myPage"; //�ٽ� ��û    �� �Ʒ� �Ѵ� ����
	}
	
	@RequestMapping(value="loginCheck/myPage")
	public String myPage(HttpSession session) {
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String userid = dto.getUserid();
		dto = service.myPage(userid); //db���� id ��������
		System.out.println(dto); //�α��� �� id �� ����
		session.setAttribute("login", dto); //������  �ֽ������� id ���� ���ǿ� �����
		return "redirect:../myPage";  //�ּҿ� �ش��ϴ� �������� servlet-context�� ��ϻ��
	}
	
	//�Ʒ��� servlet-context.xml ����  <mvc:view-controller path="/myPage" view-name="myPage"/> �κ��� �ּ����� ������ �Ʒ� �ڵ�� myPage �� �ҷ����� ��, 
	// �ٸ� �ڵ尡 ������������ servlet-context �� ����ϴ� ������ ó��
//	@RequestMapping("/myPage")
//	public String aaa() {
//		return "myPage";
//	}
	
	
	@RequestMapping(value="/memberAdd")
	public String memberAdd(MemberDTO m, Model model) {
		service.memberAdd(m);
		model.addAttribute("success", "ȸ�����Լ���"); //ȸ�����Լ��� �� �޽��� ��µǵ���...
		return "main"; //main.jsp
	}

}
