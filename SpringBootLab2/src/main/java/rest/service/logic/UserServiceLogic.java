package rest.service.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rest.entity.User;
import rest.service.UserService;
import rest.store.UserStore;

@Service
//@RequiredArgsConstructor  //lombok에서 이 어노테이션을 붙이면 final이 붙은 변수에 대해서 생성자를 자동으로 만들어줌
public class UserServiceLogic implements UserService {
	
	@Autowired
	private UserStore userStore;
	//private final UserStore userStore; - lombok 사용시에는 @Autowired 없애고 @RequiredArgsConstructor 를 붙이고 final을 붙여줘여함
	
//	public UserServiceLogic(UserStore userStore) {
//		this.userStore = userStore;
//	}

	@Override
	public String register(User newUser) {
		return this.userStore.create(newUser);
	}

	@Override
	public void modify(User newUser) {
		this.userStore.update(newUser);

	}

	@Override
	public void remove(String id) {
		this.userStore.delete(id);

	}

	@Override
	public User find(String id) {
		return this.userStore.retrive(id);
	}

	@Override
	public List<User> findAll() {
		return this.userStore.retriveAll();
	}

}
