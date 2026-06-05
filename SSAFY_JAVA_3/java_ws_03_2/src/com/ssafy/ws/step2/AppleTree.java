package com.ssafy.ws.step2;

import java.util.Scanner;

public class AppleTree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] map = new int[N][N];
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		int[] r= {-1, 1, 0, 0};
		int[] c= {0, 0, -1, 1};
		
		int[][] total = new int[N][N];
		
		for (int a=0;a<N;a++) {
			for (int b=0;b<N;b++) {
				int sum = map[a][b];
				for (int d=0;d<4;d++) {
					int i1 = a + r[d];
					int j1 = b + c[d];
					
					if (i1 > 0 && i1 < N && j1 >0 && j1 < N) {
						sum += map[i1][j1];
					}
					total[a][b] = sum;
				}
			}
		}
		int max = Integer.MIN_VALUE;
		for (int x=0;x<N;x++) {
			for(int y=0;y<N;y++) {
				max = Math.max(max, total[x][y]);
			}
		}
		System.out.println(max);
	}
}
