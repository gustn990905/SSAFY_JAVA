package inheritance03_super;

class Parent {
	String name = "부모님 이름";
	
	void eat() {
		System.out.println("냠냠");
	}
}

class Child extends Parent{
	String name = "자식 이름";
	
	void eat() {
		super.eat();
		System.out.println("쩝쩝");
	}
	
	void printName() {
		String name ="임시 이름";
		System.out.println(super.name);
		System.out.println(this.name);
		System.out.println(name);
	}
}




public class SuperTest {
	public static void main(String[] args) {
		Child child = new Child();
		child.printName();
		
		
		child.eat();
		
		
		
		
		
		
	}
}
