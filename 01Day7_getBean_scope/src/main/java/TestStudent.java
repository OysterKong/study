import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/student.xml");
		
		Student stu1 = (Student)ctx.getBean("stu");
		Student stu2 = (Student)ctx.getBean("stu");  //xml에서 scope에 prototype인 경우 get을 할때마다 새롭게 생성, default 값은 singleton
		System.out.println(stu1==stu2);  //true , 주소비교
		
//		Student stu3 = (Student)ctx.getBean("stu2");
//		System.out.println(stu1==stu3);  //false , 주소비교
		
		
		
		
	}

}
