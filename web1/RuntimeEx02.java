package kr.human.web1;

import java.io.IOException;
import java.util.Scanner;

//자바에서 외부 프로그램 실행하기
public class RuntimeEx02 {
	public static void main(String[] args) {
		//옛날버전 jdk 1.5 이전에는 이렇게 사용
		try {
			Process process = Runtime.getRuntime().exec("cmd /c ipconfig");//
			Scanner sc = new Scanner(process.getInputStream(), "MS949");
			//CMD의 화면은 MS949를 사용하기 때문에 이걸 안써주면 한글이 깨져나온다
			//써주면 UTF-8로 변환되어 보여준다
			
			while(sc.hasNextLine())
				System.out.println(sc.nextLine());
			sc.close();
			
			System.out.println("-".repeat(40));
			//1.5 이상에서는 이와 같이 외부 프로그램의 실행결과를 가져올수 있다
			ProcessBuilder pb = new ProcessBuilder("cmd","/c","ipconfig");
			Process process2 = pb.start();
			Scanner sc2 = new Scanner(process2.getInputStream(), "MS949");
			while(sc2.hasNextLine())
				System.out.println(sc2.nextLine());
			sc2.close();
			System.out.println("-".repeat(40));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
}
