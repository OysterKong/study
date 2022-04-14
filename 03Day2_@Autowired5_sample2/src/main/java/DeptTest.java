import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class DeptTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		DeptDAO d = new DeptDAO();
//		DeptService s = new DeptService();
//		s.setDao(d);
//		System.out.println(s.getList());
		System.out.println("=======================");

		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/config.xml");
		DeptService service = ctx.getBean("deptService", DeptService.class);
		List<String> list = service.getList();
		System.out.println(list);
	}

}
