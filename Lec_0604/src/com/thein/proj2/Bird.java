package com.thein.proj2;

class Bird extends Animal {

	// 내가 쓴 A
	Bird() {
		this.aniName = "짹짹이";
		this.aniSound = "짹짹~";
	}
	
	void aniEats() {
		System.out.println("열매");
	}
	
	void aniSleep() {
		System.out.println("눈 뜨고 잠");
	}
	
	// ==================================================
	// 강사님 A 없는 거만 선언해서 추가
	
	String layEgg;
	
	void layEgg() {
		this.layEgg = "알을 낳습니다";
	}
	
	
	
}
