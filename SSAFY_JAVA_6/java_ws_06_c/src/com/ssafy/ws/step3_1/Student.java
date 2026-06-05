package com.ssafy.ws.step3_1;

public class Student extends Person {
	String track;
	String region;
	int classNumber;
	
	public Student() {
		
	}
	public Student(String track, String region, int classNumber) {
		this.track = track;
		this.region = region;
		this.classNumber = classNumber;
	}
	public Student(String name, int age, String track, String region, int classNumber) {
		this.name = name;
		this.age = age;
		this.track = track;
		this.region = region;
		this.classNumber = classNumber;
	}
}
