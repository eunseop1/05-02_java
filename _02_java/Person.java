package kr.human._02_java;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
//직렬화 : 객체를 스트림으로 만든다
//역직렬화: 스트림을 객체로 만든다
//serializable 인터페이스를 구현해줘야 직결화/역직렬화를 지원한다
public class Person implements Comparable<Person>, Serializable, Cloneable{//트리를 쓸때 implements를 해줘야 한다
	//Comparable<Person>, Serializable, Cloneable는 필수적이다.
	//Comparable는 크기비교
	//Cloneable는 깊은 복사 가능하게 한다
	//VO를 만들때는 위의 3가지 인터페이스를 구현해주는것이 좋다
	private String name;
	private int age;
	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name)==0 ? age - o.age : name.compareTo(o.name);
		//이름 오름차순, 나이 오름차순으로 정렬
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {//클론은 수정이 불필요
		// TODO Auto-generated method stub
		return super.clone();
	}
}
