package kr.human.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOEx05 {
	public static void main(String[] args) {
		
		//파일 복사
		
		try(FileInputStream fis = new FileInputStream("src/main/resources/thumb.jpg");//스트림은 그림, 영상 모두 사용가능하다
				FileOutputStream fos = new FileOutputStream("thumb2.jpg");){
			byte[] data = new byte[2048];//바이트 배열이 클수록 더빨리 저장된다
			int n =0;
			while((n = fis.read(data)) > 0) {//읽기
				fos.write(data, 0, n);
				fos.flush();
			}
			System.out.println("thumb.jpg파일을 thumb2.jpg로 복사완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
