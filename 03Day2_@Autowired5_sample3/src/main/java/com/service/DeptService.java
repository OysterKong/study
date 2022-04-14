package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.dao.DeptDAO;

public class DeptService {
	
	//@Autowired
	@Resource
	DeptDAO dao;
	
	@Value("${jdbc.driver}")
	String driver;
	@Value("${jdbc.url}")
	String url;
	@Value("${jdbc.userid}")
	String username;
	@Value("${jdbc.passwd}")
	String passwd;

	public DeptService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getList(){
		return dao.getList();
	}

	@Override
	public String toString() {
		return "DeptService [dao=" + dao + ", driver=" + driver + ", url=" + url + ", username=" + username
				+ ", passwd=" + passwd + "]";
	}
	
	
}
