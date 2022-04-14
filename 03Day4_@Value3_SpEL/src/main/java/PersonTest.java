import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		
		Person p = ctx.getBean("xxx", Person.class);
		
		System.out.println(p.getUsername()+"\t"+p.getAge());
		System.out.println(p.toString());

	}

}
