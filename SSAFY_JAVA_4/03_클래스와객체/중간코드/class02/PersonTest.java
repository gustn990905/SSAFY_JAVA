package class02;


public class PersonTest {
	public static void main(String[] args) {
		//Person을 생성해보자!
		//생성하기 위해서는
		//클래스이름 변수이름 = new 클래스이름();
		Person yang = new Person();
		yang.name = "Yang";
		yang.age = 45;
		yang.hobby = "Youtube";
		
		System.out.println("나의 이름은 "+ yang.name +" 나이는 "+yang.age+"세");
		info(yang.name, yang.age);
		
		Person hong = new Person();
		hong.name = "Hong";
		hong.age = 25;
		hong.hobby = "Golf";
		System.out.println("나의 이름은 "+ hong.name +" 나이는 "+hong.age+"세");
		info(hong.name, hong.age);
		
	}
	
	
	public static void info(String name, int age) {
		System.out.println("나의 이름은 "+ name +" 나이는 "+age+"세");
	}
}
