package kr.human.web1;

import java.io.IOException;

//자바에서 외부 프로그램 실행하기
public class RuntimeEx {
	public static void main(String[] args) {
		//옛날버전 jdk 1.5 이전에는 이렇게 사용
		try {
			Runtime.getRuntime().exec("notepad.exe");//메모장
			//mspaint.exe는 그림판
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//1.5이상에서는
		try {
			ProcessBuilder pb = new ProcessBuilder("notepad.exe");
			pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
