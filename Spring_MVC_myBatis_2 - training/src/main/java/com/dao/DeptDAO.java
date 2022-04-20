package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.DeptDTO;

@Repository
public class DeptDAO {
	
	@Autowired
	SqlSessionTemplate session;

	public List<DeptDTO> list() {
		// TODO Auto-generated method stub
		return session.selectList("DeptMapper.list");
	}

	public void add(DeptDTO dto) {
		session.insert("DeptMapper.add", dto);
		
	}

	public void update(DeptDTO dto) {
		session.update("DeptMapper.update", dto);
		
	}

	public void delete(int deptno) {
		session.delete("DeptMapper.del", deptno);
		
	}
	

}
