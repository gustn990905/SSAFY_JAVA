import java.util.Arrays;

public class Array06_2차원배열 {
	public static void main(String[] args) {
		//배열 선언
		int[][] arr1; //이거지 이거~!
		int[] arr2[];
		int arr3[][];
		
		//배열 초기화
		int[][] arr4 = new int[2][3];
		
		//2차원 배열 출력
		for(int i = 0; i < arr4.length; i++	) {
			for(int j = 0; j<arr4[i].length; j++) {
				System.out.print(arr4[i][j]+" ");
			}//열을 위한 for문
			System.out.println();
		}//행을 위한 for문
		System.out.println("----------------------------");
		for(int[] a : arr4) {
//			a[0] = 100;  //이거 넣었더니 바뀌네?
			System.out.println(Arrays.toString(a));
		}
		System.out.println("----------------------------");
		System.out.println(Arrays.deepToString(arr4));
		
		///////////////////////////////////////////////////////////
		int[][] arr5 = new int[5][];
		System.out.println(Arrays.deepToString(arr5));
		
		arr5[0] = new int[] {1,2,3};
//		arr5[1] = {1,2,3};
		System.out.println(Arrays.deepToString(arr5));
		
		//값을 직접 다 넣어서 해보자
		int[][] arr6 = new int[][] { {1,2,3},{4}};
		
		
		
		
		
		
	}
	
	
	
}
