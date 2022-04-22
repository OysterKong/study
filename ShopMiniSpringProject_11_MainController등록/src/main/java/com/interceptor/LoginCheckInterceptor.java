package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter{
 //   /loginCheck/**     - ( * �� �ϳ���,  **�� ������ �����ϴ� �ǹ��ΰ� ��� )
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle=========================" + handler);
		HttpSession session = request.getSession(); // LoginController���� �־��� dto ������ Ȱ��
		if(session.getAttribute("login") == null) { //�α��� �ȵȰ��
			response.sendRedirect("../loginForm");
			//  /loginCheck/** �ּҽ� /loginCheck �� �����ְԵǾ� /loginCheck/loginForm �ּҿ�û�� ��,  ../ �̿��Ͽ� �ϳ� ���� �÷� ã�ƾ���
			// servlet-context.xml
			return false; // ����
		} else { // �α��� ��
			return true; // ����
		}
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterConcurrentHandlingStarted(request, response, handler);
	}
	
	

}
