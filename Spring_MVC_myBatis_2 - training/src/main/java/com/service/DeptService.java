package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

@Service
public class DeptService {
	
	@Autowired
	DeptDAO dao;

	public List<DeptDTO> list() {
		
		return dao.list();
	}

	public void add(DeptDTO dto) {
		dao.add(dto);
		
	}

	public void update(DeptDTO dto) {
		dao.update(dto);
		
	}

	public void delete(int deptno) {
		dao.delete(deptno);
		
	}

}
