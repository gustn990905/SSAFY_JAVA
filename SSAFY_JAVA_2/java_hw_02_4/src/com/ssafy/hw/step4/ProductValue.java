package com.ssafy.hw.step4;

import java.util.Arrays;
import java.util.Scanner;

public class ProductValue {

	public static void main(String[] args) {
		//코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] product = new int[N];
		
		for(int i=0; i<N; i++) {
			product[i] = sc.nextInt();
		}
		
		int [] total = new int [N];
		
		for(int j=0; j<N; j++) {
			for (int k=0; k<N; k++) {
				if(product[j] < product[k]) {
					total[j] += 1;
				}

			}			
		}
		for (int l=0; l<total.length;l++) {
			System.out.print(total[l] +1 +" ");
		}
		
	}

}
