import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {
//		DeptDAO d = new DeptDAO();
//		DeptService s = new DeptService(d);
//		System.out.println(s.getList());
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/config.xml");
		
		DeptService service = ctx.getBean("deptService",DeptService.class);
		List<String> list = service.getList();
		System.out.println(list);

	}

}
