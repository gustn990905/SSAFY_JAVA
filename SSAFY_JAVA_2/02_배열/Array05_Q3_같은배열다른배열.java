public class Array05_Q3_같은배열다른배열 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5 };


		String[] arr3 = { "pig", "cow", "fish" };
		String[] arr4 = { "pig", "dog", "cat" };
		
		
		//문자열은 equals() 를 써서 비교하자
		
		"pig".equals("cow");
		arr3[0].equals(arr4[0]);
		//참조자료형에서의 == 비교는 주소 값 비교이다.
		
		
		
		
	}
}
