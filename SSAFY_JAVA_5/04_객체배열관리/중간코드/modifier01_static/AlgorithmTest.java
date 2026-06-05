package modifier01_static;

public class AlgorithmTest {
	public static void main(String[] args) {
		//add 함수를 사용하고 싶어!
		AlgorithmTest test = new AlgorithmTest();
		test.add(1 , 2);
		
		add2(1, 2);
		
		
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	
	static int add2(int a, int b) {
		return a+b;
	}
	
}
