package rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
	public String register(@RequestBody User newUser) {
		return userService.register(newUser);
	}
	
}
