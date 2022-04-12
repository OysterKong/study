import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		//1. 기존방법: 객체의 직접 호출 및 생성
		Person p = new Person();
		String m = p.getInfo();
		System.out.println(m);

		//src/main/resources폴더및 person.xml <bean id="xxx" class="com.spring.Person"> </bean>
		//마우스오른쪽  spring bean configuration.xml

		
		GenericXmlApplicationContext ctx = new
		GenericXmlApplicationContext("file:\\c:\\upload\\person.xml"); // c드라이브 - upload 폴더 안의 person.xml 을 로딩 시킨다 생각하면 된다.
		
		Person p1 = ctx.getBean("xxx", Person.class);
		System.out.println(p1.getInfo());
		
		Person p2 = (Person)ctx.getBean("xxx");
		System.out.println(p2.getInfo());
		
	}

}
