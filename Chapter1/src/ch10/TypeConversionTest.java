package ch10;

public class TypeConversionTest {
	
	public static void main(String[] args) {
		
//		byte bNum = 125;
//		int iNum = bNum;
//		
//		System.out.println(iNum);
		
//		int iNum = 255;
//		byte bNum = (byte)iNum;
//		
//		System.out.println(bNum);
		
//		double dNum = 3.14;
//		int inum = (int)dNum;
//		
//		System.out.println(inum);
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println("확인용 : "+ (int)dNum);
		System.out.println("확인용 : "+ (int)fNum);
		System.out.println(iNum1);
		//dNum을 먼저 형변환해서 1만 남고 fNum을 먼저 형변환해서 0만 남은 상태에서 더하니 결과는 1
		System.out.println("확인용 : "+ (dNum + fNum));
		System.out.println(iNum2);
		//dNum과 fNum을 더한 상태에서 int로 타입캐스팅하여 결과는 2 
		
		int myNum = 10;
		int yourNum = 20;
		
		//myNum = myNum + yourNum;
		myNum += yourNum;
		System.out.println(myNum);
		
	}

}
