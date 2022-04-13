

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:person.xml");
		Person p1= ctx.getBean("onePerson", Person.class);
		Person p2= ctx.getBean("onePerson", Person.class);
		System.out.println(p1==p2);
		System.out.println(p1.getCat()+"\t"+p1.getDog());
//		System.out.println(p.getUsername());
//		System.out.println(p.getCat().getCatName()+"\t"+ p.getCat().getCatAge());
//		System.out.println(p.getDog().getDogName()+"\t"+ p.getDog().getDogAge());

	}

}
