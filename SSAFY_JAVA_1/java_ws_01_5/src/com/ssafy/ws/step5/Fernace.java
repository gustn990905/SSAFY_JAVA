package com.ssafy.ws.step5;
import java.util.Scanner;

public class Fernace {

	public static void main(String[] args) {
		// 코드를 작성하세요.
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int a = Math.abs(A-B);
		int N = sc.nextInt();
		
		int[] numbers = new int[N];
		int min = Integer.MAX_VALUE;
		
		for (int i=0; i <N; i++) {
			numbers[i] = Math.abs(B -(sc.nextInt()));
			min = Math.min(min, numbers[i]);
		}
		
		int minTime = Math.min(a, min);
		if(minTime > 600) {
			System.out.println(-1);
		}
		
		if(a<=min) {
			System.out.println(a);
		}
		else {
			System.out.println(min + 1);
		}
	
	}

}
