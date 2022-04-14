import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.entity.ProductDTO;
import com.service.ProductService;

public class ProductTest {

	public static void main(String[] args) {
		
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("dept.xml");
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("dept.xml");

		ProductService service = ctx.getBean("deptService", ProductService.class);
		
		List<ProductDTO> list = service.selectProduct();
		for (ProductDTO dto : list) {
			System.out.println(dto);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
