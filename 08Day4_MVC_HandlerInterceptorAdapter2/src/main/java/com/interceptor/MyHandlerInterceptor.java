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
		// response.sendRedirect("loginForm"; // ����, ��� �ּҿ� ���� ó���� �̷����
			//���� loginForm ȣ�� �� handler ȣ���� ������ �߻��� - ���� �ݺ��� �̷����
			//Ư���ּ� ó�������� �����ϵ��� �ۼ��� ����
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
		HandlerMethod method = (HandlerMethod)handler;
		if(method.getBean() instanceof TestController) { //controller �� TestController �� ���
			modelAndView.setViewName("login"); //login.jsp�� view ������ ����
			modelAndView.addObject("data", "ȫ�浿");	 //������ ����
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
