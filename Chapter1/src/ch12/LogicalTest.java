package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 = num1 + 10)  < 10) && ( (i = i+2) <10 );
		//short circuit operation 
		System.out.println(value); //false  ���� �̹� false �̹Ƿ� ���� i�� ����� �ʿ䰡 ��� i�� 2�� ����
		System.out.println(num1); //20
		System.out.println(i); //2
		
	}

}
