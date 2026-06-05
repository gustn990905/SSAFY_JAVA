package class03;


public class PersonTest {
	public static void main(String[] args) {
		//Person을 생성해보자!
		//생성하기 위해서는
		//클래스이름 변수이름 = new 클래스이름();
		Person yang = new Person();
		yang.name = "Yang";
		yang.age = 45;
		yang.hobby = "Youtube";
		
		yang.info(yang.name, yang.age);
		
		
		Person hong = new Person();
		hong.name = "Hong";
		hong.age = 25;
		hong.hobby = "Golf";
		hong.info();
		
	}
	
	
}
