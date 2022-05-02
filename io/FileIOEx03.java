package kr.human.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOEx03 {
	public static void main(String[] args) {		
		//최근 방식 : 자동 닫기
		try(FileInputStream fis = new FileInputStream("src/main/resources/chunja2.txt");) {
			int n = 0;
			
			byte[] data = new byte[2048];//바이트배열
			
			while((n = fis.read(data)) > 0) {//read(바이트배열) : 배열 크기 만큼 읽고, n은 읽은 길이 리턴
				
				System.out.println(new String(data, 0, n)); //0번째부터 n까지 읽은 만큼 스트링으로 변환
				//new String(바이트배열, 시작값, 길이) -> 한꺼번에 읽은거라 좋긴한데 잘라내서 가공하려면 
				//어디까지 읽어야 하는지 알아내야 한다. 2진파일 읽을땐 쓰되 텍스트 파일읽을땐 쓰기 어렵다
				
			}
		} catch (FileNotFoundException e) {//읽을 파일을 못차증면
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {//읽을때 에러나면
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
