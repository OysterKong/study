import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.entity.OrderDTO;
import com.entity.ProductDTO;
import com.service.ProductService;

public class DeptMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/product.xml");

		ProductService service = ctx.getBean("productService", ProductService.class);
		
		List <ProductDTO> list = service.select();
		for (ProductDTO s : list) {
			System.out.println(s);
		}
		
		System.out.println("p2 상품 5개 주문합니다.");
		
		try {
			service.addOrder("p02", 5);
		} catch (Exception e) {
			System.out.println("에러가 발생하여 롤백합니다.");
		}
		list = service.select();
		for (ProductDTO s : list) {
			System.out.println(s);
		}
		
		System.out.println("================================");
		
		List<OrderDTO> oList = service.selectOrder();
		for (OrderDTO z : oList) {
			System.out.println(z);
		}
		
		
	}

}
