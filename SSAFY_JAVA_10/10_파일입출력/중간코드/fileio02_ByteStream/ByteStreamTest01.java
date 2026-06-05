package fileio02_ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest01 {
	public static void main(String[] args) {
		//dog.jpg를 읽어서 처리해보즈아(복/붙)
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("dog.jpg");
			fos = new FileOutputStream("dog-copy.jpg");
			
			int b; //byte를 담을 변수
			while( (b=fis.read()) != -1) {
				fos.write(b);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 없음 이슈");
		} catch (IOException e) {
			System.out.println("더큰 통로 입출력 이슈");
		} finally {
			try {
				if(fis != null) {
					fis.close();
				}
				if(fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//더이상 실행할 코드가 없으니 종료가 되었다. -> 별 문제는 없군 (통로를 닫지 않았는데...)
		//사실은 통로를 닫아야 한다!
		
		
		
	}
}
