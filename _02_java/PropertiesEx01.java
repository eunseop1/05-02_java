package kr.human._02_java;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//properties : <String, String>인 맵
public class PropertiesEx01 {
	public static void main(String[] args) {
		Properties properties = new Properties();
		//추가
		properties.setProperty("db", "Oracle");
		properties.setProperty("dbuser", "system");
		properties.setProperty("dbpassword", "system123");
		
		//읽기
		System.out.println(properties.getProperty("db"));
		System.out.println(properties.getProperty("dbuser"));
		System.out.println(properties.getProperty("dbpassword"));
		
		//파일로 저장
		try {//save는 옛날거라고 권장하지 않음
			//두번째 인수는 그 파일안에 저장되는 코멘트(주석)이다
			//properties파일은 태그가 없고 한글이 지원되지 않기에 영어 코멘트만 가능하다->properties editor를 설치하여 한글로 처리가능
			properties.store(new FileWriter("db.properties"), "데이터베이스 사용자 정보");
			//xml은 태그가 있어서 용량이 커진다
			properties.storeToXML(new FileOutputStream("db.xml"), "데이터베이스 사용자 정보");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
