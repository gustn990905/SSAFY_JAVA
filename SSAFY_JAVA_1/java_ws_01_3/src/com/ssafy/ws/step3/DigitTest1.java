package com.ssafy.ws.step3;

/**
 * 직각삼각형 모양의 숫자 출력하는 클래스
 */
public class DigitTest1 {

	public static void main(String[] args) {
		// 3
		int num = 1;
		int rows = 5;
		
		for (int i = 0; i < rows; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
				}
			for (int j=0; j<rows -i; j++) {
				System.out.print(num + " ");
				num++;
			}
			
			System.out.println();
		}
	}

}
