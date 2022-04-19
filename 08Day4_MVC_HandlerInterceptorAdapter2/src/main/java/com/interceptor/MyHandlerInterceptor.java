package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.controller.TestController;

public class MyHandlerInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle=====" + handler);
		HttpSession session = request.getSession();
		if(session.getAttribute("login")==null) {
		// response.sendRedirect("loginForm"; // 주의, 모든 주소에 대한 처리가 이루어져
			//최초 loginForm 호출 시 handler 호출의 문제가 발생됨 - 무한 반복이 이루어짐
			//특정주소 처리에서만 동작하도록 작성할 예정
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
		HandlerMethod method = (HandlerMethod)handler;
		if(method.getBean() instanceof TestController) { //controller 가 TestController 인 경우
			modelAndView.setViewName("login"); //login.jsp로 view 페이지 지정
			modelAndView.addObject("data", "홍길동");	 //데이터 지정
		}//end if
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
