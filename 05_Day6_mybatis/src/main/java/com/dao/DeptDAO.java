package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.dto.DeptDTO;

public class DeptDAO {
	
	@Autowired
	SqlSessionTemplate session;  //기존의 SqlSession 과 동일

	public SqlSessionTemplate getSession() {
		return session;
	}

	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}

	public List<DeptDTO> select() {
		return session.selectList("selectAll");
	}

	public int insert(DeptDTO dto) {
		return session.insert("insert",dto);
	}
	
	public int update(DeptDTO dto) {
		return session.update("update",dto);
	}
	
	public int delete(int deptno) {
		return session.delete("delete",deptno);
	}


	
	

}
