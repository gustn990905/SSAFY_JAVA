package com.ssafy.ws.step3_1;

public class Teacher extends Person {

	String track;
	String region;
	int classNumber;
	int studentCount;

	Teacher() {

	}

	Teacher(String track, String region, int classNumber, int studentCount) {
		this.track = track;
		this.region = region;
		this.classNumber = classNumber;
		this.studentCount = studentCount;
	}

	Teacher(String name, int age, String track, String region, int classNumber, int studentCount) {
		this.name = name;
		this.age = age;
		this.track = track;
		this.region = region;
		this.classNumber = classNumber;
		this.studentCount = studentCount;
	}
}