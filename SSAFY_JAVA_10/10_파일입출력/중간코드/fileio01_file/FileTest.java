package fileio01_file;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
//		File 클래스: 파일 & 폴더(디렉토리) 관리하기 위한 클래스
		File f1 = new File("dog.jpg");
		File f2 = new File("C:\\java_workspace\\Java_10_파일입출력\\dog.jpg");
		
		
		System.out.println(f1.exists());
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		
		System.out.println(f1.isAbsolute()); //f1은 절대경로는 아니군
		System.out.println(f2.isAbsolute()); //f2는 절대경로군
		
		System.out.println(f1.getAbsolutePath());
		
		File folder = new File("folder"); //폴더라는 걸 실제로 생성한건가?
		//디렉토리를 만든건 아니야
		System.out.println(folder.exists());
		folder.mkdir();
		System.out.println(folder.exists());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
