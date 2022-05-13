package rest.service;

import java.util.List;

import rest.entity.User;

public interface UserService {
	
	String register(User newUser);
	void modify(User newUser);
	void remove(String id);
	
	User find(String id);
	List<User> findAll();

}
