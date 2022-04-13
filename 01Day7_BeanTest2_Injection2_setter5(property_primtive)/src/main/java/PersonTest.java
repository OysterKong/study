

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		Person p= ctx.getBean("one", Person.class);
		System.out.println(p.getUsername());
		System.out.println(p.getCat().getCatName()+"\t"+ p.getCat().getCatAge());
		System.out.println(p.getDog().getDogName()+"\t"+ p.getDog().getDogAge());

	}

}
