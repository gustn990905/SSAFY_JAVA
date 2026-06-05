package modifier01_static;

public class Person {
	//인스턴스 변수(객체마다 고유한 값)
	String name;
	int age;
	String hobby;
	
	//클래스 변수
	static int pCount = 1;
	
	
	//초기화 블럭을 선언하자
	static {
		System.out.println("클래스가 로드 될때 한번 수행됨");
	}
	
	//
	{
		System.out.println("나는 몇번 호출될까?");
	}
	
	
	
	
	
	//메서드
	void eat() {
		System.out.println("냠냠");
	}
	
	//정적메서드
	static void study() {
		System.out.println("공부를 합니다.");
	}
	
	
	
	
	
	
	
	
}
