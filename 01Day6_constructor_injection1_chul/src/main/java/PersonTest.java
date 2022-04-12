import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		
		Person p1 = ctx.getBean("xxx", Person.class);
		System.out.println(p1.getInfo());
		System.out.println(p1.getName());
		
		Person p2 = ctx.getBean("test", Person.class);
		System.out.println(p2.getName()); // person.xml 에 기본생성자만 생성되어있고 값이 안들어가있으니 null 값

	}

}
