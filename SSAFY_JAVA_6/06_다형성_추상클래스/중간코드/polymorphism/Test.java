package polymorphism;

public class Test {
	public static void main(String[] args) {
//		Student st = new Student(); //늘 먹던 맛 안될 수 가 없음
//		Person p = new Student();	//이건 가능한가? O
//		Student st2 = new Person(); //이건 가능한가? X 
//		Object st3 = new Student(); //이건 가능한가? O
		///////////////////////////////////////////////
		
		Student st = new Student();
		Person p = st;	//가능하다 묵시적 형변환
		
		/////////////////////////////////////////////////
		
		Person p2 = new Person(); 
//		Student st2 = (Student)p2; //명시적 형변환 시켜야 한다. //클래스 캐스팅 익셉숀
//		st2.study();
		
		//간단한 퀴즈 (명시적 형변환 해야된)
		Person p3 = new Student();
		Student st3 = (Student)p3;
		
//		st3.study();
		
		////////////////////////////////////////////////////////////
		//instanceof 연산자 -> boolean 타입을 반환한다.
		
		
//		Person p4 = new Person();
		Person p4 = new Student();
//		Student st4 = (Student)p4; //이거는 이슈생기는 코야 없는데 바꾸려고 해서
		
		if(p4 instanceof Student) {
			//해당 블록 안에 코드가 실행이 된다는 뜻은
			Student st4 = (Student)p4;
			st4.study();
		}
		
		
		//java16~
		if(p4 instanceof Student st5) {
			st5.study();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
