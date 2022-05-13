package rest.entity;

import java.util.UUID;

import com.google.gson.Gson;

//@Getter - lombok에서 getter기능
//@Setter - lombok에서 setter기능


public class User {
	
	private String id;
	private String name;
	private String email;
	
	public User() {
		this.id = UUID.randomUUID().toString();      //static 속성, 랜덤하게 ID를 뽑아주는데 중복되지 않음 (java.util에 속함) - randomUUID
		//System.out.println(this.id);
	}
	
	public User(String name, String email) {
		this(); //기본생성자 호출은 반드시 첫줄에서 해줘야함
		this.name = name;
		this.email = email;
	}
	
	public static User sample() {
		return new User("Hong", "hong@gildong.net");
	}
	
	
	
	
	
	
//	main함수 만들어서 테스트해보기
	public static void main(String[] args) {
		//System.out.println(new User());
		User user = new User("kim", "kim@yusin.net");
		//System.out.println(user); //객체주소
		//System.out.println(user.id); //객체아이디
		//System.out.println(user.name); //객체이름
		//System.out.println(user.email); //객체이메일
		//System.out.println(user.getId());
		System.out.println(new Gson().toJson(user)); //일반 텍스트를 Json형태로 바꿔주는 기능  Gson 에 toJson 기능이 들어있음
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
}
