package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.setStudentName("�̿�ȣ");
		studentLee.studentId = 12345;
		studentLee.address = "����� ������";
		
		studentLee.showStudentInfo();
		
		
		Student studentKim = new Student();
		
		studentKim.setStudentName("��ö��");
		studentKim.studentId = 67891;
		studentKim.address = "����� ���ϱ�";
		
		studentKim.showStudentInfo();
	}


}
