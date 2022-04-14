import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		
		TestDAO dao = new TestDAO();  //드라이버 로딩 성공
		//dao.delete(5)
		ArrayList<TestDTO> list = dao.select();
		for(TestDTO s : list) { System.out.println(s); }
		

	}
}
