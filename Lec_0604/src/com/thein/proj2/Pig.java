package com.thein.proj2;

class Pig extends Animal {
	
	// 내가 쓴 A
	Pig() {
		this.aniName = "꿀꿀이";
		this.aniSound = "꿀꿀꿀~";
	}
	
	void aniEats() {
		System.out.println("잡식");
	}
	
	void aniSleep() {
		System.out.println("눈 감고 잠");
	}
	
	// ==================================================
	// 강사님 A
	
	void eating() {
		super.eating("낼름낼름");
	}
	
	
	
	
	
	
	
}
