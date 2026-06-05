package inheritance02_ok;

public class Test {
	public static void main(String[] args) {
		Person p = new Person(); //기본생성자가 자동으로 추가 되어서
		Student st = new Student();

		// 연관이 있나?
		p.eat();
		st.eat();
	}
}
