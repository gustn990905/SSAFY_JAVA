package com.ssafy.ws.step3;

import java.util.Scanner;

public class BuildingTest {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] nr = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] nc = { -1, 0, 1, -1, 1, -1, 0, 1 };

		for (int t = 1; t <= T; t++) {
			System.out.print("#" + t + " ");
			int N = sc.nextInt();

			String[][] map = new String[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.next();
				}
			}

			int maxHigh = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int high = 0;
					int count = 0;
					for (int k = 0; k < nr.length; k++) {
						int kr = i + nr[k];
						int kc = j + nc[k];
						if (kr >= 0 && kr < N && kc >= 0 && kc < N) {
							if (map[kr][kc].equals("G")) {
								count++;
							}
						}
					}
					if (map[i][j].equals("B"))
						if (count >= 1) {
							high = 2;
						} else {
							for (int a = 0; a < N; a++) {
								if (map[i][a].equals("B")) {
									high++;
								}
								if (map[a][j].equals("B")) {
									high++;
								}
							}
							high--;
						}

					maxHigh = Math.max(maxHigh, high);
				}
			}
			System.out.println(maxHigh);
		}
	}
}
