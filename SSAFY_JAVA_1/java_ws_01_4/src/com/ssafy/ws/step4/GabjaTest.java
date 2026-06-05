package com.ssafy.ws.step4;

import java.util.Scanner;

/**
 * 60 갑자를 서양력으로 변환하는 프로그램
 */

public class GabjaTest {

    public static void main(String[] args) {
    	// 코드를 작성하세요.
    	
    	while(true) {
    		System.out.println("60갑자를 입력하세요: ");
    		
    		Scanner sc = new Scanner(System.in);
    		
    		String N = sc.next();
    		
    		if(N.equals("종료")) {
    			break;
    		}
    		boolean found = false;
    		for (int year = 1800; year <=2100; year++) {
    			int index = (year - 1444) % 60;
    			
    			String[] gan = {"갑", "을", "병", "정", "무", "기", "경", "신", "임", "계"};
                String[] ji = {"자", "축", "인", "묘", "진", "사", "오", "미", "신", "유", "술", "해"};
                
                String gapja = gan[index%10] + ji[index%12];
                
                if(gapja.equals(N)) {
                	System.out.print(year+" ");
                	found = true;
                }
    		}
    		if(!found) {
            	System.out.println("잘못된 입력");
            }else {
            	System.out.println();
            }
    	}
    }
}
