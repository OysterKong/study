import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Cat;
import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		//기본적인 java방식
//		Cat c = new Cat("나비", 10);
//		Person p = new Person("홍길동", 20, c);
//		System.out.println(p);
		System.out.println("======================================");
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		
		//person 얻기 , 이름, 나이, person이 가진 고양이의 이름, 나이 출력
		Person p1 = ctx.getBean("xxx", Person.class);
		System.out.println(p1.getUsername()+"\t"+p1.getAge()+"\t"+p1.getCat());
		Cat c1 = p1.getCat();
		System.out.println(c1);
		
	}

}
