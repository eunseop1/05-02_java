package kr.human.web1;

import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;

public class GsonEx01 {
	public static void main(String[] args) {
		Gson gson = new Gson();
		try {
			// 읽기
			DicVO[] dicVOs = gson.fromJson(new FileReader("src/main/resources/dic.json"), DicVO[].class);
			System.out.println(dicVOs.length + "개 읽음");
			
			for(DicVO vo : dicVOs) {
				System.out.println(vo.getH() + "(" + vo.getM() + " " + vo.getM1() + ")");
			}
			// 저장하기
			gson.toJson(dicVOs, new FileWriter("src/main/resources/dic_copy.json"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
