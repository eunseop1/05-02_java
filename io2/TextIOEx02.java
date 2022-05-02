package kr.human.io2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

//문자 단위 입출력하는 클래스들은 클래스명이 Reader, Writer로 끝난다 -> 1.7이상버전에서는 지금과 같이 더 편하게 한다
public class TextIOEx02 {
	public static void main(String[] args) {
		//문자 단위 출력
		try {
			//@파일 전체를 1개의 변수로 읽는다
			String str = Files.readString(Paths.get("src/main/resources/chunja.txt"));
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-".repeat(60));
		try {
			//파일 전체를 byte배열로 읽는다 -> 여기에는 잘라줘야 하는 가공과정이 필요
			byte[] data = Files.readAllBytes(Paths.get("src/main/resources/chunja.txt"));
			System.out.println(new String (data));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-".repeat(60));
		try {
			//@파일 전체를 list로 읽는다
			List<String> lines = Files.readAllLines(Paths.get("src/main/resources/chunja.txt"));
			System.out.println(lines.get(0));
			System.out.println(lines.get(lines.size() - 1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-".repeat(60));
		
		try {
			Files.copy(Paths.get("src/main/resources/chunja.txt"), new FileOutputStream("chunja.bak"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
