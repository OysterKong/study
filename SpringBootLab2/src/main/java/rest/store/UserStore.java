package rest.store;

import java.util.List;

import rest.entity.User;

public interface UserStore {
	
	String create(User newUser);
	void update(User newUser);
	void delete(String id);
	
	User retrive(String id);
	List<User> retriveAll();

}
