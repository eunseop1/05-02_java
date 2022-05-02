package kr.human.web1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class GsonEx03 {
	public static void main(String[] args) {
		Gson gson = new Gson();
		
		try {
			//Json객체 만들기
			JsonObject j = new JsonObject();
			j.addProperty("name", "한사람");
			j.addProperty("age", 33);
			j.addProperty("gender", true);
			j.addProperty("height", 178.9);
			
			System.out.println(j);
			
			//저장하기
			FileWriter fw = new FileWriter("src/main/resources/person.json");
			
			gson.toJson(j, fw);
			//fw.flush();//없어도 작동
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
