package polymorphism;

class Parent {
	String x = "parent";
	
	public String method() {
		return "parent method";
	}
	
	public static String method2() {
		return "parent method2";
	}
	
	@Override
	public String toString() {
		return "투스트링";
	}
	
	
	
}

class Child extends Parent {
	String x = "child";
	
	@Override //부모의 메서드 재정의 한거야!
	public String method() {
		return "child method";
	}
	
	public static String method2() {
		return "child method2";
	}
}




public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
//		System.out.println(p.x);
//		System.out.println(c.x);
		
		//동적 바인딩
		System.out.println(p.method()); //이거 실행했는데 Child method가 동작했네?
		System.out.println(c.method());
	
		
		System.out.println(p);
		
		System.out.println(p.method2());
		System.out.println(c.method2());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
