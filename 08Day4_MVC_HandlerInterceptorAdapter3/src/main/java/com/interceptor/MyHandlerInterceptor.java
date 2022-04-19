package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.controller.TestController;

public class MyHandlerInterceptor extends HandlerInterceptorAdapter {

	//main, home�� ����
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle=====" + handler);
		HttpSession session = request.getSession();
		//servlet-context.xml ���� /main , /home �� ó���ϵ��� ����
		if(session.getAttribute("login")==null) {  //session �˻� , �α��� ������ �ִ���
		// ���������� ������ /loginFrom  �ҷ��� ( loginForm.jsp �� �ƴ� /loginForm �� )
		 response.sendRedirect("loginForm"); //servlet-context.xml ���� /main, /home �� ó���ϵ��� ���� ( 2���� �ּҸ� interceptor ��ġ�Բ� )
		}
		return true;  //true - ��� ����
		//return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//controller �Լ� ȣ�� ���� ����
		System.out.println("postHandle====="+ handler);
		//���ϴ� controller ã��
//		HandlerMethod method = (HandlerMethod)handler;
//		if(method.getBean() instanceof TestController) { //controller �� TestController �� ���
//			modelAndView.setViewName("login"); //login.jsp�� view ������ ����
//			modelAndView.addObject("data", "ȫ�浿");	 //������ ����
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
