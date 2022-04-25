package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter{
 //   /loginCheck/**     - ( * 은 하나만,  **은 여러개 가능하단 의미인것 기억 )
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle=========================" + handler);
		HttpSession session = request.getSession(); // LoginController에서 넣어준 dto 정보를 활용
		if(session.getAttribute("login") == null) { //로그인 안된경우
			response.sendRedirect("../loginForm");
			//  /loginCheck/** 주소시 /loginCheck 가 남아있게되어 /loginCheck/loginForm 주소요청이 됨,  ../ 이용하여 하나 위로 올려 찾아야함
			// servlet-context.xml
			return false; // 주의
		} else { // 로그인 시
			return true; // 주의
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
