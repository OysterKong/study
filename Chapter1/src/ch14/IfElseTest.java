package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�б��� ������ �������� Ȯ���ϱ� ���� ������ ���̸� �Է����ּ���\n");
		System.out.println("���̸� �Է����ּ��� : ");
		int age = scanner.nextInt();
		
		if (age >=8) {
			System.out.println("�б��� �ٴմϴ�.");
		} 
		else {
			System.out.println("�б��� ���⿣ ���� ��ϴ�.");
		}
		System.out.println("��°� ���� ����");

	}

}
