package com.ssafy.ws.step4;

import java.util.Scanner;

public class AirCrashes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] accident = new int[N];
		for (int i=0; i<N; i++) {
			accident[i] = sc.nextInt();
		}
		
		
		int A = 0;
		for(int i=0; i<N; i++) {
			if(accident[i]>A) {
				A = accident[i];
			}
		}
		
		int b = 0;
		for(int i=0; i<N; i++) {
			if(accident[N-1]>accident[i]) {
				b++;
			}
		}
		
		int[] accident1 = new int[b];
		int size = 0;
		if(b == 0) {
			System.out.println(-1);
		} else {
			for(int i=0; i<N; i++) {
				if(accident[N-1] > accident[i]) {
					accident1[size++] = accident[i];
				}
			}
			int B = accident1[b-1];
			System.out.println(A- B);
		}
		
		
	}
}
