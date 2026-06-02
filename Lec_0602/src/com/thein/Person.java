package com.thein;

public class Person {
	
	// public String personName; : 패키지 내에서 자유롭게 사용 가능.
	// private String personName; : 이 안에서만 사용됨. 게터(get)와 세터(set)를 이용해 변수에 접근
	private String personName;

	// get: 값을 얻다
	public String getPersonName() {
		return personName;
	}

	// set: 값을 
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	
	
	
	
	
	
	
}
