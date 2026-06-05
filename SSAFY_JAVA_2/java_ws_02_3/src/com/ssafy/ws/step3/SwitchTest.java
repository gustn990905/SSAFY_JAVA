package com.ssafy.ws.step3;

import java.util.Scanner;

/*
 입력 
  
 */

public class SwitchTest {
	public static void main(String[] args) {
		// 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		// 스위치 N개, 번호는 1번부터 시작하므로
		// 번호는 1,2,3,..., N이 필요
		// 배열의 인덱스는 0번부터 시작하므로
		//0,1,2,...,N 인덱스가 필요
		// 0은 무시
		int[] arr = new int[N+1];
		
		// M개의 입력을 받는다. 
		// => M번 sc.nextInt()를 수행해야 함.
		// => 반복문
		
		for(int i=0; i<M; i++) {
			int num = sc.nextInt();
			//num의 배수에 해당하는 스위치를 바꾼다. 
			// num의 배수를 반복하기
			for(int j =num; j<=N; j+=num) {
				arr[j] = 1- arr[j];
			}
		}
		//스위치 상태 출력
		for(int i=1; i<N+1; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
}
