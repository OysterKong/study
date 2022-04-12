import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		
		Person p1 = ctx.getBean("xxx", Person.class);
		System.out.println(p1);
		
		Person p2 = (Person)ctx.getBean("xxx");
		System.out.println(p2);
		System.out.println(p2.getUsername());
		System.out.println(p2.getAge());
		
	}

}
