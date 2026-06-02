package com.thein;
// Sub Class 2
public class Dog extends Animal {
 
	// 재정의
	public void animalSound() {
		System.out.println("멍멍");
		
		//부모의 메소드 사용하기
		super.animalSound();
	}
	
	public void animalColor() {
		System.out.println("점박이");
	}
}
