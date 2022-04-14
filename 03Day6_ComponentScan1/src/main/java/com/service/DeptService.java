package com.service;

import org.springframework.stereotype.Component;

@Component  //id 지정이 없는 경우 소문자 class이름이 id가 됨 ( deptService )
//@Component("test")
public class DeptService {
	
	public String getService() {
		return "DeptService.getService() 호출됨";
	}

}
