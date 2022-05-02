package kr.human.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOEx02 {
	public static void main(String[] args) {		
		//최근 방식 : 자동 닫기
		try(FileInputStream fis = new FileInputStream("src/main/resources/chunja2.txt");) {
			int n = 0;
			while((n = fis.read()) > 0) {//read() : 1Byte 읽는데 리턴 타입은 int타입, 못읽으면 -1리턴
				//ystem.out.println((char)n);
				System.out.println(n);//n값은 아스키 코드로 나온다
				//텍스트 파일로 읽기에는 무리가 있는 예전 방식
			}
		} catch (FileNotFoundException e) {//읽을 파일을 못차증면
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {//읽을때 에러나면
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//글자읽을땐 스트림을 쓰지 않는다.
		//한글은 2바이트가 기본이기에 결국 깨진다
		
	}
}
