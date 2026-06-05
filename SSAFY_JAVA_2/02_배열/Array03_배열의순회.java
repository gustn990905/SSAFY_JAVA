import java.util.Arrays;

public class Array03_배열의순회 {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		
		//값들을 하나씩 출력을 해보자~
//		for(int i = 0; i < arr.length; i+=1 ) {
//			System.out.println(arr[i]);
//		}
		
		//for-each (read only)
//		for(자료형 이름 : 반복할것-배열)
		for(int x : arr) {
//			System.out.println(x);
//			x = x * 2;
			x *= 2;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
	}
}
