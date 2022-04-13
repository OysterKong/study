import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/person.xml");
		
		Person p1 = ctx.getBean("one", Person.class);
		System.out.println(p1.getUsername()+"\t"+p1.getAge()+"\t"+p1.getCat().getCatName()+
				"\t"+p1.getCat().getCatAge()+"\t"+p1.getDog().getDogName()+"\t"+p1.getDog().getDogAge());
		
		Person p2 = ctx.getBean("two", Person.class);
		System.out.println(p2.getUsername()+"\t"+p2.getAge()+"\t"+p2.getCat().getCatName()+
				"\t"+p2.getCat().getCatAge()+"\t"+p2.getDog().getDogName()+"\t"+p2.getDog().getDogAge());
		
	}

}
