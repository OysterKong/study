package noName;

public class Training7 {

	public static void main(String[] args) {
		
		// 누적합계가 100을 넘지않는 제일 큰 수
		
		int sum = 0;
		int i = 0;
		
		while((sum += ++i) <= 100) {
			System.out.println( i + " - " + sum);
		} //end of while

	}



}
