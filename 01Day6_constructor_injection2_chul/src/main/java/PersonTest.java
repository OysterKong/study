import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml"); //Person.java 속 생성자들 호출
		
		Person p1 = ctx.getBean("xxx", Person.class);
		System.out.println(p1.getInfo());  //getInfo 함수는 return 값이 홍길동으로 되어있어서 전부 홍길동 출력될거임
		Person p2 = ctx.getBean("xxx2", Person.class);
		System.out.println(p2.getInfo());
		Person p3 = ctx.getBean("xxx3", Person.class);
		System.out.println(p3.getInfo());
		Person p4 = ctx.getBean("xxx4", Person.class);
		System.out.println(p4.getInfo());
		
		

	}

}
