import java.util.Arrays;

public class Array01_배열의선언및생성 {
	public static void main(String[] args) {
		// 배열 선언
		int[] arr1; // 권장방식
		int arr2[]; // 비권장
		
		// 배열 초기화 -> 기본 값으로 초기화 
		int[] arr3 = new int[10];
		String[] arr4 = new String[5];
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		
		// 값을 직접 넣어서 초기화 하자(길이를 명시할 수는 없다!)
		int[] arr5 = new int[] {1,2,3,4,5};
		System.out.println(Arrays.toString(arr5));
		
		// 아래의 특징은 선언과 동시에 이루어질때 가능
		String[] arr6 = {"김태정", "박민규", "도영훈"};
		
		arr6 = new String[] {"천창현", "이규원", "신다현"}; //재할당 가능
//		arr6 = {"한결", "유연우"}; //재할당 불가능
		
		String[] arr7;
//		arr7 = {"권태혁", "조영운"};
		
		
	}
}
