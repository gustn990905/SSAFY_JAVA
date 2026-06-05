package inheritance03_super;

public class Student extends Person{
	String major;
	
	public Student() {
		super();
//		this("익명", 0, "자율전공");
		System.out.println("Student의 기본생성자가 호출 되었습니다.");
	}
	
	public Student(String name, int age, String major) {
		super(name, age);
		System.out.println("Stduent의 전체생성자가 호출 되었습니다.");
	}
	
	
	
	void study() {
		System.out.println("공부를 한다.");
	}
}
