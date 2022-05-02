package kr.human.io2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//문자 단위 입출력하는 클래스들은 클래스명이 Reader, Writer로 끝난다
public class TextIOEx01 {
	public static void main(String[] args) {
		//문자 단위 출력
		try (FileWriter fw = new FileWriter("text.txt")){
			fw.write("저장이 될까?\n");
			fw.write("정말 저장이 될까?\n");
			fw.write("정말 진짜 저장이 될까?\n");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//문자 단위 입력
		try (FileReader fr = new FileReader("text.txt")){
			int n = 0;
			while((n = fr.read()) > 0) { // 1글자씩 읽기
				System.out.println((char)n);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		
		try (FileReader fr = new FileReader("text.txt")){
			int n = 0;
			char[] data = new char[1024];
			while((n = fr.read()) > 0) { // char배열로 읽기
				System.out.println(new String (data, 0, n));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("_".repeat(60));
		try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))){
			String line = "";
			while((line = br.readLine()) != null) System.out.println(line);//1줄씩 읽기
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("_".repeat(60));
		try (Scanner sc = new Scanner(new File("text.txt"))){
			while(sc.hasNextLine()) System.out.println(sc.nextLine());//1줄씩 읽기
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
