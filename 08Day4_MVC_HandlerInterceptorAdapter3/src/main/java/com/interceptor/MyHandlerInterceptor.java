package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.controller.TestController;

public class MyHandlerInterceptor extends HandlerInterceptorAdapter {

	//main, home만 동작
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle=====" + handler);
		HttpSession session = request.getSession();
		//servlet-context.xml 에서 /main , /home 만 처리하도록 설정
		if(session.getAttribute("login")==null) {  //session 검사 , 로그인 정보가 있는지
		// 세션정보가 없으면 /loginFrom  불러옴 ( loginForm.jsp 가 아닌 /loginForm 임 )
		 response.sendRedirect("loginForm"); //servlet-context.xml 에서 /main, /home 만 처리하도록 설정 ( 2가지 주소만 interceptor 거치게끔 )
		}
		return true;  //true - 계속 진행
		//return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//controller 함수 호출 이후 실행
		System.out.println("postHandle====="+ handler);
		//원하는 controller 찾기
//		HandlerMethod method = (HandlerMethod)handler;
//		if(method.getBean() instanceof TestController) { //controller 가 TestController 인 경우
//			modelAndView.setViewName("login"); //login.jsp로 view 페이지 지정
//			modelAndView.addObject("data", "홍길동");	 //데이터 지정
//		}//end if
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion=====");
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("afterConcurrentHandlingStarted=====");
	}

	
}
