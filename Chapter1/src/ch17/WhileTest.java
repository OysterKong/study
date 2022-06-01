package ch17;

public class WhileTest {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;     //지역변수는 자동으로 초기화가 안됨
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
