package com.thein.proj2;

class Animal {
	static String MyName = " ==== 동물농장 === ";
	// 내가 쓴 A
	 String aniName = "동물 이름";
	 String aniSound = "동물 소리";
	 
	void aniEats() {
        System.out.println("동물 먹이");
	}
	
	void aniSleep() {
		System.out.println("잠");
	}
	
	// ==================================================
	// 강사님 A
	
	// 동물 이름
	String name = "동물이름";
	// 동물 소리
	String sound = "동물 소리";
	// 동물 나이
	int age;
	// 동물 먹이 먹기
	String eating;
	// 동물 잠 자기
	String sleeping;
	
	// 동물 나이
	void aging(int age) {
		this.age += age;
	}
	
	// 동물 먹이 먹기
	void eating (String eat) {
		eating = "먹이를 먹습니다";
	}
	
	// 동물 잠 자기
	void sleeping() {
		sleeping = "잠을 잡니다";
	}
	
	// +정보 출력
	void info() {
		System.out.println(
				"동물의 이름은 " + name +
				"\n동물의 소리는 " + sound +
				"\n동물의 나이는 " + age +
				"\n동물이 " + eating +
				"\n동물이 " + sleeping
				);
	}
	
	
}
