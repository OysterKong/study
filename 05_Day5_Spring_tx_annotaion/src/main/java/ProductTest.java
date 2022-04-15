import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.entity.OrderDTO;
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
		
		List<OrderDTO> olist = service.selectOrder();
		for (OrderDTO dto : olist) {
			System.out.println(dto);
		}
		
		//상품 주문
		System.out.println("p01 상품 5개 주문합니다");
		try {
			service.addOrder("p01", 5); //add시 문제 발생
			//T_ORDER 에 INSERT, T_product
			
		} catch (Exception e) {
			System.out.println("에러가 발생하여 롤백처리");
		}
		
		list = service.selectProduct();
		for (ProductDTO dto : list) {
			System.out.println(dto);
		}
		
		List<OrderDTO> olist2 = service.selectOrder();
		System.out.println(olist2.size());
		for (OrderDTO dto : olist2) {
			System.out.println(dto);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
