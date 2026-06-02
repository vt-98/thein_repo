package com.thein;

public class Car2 extends Vehicle2 {
	
	String modelName = "sorento";

	// 메소드
	public void honk() {
		System.out.println("빠ㅏㅏㅏㅏㅏ앙-!");
		
		// 부모의 필드에 접근
		System.out.println("super필드: " + super.brand);
		
	}
	
}
