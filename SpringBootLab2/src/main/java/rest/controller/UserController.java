package rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rest.entity.User;
import rest.service.UserService;

@RestController
//@RequiredArgsConstructor  //lombok에서 이 어노테이션을 붙이면 final이 붙은 변수에 대해서 생성자를 자동으로 만들어줌
public class UserController {
	
	@Autowired
	private UserService userService;
	//private final UserService userService;  //lombok일시
	
	@PostMapping("/users")
	public String register(@RequestBody User newUser) { //@RequestBody 는 많은 양의 데이터를 한번에 받기 위한 것(body에 담음) - post방식
		return userService.register(newUser);
	}
	
	@GetMapping("/users/{id}")
	public User find(@PathVariable String id) {  //@PathVariable는  header에 데이터를 담아오면 꺼내오는, 즉 , url에 데이터를 담아 보내는 get방식
		return userService.find(id);
	}
	
	@GetMapping("/users")
	public List<User> findAll(){
		return userService.findAll();
	}
	
	@PutMapping("/users") //@PutMapping 은 GetMapping 과 비슷한 방식, 실제 API 설계시 주소값을 바꾸는건 권장하지 않음
	public void modify(@RequestBody User newUser) {
		userService.modify(newUser);
	}
	
	@DeleteMapping("/users/{id}")
	public void remove(@PathVariable String id) {
		userService.remove(id);
	}
	
	
}
