package com.ssafy.hw.step4;

import java.util.Scanner;

public class DayCount {

	public static void main(String[] args) {
		System.out.println("월과 일을 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		int total = 0;
		
		if (month > 0) {
			total = day;
		}
		if (month > 1) {
			total = total + 31;
		}
		if (month > 2) {
			total = total + 28;
		}
		if (month > 3) {
			total = total + 31;
		}
		if (month > 4) {
			total = total + 30;
		}
		if (month > 5) {
			total = total + 31;
		}
		if (month > 6) {
			total = total + 30;
		}
		if (month > 7) {
			total = total + 31;
		}
		if (month > 8) {
			total = total + 31;
		}
		if (month > 9) {
			total = total + 30;
		}
		if (month > 10) {
			total = total + 31;
		}
		if (month > 11) {
			total = total + 30;
		}
		
		
		System.out.printf("%d월 %d일은 %d번째 날입니다.", month, day, total);
		
	}

}
