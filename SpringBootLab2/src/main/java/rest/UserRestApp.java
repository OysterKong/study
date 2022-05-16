package rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //main클래스의 역할을 하도록 생성
public class UserRestApp {
	
	public static void main(String [] args) {
		SpringApplication.run(UserRestApp.class, args );
	}
}

	/*
	 * rest 패키지 아래에 4개의 패키지 생성
	 * -----------------------------
	 * entity ( DTO 랑 역할이 같다 )
	 * service ( 반드시 있어야하는건 아니지만 의존성<직접적으로 연결되는 것을 막기 위한>, 유지보수를 위해... )
	 * store ( DAO 랑 역할이 같다 )  ( INTERFACE 역할 )
	 * controller
	 */
	
	

