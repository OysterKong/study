package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;

public class DeptService {
	
	@Autowired
	public DeptDAO dao;

	public DeptService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getList(){
		return dao.getList();
	}

	
}
