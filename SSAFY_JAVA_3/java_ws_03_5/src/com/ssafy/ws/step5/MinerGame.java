package com.ssafy.ws.step5;

import java.util.Scanner;

public class MinerGame {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] map = new int[N][N];

		for (int a = 0; a < N; a++) {
			for (int b = 0; b < N; b++) {
				map[a][b] = sc.nextInt();
			}
		}
		int M = sc.nextInt();
		String[] action = new String[M];
		for (int i = 0; i < M; i++) {
			action[i] = sc.next();
		}

		int nowa = 0;
		int nowb = 0;
		int count = 0;
		for (int a = 0; a < N; a++) {
			for (int b = 0; b < N; b++) {
				if (map[a][b] == 0) {
					nowa = a;
					nowb = b;
				}
			}
		}
		for (int k = 0; k < M; k++) {
			if (action[k].equals("U")) {
				if (map[nowa - 1][nowb] == 0) {
					nowa = nowa - 1;
					nowb = nowb;
				} else {
					map[nowa - 1][nowb]--;
					if (map[nowa - 1][nowb] == 0) {
						count++;
						nowa = nowa - 1;
						nowb = nowb;
					}
				}

			} else if (action[k].equals("R")) {
				if (map[nowa][nowb + 1] == 0) {
					nowa = nowa;
					nowb = nowb + 1;
				} else {
					map[nowa][nowb + 1]--;
					if (map[nowa][nowb + 1] == 0) {
						count++;
						nowa = nowa;
						nowb = nowb + 1;
					}
				}
			} else if (action[k].equals("D")) {
				if (map[nowa + 1][nowb] == 0) {
					nowa = nowa + 1;
					nowb = nowb;
				} else {
					map[nowa + 1][nowb]--;
					if (map[nowa + 1][nowb] == 0) {
						count++;
						nowa = nowa + 1;
						nowb = nowb;
					}
				}
			} else if (action[k].equals("L")) {
				if (map[nowa][nowb - 1] == 0) {
					nowa = nowa;
					nowb = nowb - 1;
				} else {
					map[nowa][nowb - 1]--;
					if (map[nowa][nowb - 1] == 0) {
						count++;
						nowa = nowa;
						nowb = nowb - 1;
					}
				}
			} else {
				int[] nr = { -1, -1, -1, 0, 0, 1, 1, 1 };
				int[] nc = { -1, 0, 1, -1, 1, -1, 0, 1 };
				for (int c = 0; c < 8; c++) {
					int dr = nowa + nr[c];
					int dc = nowb + nc[c];
					if (dr >= 0 && dr < N && dc >= 0 && dc < N) {
						if (map[dr][dc] != 0) {
							map[dr][dc] = 0;
							count++;
						}
					}
				}
			}
		}
		System.out.println("광부 위치 : (" + nowa + "," + nowb + ")");
		System.out.println("부순 암석 개수 : " + count);
	}
}
