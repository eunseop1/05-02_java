package kr.human.web1;

import java.net.InetAddress;
import java.net.UnknownHostException;

//자바에서 외부 프로그램 실행하기
public class IPAdressEx {
	public static void main(String[] args) {
		try {
			InetAddress adress = InetAddress.getByName("www.naver.com");
			System.out.println(adress);
			System.out.println(adress.getHostName());
			System.out.println(adress.getHostAddress());
			
			InetAddress[] inetA = InetAddress.getAllByName("naver.com");
			for(InetAddress addr : inetA) {
				System.out.println(addr);//값이 4개인것을 보면 서버가 4개라는 의미
			}
			
			System.out.println(InetAddress.getLocalHost());
			System.out.println(InetAddress.getLoopbackAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
}
