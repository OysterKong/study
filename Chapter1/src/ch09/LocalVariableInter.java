package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		double j = 10.0;
		float k = 10.0f;
		String str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(str);
		
		String str2 = str;
		System.out.println(str2);
		
		str = "hello";
		System.out.println(str);
		//str = 3;  //ºÒ°¡
		//System.out.println(str);
		
		
	}

}
