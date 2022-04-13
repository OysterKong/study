import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Cat;
import com.spring.Dog;
import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		
		Person p = ctx.getBean("onePerson", Person.class);
		Cat c = p.getCat();
		
		System.out.println(c.getCatName()+"\t"+c.getCatAge());
		System.out.println(p.getDog());
		//Dog d = p.getDog();
		//System.out.println(p.getCat().getCatName()+"\t"+(p.getCat().getCatAge()));

	}

}
