package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학교에 입학한 나이인지 확인하기 위해 본인의 나이를 입력해주세요\n");
		System.out.println("나이를 입력해주세요 : ");
		int age = scanner.nextInt();
		
		if (age >=8) {
			System.out.println("학교에 다닙니다.");
		} 
		else {
			System.out.println("학교에 가기엔 아직 어립니다.");
		}
		System.out.println("노는게 제일 좋아");

	}

}
