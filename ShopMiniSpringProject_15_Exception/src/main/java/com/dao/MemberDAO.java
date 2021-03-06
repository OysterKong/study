package com.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.MemberDTO;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate template;  //자동 주입위해 @Autowired , template 는 rootcontext.xml 에서 설정해둠

	public void memberAdd(MemberDTO m) throws Exception {
		int n = template.insert("MemberMapper.memberAdd", m);
		//System.out.println("insert 갯수 : " + n);  // insert 확인용 , 회원가입이 문제없이 완료도면 ( db에 입력 ) insert 갯수가 1이 찍혀야 성공- db 최종확인
		
	}

	public MemberDTO login(Map<String, String> map) throws Exception {
		MemberDTO dto = template.selectOne("MemberMapper.login", map);
		return dto;
	}

	public MemberDTO myPage(String userid) throws Exception {
		MemberDTO dto = template.selectOne("MemberMapper.mypage", userid);
		return dto;
	}

	public void memberUpdate(MemberDTO m) throws Exception {
		template.update("MemberMapper.memberUpdate", m);
		
	}


}
