package com.ssafy.ws.step2;

import java.util.Scanner;

public class Season2 {
	public static void main(String[] args) {
		// 코드를 작성하세요.(while문과 switch문 사용)
		Scanner sc = new Scanner(System.in);
		int t = 0;  // 시도 횟수
		while(t!=3) {
			System.out.println("월 입력>>");
			int N = sc.nextInt();
			switch(N) {
			case 3: System.out.println(N + "월은 봄입니다."); break;
			case 4: System.out.println(N + "월은 봄입니다."); break;
			case 5: System.out.println(N + "월은 봄입니다."); break;
			case 6: System.out.println(N + "월은 여름입니다."); break;
			case 7: System.out.println(N + "월은 여름입니다."); break;
			case 8: System.out.println(N + "월은 여름입니다."); break;
			case 9: System.out.println(N + "월은 가을입니다."); break;
			case 10: System.out.println(N + "월은 가을입니다."); break;
			case 11: System.out.println(N + "월은 가을입니다."); break;
			case 12: System.out.println(N + "월은 겨울입니다."); break;
			case 1: System.out.println(N + "월은 겨울입니다."); break;
			case 2: System.out.println(N + "월은 겨울입니다."); break;
			}
			t++;
		}
	}

}
