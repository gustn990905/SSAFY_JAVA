package modifier01_static;


public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Yang"; //고유하게
		//생성자를 만들면 하나씩 저장하지 않아도 된다!
		
		System.out.println(p1.pCount++);
		
		Person p2 = new Person();
		System.out.println(p2.pCount);
		
		System.out.println(Person.pCount);
		
		p1.eat();
		p2.eat();
		
		p1.study();
		Person.study();
		
		
		
		
		
		
		
		
		
	}
}
