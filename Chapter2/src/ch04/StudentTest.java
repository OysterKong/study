package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.setStudentName("이영호");
		studentLee.studentId = 12345;
		studentLee.address = "서울시 강남구";
		
		studentLee.showStudentInfo();
		
		
		Student studentKim = new Student();
		
		studentKim.setStudentName("김철수");
		studentKim.studentId = 67891;
		studentKim.address = "서울시 강북구";
		
		studentKim.showStudentInfo();
	}


}
