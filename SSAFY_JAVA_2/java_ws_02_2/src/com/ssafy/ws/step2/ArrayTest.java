package com.ssafy.ws.step2;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		String[] arr = {"1098765421"};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] arr2 = new String[N];
		
		for(int j=0; j<N; j++) {
			arr2[j] = sc.next();
		}
		for(int k=0; k<arr2.length; k++) {
			System.out.println(arr2[k]);
		}
	}
}
