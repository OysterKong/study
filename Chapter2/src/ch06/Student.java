package ch06;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	
	
	public Student() {
		System.out.println("기본 생성자 생성");
	}

	

	public Student(int studentNumber, String studentName, int grade) {
		super();
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}


	public String showStudentInfo() {
		
		return "학생의 이름은 " + studentName + "이고 학번은 " + studentNumber + "이며 학년은 " + grade + "학년 입니다.";
				
	}
	
	

}
