package com.thein.proj2;

class Cat extends Animal {
	
	// 내가 쓴 A
	Cat() {
		this.aniName = "야옹이";
		this.aniSound = "야옹야옹~";
	}
	
	void aniEats() {
		System.out.println("츄르");
	}
	
	void aniSleep() {
		System.out.println("눈 감고 잠");
	}
	
	// ==================================================
	// 강사님 A
	
	void aging(int age) {
		super.aging(age);
	}
	
}
