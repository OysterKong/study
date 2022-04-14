package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DeptDAO;
import com.entry.DeptDTO;

@Service //소문자 deptService 클래스 이름사용
//@Scope(value="singleton")
public class DeptService {
	
	@Autowired
	DeptDAO dao;

	public DeptDAO getDao() {
		return dao;
	}

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
	
	public DeptDTO getInfo() {
		return dao.getInfo();
	}
	

}
