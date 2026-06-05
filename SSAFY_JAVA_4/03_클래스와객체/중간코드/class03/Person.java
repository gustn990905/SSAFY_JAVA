package class03;

public class Person {
	String name;
	int age;
	String hobby;
	
	void info() {
		System.out.println("나의 이름은 "+ name +" 나이는 "+age+"세");
	}
	
	void info(String name, int age) {
		System.out.println("나의 이름은 "+ name +" 나이는 "+age+"세");
	}
}
