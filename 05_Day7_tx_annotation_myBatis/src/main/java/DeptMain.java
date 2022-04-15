import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.DeptDTO;
import com.entity.OrderDTO;
import com.entity.ProductDTO;
import com.service.ProductService;

public class DeptMain {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/product.xml");
		ProductService service= ctx.getBean("deptService", ProductService.class);
	
		List<ProductDTO> list= service.selectProduct();
		 
		
		for (ProductDTO d : list) {
			System.out.println(d);
		}
		
		// 상품 주문
		System.out.println("p01 상품 5개 주문합니다");
		try {
			service.addOrder("p01", 5);
		} catch (Exception e) {
			System.out.println("에러가 발생하여 롤백처리.");
		}
		
		list = service.selectProduct();
		for (ProductDTO dto : list) {
			System.out.println(dto);
		}
		System.out.println("==================================");
		List<OrderDTO> oList = service.selectOrder();
		for (OrderDTO dto : oList) {
			System.out.println(dto);
		}
	}

}
