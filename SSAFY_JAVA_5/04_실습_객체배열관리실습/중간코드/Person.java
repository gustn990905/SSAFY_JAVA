package com.ssafy.pjt;     //패키지 경로는 최 상단 (만약에 요게 없다면?->default 패키지)
////////////////////
//import가 들어오는 자리 -> 여러개가 올 수 있다. (ctrl+shift+o) 같은 이름이 여러개면 직접 선택 필요
//기본으로 들어있는 패키지는? -> import java.lang.*; 

/////////////////////
public class Person {
	//클래스 다이어그램을 보고 작성을 한다.
	//보통은 고유한 식별자!가 있으면 좋아!
//	private int id;
	//필드 끝 -> 인스턴스 필드
	private String name; //동명이인은 없다고 가정
	private int age;
	private String mbti;
	private boolean hungry;
	
	//////////////////////////////////////////////
	//생성자 / 기본생성자 빨리만들기 -> ctrl space enter
	public Person() {
		// TODO Auto-generated constructor stub
	}
	//전체 필드를 이용하는 생성자
	public Person(String name, int age, String mbti, boolean hungry) {
		this.name = name;
		this.age = age;
		this.mbti = mbti;
		this.hungry = hungry;
	}
	
	/////////////////////////////////////////////////////////
	// 접근자&설정자
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMbti() {
		return mbti;
	}
	public void setMbti(String mbti) {
		this.mbti = mbti;
	}
	public boolean isHungry() {
		return hungry;
	}
	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
	
	//정보 출력 메서드
//	public String info() {
//		return "사람의 정보 ~~~";
//	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", mbti=" + mbti + ", hungry=" + hungry + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
