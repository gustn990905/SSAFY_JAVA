package com.ssafy.ws.step5;

import java.util.Scanner;

public class EmergencyEscape {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean found = false;

		int N = sc.nextInt();
		int[] speed = new int[N];
		for (int i = 0; i < N; i++) {
			speed[i] = sc.nextInt();
		}
		int[] altitude = new int[N];
		for (int i = 0; i < N; i++) {
			altitude[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			int idx = 0;
			if (i - 2 >= 0) {
				if (altitude[i-2] - altitude[i] >= 2000 && (speed[i - 1] + speed[i - 2]) / 2 >= 1100) {
					idx++;
				}
			}
			if (i - 3 >= 0) {
				if ((altitude[i-3] - altitude[i]) >= 3000
						&& (speed[i - 1] + speed[i - 2] + speed[i - 3]) / 3 >= 1000) {
					idx++;
				}
			}
			if (i - 4 >= 0) {
				if ((altitude[i-4] - altitude[i]) >= 4000
						&& (speed[i - 1] + speed[i - 2] + speed[i - 3] + speed[i - 4]) / 4 >= 900) {
					idx++;
				}
			}
			if (idx >= 1) {
				System.out.println(i+1);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println(-1);
		}
	}

}
