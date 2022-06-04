package ch21;

public class ContinueTest {

	public static void main(String[] args) {
		
		int num;
		for(num=1; num<=100; num++) {
			
			if( (num % 3) != 0) {
				continue;   //3의 배수가 아니면 for문을 벗어나는 구조
			}
			System.out.println(num);
		}

	}

}
