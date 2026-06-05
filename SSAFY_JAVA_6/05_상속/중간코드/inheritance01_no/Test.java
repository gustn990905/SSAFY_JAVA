package inheritance01_no;

public class Test {
	public static void main(String[] args) {
		Person p = new Person(); //기본생성자가 자동으로 추가 되어서
		Student st = new Student();
		
		//아래의 eat 메서드는 관련이 있다? 없다?
		p.eat();
		st.eat();
	}
}
