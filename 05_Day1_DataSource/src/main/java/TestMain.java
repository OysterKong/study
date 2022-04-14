import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.TestDAO;
import com.dto.TestDTO;

public class TestMain {

	public static void main(String[] args) {
		//DataSource 만을 이용한 db접속
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:config.xml");
		TestDAO dao = ctx.getBean("dao", TestDAO.class);
		dao.delete(5);
		dao.insert(5, "유재석", "서울");
		dao.update(5, "유재석", "제주");
		ArrayList<TestDTO> list = dao.select();
		for (TestDTO s : list) {
			System.out.println(s);
		}
		

	}
}
