package com.dao;

import org.springframework.stereotype.Repository;

import com.entry.DeptDTO;

@Repository("dao")  //이름을 명시하지 않으면 기본적으로 소문자 '클래스명'으로 설정됨
public class DeptDAO {
	
	public DeptDTO getInfo() {
		return new DeptDTO(100, "관리", "서울");
	}

}
