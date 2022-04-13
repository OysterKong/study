import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//main : Student 를 get 하여 map을 얻고 전체 데이터를 순회 출력 : pet의 이름, 나이 출력
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:stu.xml");
		
		Student stu = ctx.getBean("firstStudent", Student.class);
		Map<String, Cat> map = stu.getMapCat();
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(map.get(key));
		}
		System.out.println("========================");
		Properties props = stu.getPhones();
		Set<String> xxx = props.stringPropertyNames();
		for (String key : xxx) {
			System.out.println(props.get(key));
		}
		
	}

}
