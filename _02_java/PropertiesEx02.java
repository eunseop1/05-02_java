package kr.human._02_java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//properties : <String, String>인 맵
public class PropertiesEx02 {
	public static void main(String[] args) {
		Properties properties = new Properties();
		//파일을 읽어서 사용
		try {
			properties.loadFromXML(new FileInputStream("db.xml"));
			
			System.out.println(properties.get("admin"));//null
			System.out.println(properties.get("dbuser"));
			System.out.println(properties.get("dbpassword"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			properties.load(new FileReader("db.properties"));
			
			System.out.println(properties.get("admin"));
			System.out.println(properties.get("dbuser"));
			System.out.println(properties.get("dbpassword"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
