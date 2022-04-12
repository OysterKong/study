package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	
	public DeptDAO dao;
	
	public DeptService(DeptDAO dao) { //xml 에서 dao 주입
		//this.dao = new DeptDAO();
		System.out.println("public Deptservice(DeptDAO dao)생성자 호출됨");
		this.dao=dao;
	}
	
	public List<String> getList(){
		return dao.getList();
	}

}
