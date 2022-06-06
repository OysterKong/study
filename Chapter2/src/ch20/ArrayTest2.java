package ch20;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int count = 0;
		int total = 0;
		
		for(int i=0, num=1; i<arr.length; i++) {
			count++;
			arr[i] = num++;
		}
		
		for( int num : arr ) {
			total += num;
		}
		System.out.println(total);
		System.out.println(count);
	}

}
