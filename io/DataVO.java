package kr.human.io;

import java.io.Serializable;

public class DataVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//자바는 이러한 일렬 번호로 객체를 구분한다.
	//만약 클래스 안의 내용이 변하면 자바에서는 새로운 serialVersionUID를 부여하여 완전히 다른 객체로 구분한다
	//serialVersionUID가 다르면 전혀 다른 객체로 구분하기에 수정 전의 데이터를 읽지 못하는 대참사가 발생한다
	//따라서 serialVersionUID의 값을 고정시키자
	
	private String stringData;
	private int intData;
	
	public DataVO(String stringData, int intData) {
		super();
		this.stringData = stringData;
		this.intData = intData;
	}

	@Override
	public String toString() {
		return "DataVO [stringData=" + stringData + ", intData=" + intData + "]";
	}

	public String getStringData() {
		return stringData;
	}

	public void setStringData(String stringData) {
		this.stringData = stringData;
	}

	public int getIntData() {
		return intData;
	}

	public void setIntData(int intData) {
		this.intData = intData;
	}
	
	
}
