package ch15;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 : ");
		int age = scanner.nextInt();
		int charge;
		
		if( age < 8 ) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}
		else if (age < 14){
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		else if (age < 20){
			charge = 5000;
			System.out.println("중,고등학생 입니다.");
		}
		else {
			charge = 10000;
			System.out.println("성인입니다.");
		}
		System.out.println("내야하실 요금은" + charge + "원 입니다.");

	}

}
