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
	public String memberUpdate( MemberDTO m, HttpSession session) { //회원정보수정
		System.out.println("memberUpdate===="+ m);
		service.memberUpdate(m);
		//sysout update 갯수
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String userid = dto.getUserid();
		dto =  service.myPage(userid);
		session.setAttribute("login", dto); //새정보로 세션 덮어쓰기
		return "redirect:../loginCheck/myPage";
		//return "redirect:../myPage"; //다시 요청    위 아래 둘다 가능
	}
	
	@RequestMapping(value="loginCheck/myPage")
	public String myPage(HttpSession session) {
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String userid = dto.getUserid();
		dto = service.myPage(userid); //db에서 id 가져오기
		System.out.println(dto); //로그인 한 id 값 찍어보기
		session.setAttribute("login", dto); //가져온  최신정보인 id 값을 세션에 덮어쓰기
		return "redirect:../myPage";  //주소에 해당하는 페이지를 servlet-context에 등록사용
	}
	
	//아래는 servlet-context.xml 에서  <mvc:view-controller path="/myPage" view-name="myPage"/> 부분을 주석으로 막으면 아래 코드로 myPage 를 불러오는 것, 
	// 다만 코드가 지저분해지니 servlet-context 에 등록하는 것으로 처리
//	@RequestMapping("/myPage")
//	public String aaa() {
//		return "myPage";
//	}
	
	
	@RequestMapping(value="/memberAdd")
	public String memberAdd(MemberDTO m, Model model) {
		service.memberAdd(m);
		model.addAttribute("success", "회원가입성공"); //회원가입성공 시 메시지 출력되도록...
		return "main"; //main.jsp
	}

}
