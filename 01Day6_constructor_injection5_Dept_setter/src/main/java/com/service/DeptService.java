package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {

	public DeptDAO dao;
	
	
	public DeptService() {
		super();
		System.out.println("service 기본생성자 호출됨");
	}

	public List<String> getList(){
		return dao.getList();
	}

	public DeptDAO getDao() {
		return dao;
	}
	
	public void setTest(String test) {}

	public void setDao(DeptDAO dao) {
		System.out.println("set 함수 호출 ========================================");
		this.dao = dao;
	}
	
	
}
