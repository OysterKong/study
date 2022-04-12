import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {
		
//		DeptDAO d = new DeptDAO();
//		DeptService s = new DeptService();
//		s.setDao(d);
//		System.out.println(s.getList());
		
		System.out.println("===================================================");
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/spring/config.xml");
		
		DeptService service = ctx.getBean("deptService", DeptService.class);
		List<String> list = service.getList();  //service.getList 호출을 통해 DeptDAO의 getList 호출
		System.out.println(list);

	}

}
