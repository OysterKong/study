package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

public class DeptService {
	
	@Autowired
	DeptDAO dao;

	public DeptDAO getDao() {
		return dao;
	}

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

	public List<DeptDTO> select() {
		return dao.select();
	}

	public int add(DeptDTO dto) {
		return dao.insert(dto);
	}
	
	public int update(DeptDTO dto) {
		return dao.update(dto);
	}
	
	public int delete(int deptno) {
		return dao.delete(deptno);
	}
	
	

}
