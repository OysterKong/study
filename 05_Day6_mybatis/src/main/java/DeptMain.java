import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.DeptDTO;
import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/dept.xml");
		DeptService service = ctx.getBean("deptService", DeptService.class);
		
		DeptDTO xx = new DeptDTO(99, "영업", "제주");
		
		int n = service.add(xx);
		System.out.println("add :" + n);
		int n2 = service.update(new DeptDTO(99, "aa", "aa"));
		System.out.println("update :" + n2);
		int n3 = service.delete(99);
		System.out.println("delete :" + n3);
		
		
		
		List<DeptDTO> list = service.select();
		for (DeptDTO d : list) {
			System.out.println(d);
		}

	}

}
