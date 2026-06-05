package com.ssafy.ws.step2;

import java.util.Scanner;

public class Season1 {

	public static void main(String[] args) {
		// 코드를 작성하세요.(for문과 if문 사용)
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println("월 입력>>");
			int N = sc.nextInt();
			if(N == 3 || N == 4 || N == 5) {
				System.out.println(N + "월은 봄입니다.");
			} else if(N == 6 || N == 7 || N == 8) {
				System.out.println(N + "월은 여름입니다.");
			} else if(N == 9 || N == 10 || N == 11) {
				System.out.println(N + "월은 가을입니다.");
			} else if(N == 12 || N == 1 || N == 2) {
				System.out.println(N + "월은 겨울입니다.");
			} else { }
		}
	}
}
