package kr.human.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOEx04 {
	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("test.txt");){//파일이름쓰면 프로젝트 밑에, 경로를 적으면 경로에 따라 생긴다
			fos.write("정말 저장이 될까?\n저장되지 않으면 어떠하리\n".getBytes());//스트링을 바이트 배열로 만듬
			fos.flush();//버퍼의 내용을 저장
			//텍스트 파일에는 가능한 stream을 쓰지 마라
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
