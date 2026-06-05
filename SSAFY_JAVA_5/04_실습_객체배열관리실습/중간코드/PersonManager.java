package com.ssafy.pjt;

//싱글턴패턴을 적용해보자 -> 1개만 만들어지도록
public class PersonManager {
	final int MAX_SIZE = 10;	//상수처리(스네이크 케이스 대문자로)
	//사람의 목록을 관리를 하겠다.
	Person[] arr = new Person[MAX_SIZE];
	int size = 0; //용도를 생각해보즈아~~
	
	
	//1번: 외부에서 생성하지 못하게 해야해~ 
	//기본생성자의 접근제한자를 private 으로 바꾼다.
	private PersonManager() {
	}
	
	//2번: 외부에서 생성하지 못하니까 내가 생성해서 가지고 있어야겠다
	//4번: 너도 static이 되어야 쓰겄다.
	private static PersonManager manager = new PersonManager();
//	private static PersonManager manager;
	
	//3번: 내가 만든 manager를 외부에서 쓸수는 있어야하니 접근자를 만들어야겠다!
	//접근자는 결국 인스턴스를 통해서만 접근이 가능해! -> 외부에서 인스턴스를 만들순 없어
	//static 키워드를 통해 미리 메모리에 올린다. -> static 영역은 non-static를 쓸 수 없다
	public static PersonManager getManager() {
//		if(manager == null) {
//			manager = new PersonManager();
//		}
		return manager;
	}
	
	
	//메서드 CRUD
	//추가
	
	//조회
	
	//수정
	
	//삭제
}
