package rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserRestApp {
	
	public static void main(String [] args) {
		SpringApplication.run(UserRestApp.class, args );
	}
}

	/*
	 * rest 패키지 아래에 4개의 패키지 생성
	 * -----------------------------
	 * entity ( DTO 랑 역할이 같다 )
	 * service 
	 * store ( DAO 랑 역할이 같다 )  ( INTERFACE 역할 )
	 * controller
	 */
	
	

