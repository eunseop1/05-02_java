package kr.human.Java0502;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person implements Comparable<Person> {
	private String name;
	private int age;
	@Override
	public int compareTo(Person o) {
		// 이름오름차순 나이 오름차순
		return name.compareTo(o.name)==0 ? age-o.age : name.compareTo(o.name);
	}
}
