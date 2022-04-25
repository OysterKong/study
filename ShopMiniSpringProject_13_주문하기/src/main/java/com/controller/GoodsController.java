package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.service.GoodsService;
import com.service.MemberService;

@Controller
public class GoodsController {
	
	@Autowired
	GoodsService service;
	
	@Autowired
	MemberService mService;
	
	
	@RequestMapping(value="/loginCheck/orderConfirm")
	public String orderConfirm(@RequestParam("num") int num, HttpSession session, RedirectAttributes xxx) {
		MemberDTO mDTO = (MemberDTO) session.getAttribute("login"); //세션에서 로그인키로 가져와서
		String userid = mDTO.getUserid(); // 유저아이디 뽑아오고
		mDTO = mService.myPage(userid); // 유저아이디로 사용자정보 가져오기
		CartDTO cDTO = service.orderConfirmByNum(num); //장바구니 정보 가져오기
		System.out.println("주문시 주문번호가 찍히는지 : " +num);
		System.out.println("cart : " + cDTO);
		xxx.addFlashAttribute("mDTO", mDTO); // request 에 회원정보를 저장
		xxx.addFlashAttribute("cDTO", cDTO); // request 에 카트정보를 저장
		return "redirect:../orderConfirm"; // serlvet-context 에 등록
	}
	
	
	@RequestMapping(value="/loginCheck/delAllCart")
	public String delAllCart(@RequestParam("check") ArrayList<String> list) { //String [] check 도 가능
		System.out.println(list); // [] 배열형태로 넘어와찍힘
		System.out.println(list.size());
		service.delAllCart(list);
		return "redirect:../loginCheck/CartList"; //@RequestMapping(value="/loginCheck/CartList") 을 실행
	}
			
	
	@RequestMapping(value="/loginCheck/cartDelete")
	@ResponseBody
	public void cartDelete(@RequestParam("num") int num) {
		System.out.println(num);
		service.cartDelete(num);
	}
	
	
	@RequestMapping(value="/loginCheck/cartUpdate")
	@ResponseBody
	public void cartUpdate(@RequestParam Map<String, String> map) {
		System.out.println(map); //주문번호 num 과 주문수량 gAmount 가 넘어오는 것 확인
		service.cartUpdate(map); // db 업데이트 이후 갯수 출력 cartMapper.cartUpdate

	}
	
	@RequestMapping(value="/loginCheck/CartList")
	public String cartList(RedirectAttributes attr, HttpSession session) { //RedirectAttribute 사용시에는 servlet-context.xml에 annotation-driven이 꼭있어야함
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		String userid = dto.getUserid();
		//System.out.println(userid);
		List<CartDTO> list = service.cartList(userid);
		System.out.println(list);
		attr.addFlashAttribute("cartList", list); //리다이렉트시 데이터 유지
		return "redirect:../cartList"; //serlvet-context 에 등록
	}
	
	
	
	@RequestMapping(value="/loginCheck/cartAdd")
	public String cartAdd(CartDTO cart, HttpSession session	) {
		MemberDTO mDTO = (MemberDTO) session.getAttribute("login");
		cart.setUserid(mDTO.getUserid());
		session.setAttribute("mesg", cart.getgCode());
		service.cartAdd(cart);
		//System.out.println(cart); //내가 주문한 정보가 찍히는지 확인 ( db에 담겨진것도 확인 )
		return "redirect:../goodsRetrieve?gCode="+cart.getgCode();  //장바구니에 담고나서 다시 goodsRetrieve 로 돌아가는 ( 화면이 다시 불러와지는 )데 gCode가 담겨있어야하므로...cartDTO에서 gCode값 뽑아서
	}
	
	
	@RequestMapping(value="/goodsRetrieve")  //goodsRetrive.jsp가 view 요청페이지가 됨
	@ModelAttribute("goodsRetrieve")  //키값 지정
	public GoodsDTO goodsRetrieve(@RequestParam("gCode") String gCode) {
		GoodsDTO dto = service.goodsRetrieve(gCode);
		//System.out.println("dto찍어보기 : "+dto);
		return dto;
	}
	
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
