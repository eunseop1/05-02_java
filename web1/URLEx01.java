package kr.human.web1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLEx01 {
	public static void main(String[] args) {
		String urlAddress = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=jsp";
		
		try {
			URL url = new URL(urlAddress);
			
			System.out.println(url.getProtocol());//프로토콜 부분만 잘라보여줘
			System.out.println(url.getHost());
			System.out.println(url.getPort());//포트번호는 없기에 -1 반환
			System.out.println(url.getPath());//경로는 네이버
			System.out.println(url.getQuery());//뒤의 자잘한 부분들
			
			System.out.println("네이버 소스 보기!");
			Scanner sc = new Scanner(url.openStream());
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
