package ch06;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	
	
	public Student() {
		System.out.println("�⺻ ������ ����");
	}

	

	public Student(int studentNumber, String studentName, int grade) {
		super();
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}


	public String showStudentInfo() {
		
		return "�л��� �̸��� " + studentName + "�̰� �й��� " + studentNumber + "�̸� �г��� " + grade + "�г� �Դϴ�.";
				
	}
	
	

}
