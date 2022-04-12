package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	
	public DeptDAO dao;
	
	public DeptService() { //xml 에서 dao 주입
		//this.dao = new DeptDAO();
		System.out.println("public Deptservice()생성자 호출됨");
		this.dao= new DeptDAO();
	}
	
	public List<String> getList(){
		return dao.getList();
	}

}
