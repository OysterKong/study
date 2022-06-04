package ch21;

public class BreakTest {

	public static void main(String[] args) {
		
		int sum = 0;
		int num;
		
		//총액이 100보다 큰 순간일때 숫자
		for(num=1; sum<=100; num++) {
			sum += num;
			
			if(sum>=100) {
				break;
			}
			
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
