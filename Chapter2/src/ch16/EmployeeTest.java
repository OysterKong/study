package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		System.out.println(employeeLee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		
		
		//두개의 인스턴스( lee, kim ) 가 하나의 메모리를 공유한다...
		System.out.println(employeeLee.getEmployeeName()+ "님의 사번은" + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName()+ "님은 사번은" + employeeKim.getEmployeeId());

	}

}
