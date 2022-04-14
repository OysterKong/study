import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		
		TestDAO dao = new TestDAO();  //드라이버 로딩 성공
		dao.insert(10, "pppp", "pppp");
		ArrayList<TestDTO> list = dao.select();
		for(TestDTO s : list) { System.out.println(s); }
		

	}
}
