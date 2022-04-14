import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		
		//xml에서 bean이 하나밖에 없어서 id 값이 없어도 출력됨
		Student stu = ctx.getBean(Student.class);
		stu.getInfo();
		ctx.close();
		
	}

}
