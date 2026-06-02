package com.thein;

public class Mouse implements Animal_Inter {

	@Override
	public void animalSound() {
		System.out.println("찍찍 / 인터페이스 구현 완");
		
	}

	@Override
	public void sleep() {
		System.out.println("꿈나라 모드 on");
		
	}
	
}
