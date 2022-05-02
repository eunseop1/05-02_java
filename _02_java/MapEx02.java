package kr.human._02_java;

import java.util.HashMap;
import java.util.Iterator;

public class MapEx02 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();//1.5에 추가된것 -> 싱글스레드에서만 안전
		//자동정렬이 된다
		
		map.put(1, "1사람");
		map.put(2, "2사람");
		map.put(3, "3사람");
		map.put(1, "4사람");//넣기 -> key는 set이다
		
		System.out.println(map.size() + "개 : " + map);
		System.out.println(map.get(2));// 1개 얻기
		System.out.println(map.containsKey(4));// 있느냐
		System.out.println(map.containsValue("5사람"));
		System.out.println("-".repeat(60));
		
		for(int key : map.keySet()) {//키를 Set으로 얻기
			System.out.println(key + " : " + map.get(key));
		}
		
		for(String value : map.values()) {
			System.out.println(value);
		}
		System.out.println("-".repeat(60));
		
		Iterator<String> it = map.values().iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
