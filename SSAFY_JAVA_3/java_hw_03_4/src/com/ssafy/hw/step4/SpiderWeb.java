package com.ssafy.hw.step4;

import java.util.Scanner;

public class SpiderWeb {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] map = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		int[] dc = { -1, -1, 0, 1, 1, 1, 0, -1 };
        int[] dr = { 0, 1, 1, 1, 0, -1, -1, -1 };

		int result = 0;
		int bestR = 0;
		int bestC = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {

				int spider = 0;

				for (int k = 0; k < 8; k++) {

					boolean prevOne = false;
					int nr = i + dr[k];
					int nc = j + dc[k];

					while (nr >= 0 && nc >= 0 && nr < N && nc < N) {

						if (map[nr][nc] == 1) {
							if (prevOne)
								break;
							prevOne = true;
						} else {
							spider++;
							prevOne = false;
						}

						nr += dr[k];
						nc += dc[k];
					}
				}
				
				if (spider > result) {
					bestR = i;
					bestC = j;
					if(map[bestR][bestC] == 0) {
						spider+=1;
					}
					result = spider;
				}
			}
		}

		System.out.println(result);
		System.out.println(bestR + "," + bestC);
	}
}