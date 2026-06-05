package method;

import java.util.Random;

public class SsafyRoutine4 {
	public static void main(String[] args) {
		System.out.println("아침에 일어난다.");
		이동("교육장", "지하철");
		boolean 과제여부 = 교육(); //함수를 실행한 것!
		이동("집", "버스");
//		if(과제여부 == true) {
//			System.out.println("과제를 해결한다.");
//		}
		if(과제여부) {
			System.out.println("과제를 해결한다.");
		}
//		if(교육()) {
//			System.out.println("과제를 해결한다.");
//		}
		System.out.println("잠을 잔다.");
	}
	
	//함수
	//관련된 문장들을 하나로 묶어서 이름을 붙인것
	//실행가능한 단위 (필요에 따라 입력과 출력이 있을 수 있음)
//	public static void 교육() {
//		System.out.println("오전 수업(Live)을 듣는다.");
//		System.out.println("점심을 먹는다.");
//		System.out.println("오후 수업(실습)을 진행한다.");
//	}
	
	//반환값
	public static boolean 교육() {
		System.out.println("오전 수업(Live)을 듣는다.");
		System.out.println("점심을 먹는다.");
		System.out.println("오후 수업(실습)을 진행한다.");
		
		return new Random().nextBoolean();
	}
	
	
	
	
	
	//입력이 있는 경우
	public static void 이동(String 장소, String 교통수단) {
		System.out.println(장소+"(으)로 "+교통수단+"를(을) 이용하여 이동한다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} 
