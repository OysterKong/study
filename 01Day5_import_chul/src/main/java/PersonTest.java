import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Animal;
import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/kkk/animal.xml");
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/kkk/person.xml");
		
		Person p1 = ctx.getBean("xxx", Person.class);
		System.out.println(p1.getInfo());
		Animal p2 = ctx.getBean("yyy", Animal.class);
		System.out.println(p2.getName());
		
		Animal p3 = (Animal)ctx.getBean("yyy");
		System.out.println(p3.getName());
	}

}
