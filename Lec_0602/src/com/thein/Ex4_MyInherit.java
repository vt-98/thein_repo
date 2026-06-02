package com.thein;

public class Ex4_MyInherit {

	public static void main(String[] args) {
		
		Pig pig = new Pig();
		Dog dog = new Dog();
		
		// 다형성 테스트
		pig.animalSound();
		dog.animalSound();
		
		System.out.println("====================");
//		실습 진행 ==============================
//		Q1. 고양이 cat 오브젝트 생성
//		Q2. 동물들의 털 색상 출력
//		Q3. 치즈냥이 털 색상 출력
		
		// 내가 쓴 A==============================
		
		Cat cat = new Cat();
		
		cat.animalSound();
		
		System.out.println("--------------------");
		
		pig.animalColor();
		dog.animalColor();
		cat.animalColor();
		
		System.out.println("--------------------");
		// 강사님 A ==============================
		
		CatA catA = new CatA();
		
		catA.animalColorFlag(false);
		catA.animalColorFlag(true);
		
		
		
		
		
		
	}

}
