package rest.service.logic;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import rest.entity.User;

@SpringBootTest
public class UserServiceLogicTest {
	
	@Autowired //자동주입
	private UserServiceLogic userService;
	
	private User kim;
	private User lee;
	
	@BeforeEach
	public void startUp() {
		this.kim = new User("kim", "kim@yusin.net");
		this.lee = new User("lee", "lee@sunsin.net");
		
		this.userService.register(kim);
		this.userService.register(lee);
	}
	
	@Test
	public void registerTest() {
		User sample = User.sample();
		
		assertThat(this.userService.register(sample)).isEqualTo(sample.getId());
		assertThat(this.userService.findAll().size()).isEqualTo(3);
		
		this.userService.remove(sample.getId());
	}
	
	@Test
	public void find() {
		assertThat(this.userService.find(lee.getId())).isNotNull();
		assertThat(this.userService.find(lee.getId()).getEmail())
		.isEqualTo(lee.getEmail());
	}
	
	
	@AfterEach
	public void cleanUp() {
		this.userService.remove(kim.getId());
		this.userService.remove(lee.getId());
	}
	
}
