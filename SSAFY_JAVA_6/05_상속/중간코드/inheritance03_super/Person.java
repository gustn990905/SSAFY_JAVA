package inheritance03_super;

public class Person {
	String name;
	private int age;
	
	//기본 생성자
	public Person() {
		System.out.println("Person 기본생성자 호출");
	}
	
	//전체 생성자
	public Person(String name, int age) {
		System.out.println("Person 전체생성자 호출");
		this.name = name;
		this.age = age;
	}
	
	
	
	void eat() {
		System.out.println("냠냠 먹는다.");
	}
}
