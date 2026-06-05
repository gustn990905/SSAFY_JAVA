package com.ssafy.ws.step4;

import java.util.Scanner;

/**
 * 체크메이트 판별하기
 */
public class Checkmate {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			System.out.print("#"+t+" ");
			int N = sc.nextInt();

			int[] chess = new int[4];

			for (int i = 0; i < 4; i++) {
				chess[i] = sc.nextInt();
			}

			if (chess[0] == chess[2] || chess[1]==chess[3]) {
				System.out.println(1);
			}
			else if(Math.abs(chess[2] - chess[0]) == Math.abs(chess[3] - chess[1])) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
	}
}
