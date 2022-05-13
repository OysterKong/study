package rest.store.logic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import rest.entity.User;
import rest.store.UserStore;

@Repository
public class UserStoreLogic implements UserStore {
	
	private Map<String, User> userMap;
	
	public UserStoreLogic() {
		this.userMap = new HashMap<>();
	}
	
	//새로운 사용자를 db에 저장하고 저장된 id를 리턴해서 확인하는 기능 - 테스트
	@Override
	public String create(User newUser) {
		this.userMap.put(newUser.getId(), newUser);
		return newUser.getId();
	}

	@Override
	public void update(User newUser) {
		this.userMap.put(newUser.getId(), newUser);
	}

	@Override
	public void delete(String id) {
		this.userMap.remove(id);
	}

	@Override
	public User retrive(String id) {
		return this.userMap.get(id);
	}

	@Override
	public List<User> retriveAll() {
		return this.userMap.values().stream().collect(Collectors.toList());
	}

}
