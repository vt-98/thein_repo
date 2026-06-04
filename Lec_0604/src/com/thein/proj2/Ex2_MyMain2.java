package com.thein.proj2;

public class Ex2_MyMain2 {

	public static void main(String[] args) {
		
//		Q1. pig cat dog bird 각 동물의 이름, 소리, 먹이, 잠을 출력할 것
		// 내가 쓴 A
		System.out.println(Animal.MyName);
		System.out.println("--------------------");
		
		Pig pig1 = new Pig();
//		System.out.println(pig1.pigName));
		System.out.println(pig1.aniName);
		System.out.println(pig1.aniSound);
		pig1.aniEats();
		pig1.aniSleep();
		
		System.out.println("--------------------");
		
		Cat cat1 = new Cat();
//		System.out.println(cat1.catName));
		System.out.println(cat1.aniName);
		System.out.println(cat1.aniSound);
		cat1.aniEats();
		cat1.aniSleep();
		
		System.out.println("--------------------");
		
		Dog dog1 = new Dog();						// 이 네 가지 주석 상태 -> 유지보수 힘들고 귀찮
//		System.out.println(dog1.dogName));
		System.out.println(dog1.aniName);
		System.out.println(dog1.aniSound);
		dog1.aniEats();
		dog1.aniSleep();
		
		System.out.println("--------------------");
		
		Bird bird1 = new Bird();
//		System.out.println(bird1.birdName));
		System.out.println(bird1.aniName);
		System.out.println(bird1.aniSound);
		bird1.aniEats();
		bird1.aniSleep();
		
		System.out.println("====================");
		
		// ==================================================
		// 강사님 A / 각 클래스 강사님 답안 참고할 것. 많이 섞인 상태

		// 이름출력
		// 소리출력
		// 먹기() 출력
		// 자기() 출력
		
		//생성자 위에서 만들어서 생략함 e.g. Pig pig1 = new Pig();
		pig1.name = "꿀꿀이";
		System.out.println(pig1.name);
		pig1.sound = "꿀꿀꿀~";
		System.out.println(pig1.sound);
		pig1.aging(3);
		pig1.eating("와구와구");
		pig1.sleeping();
		pig1.info();
		
		System.out.println("--------------------");
		
		cat1.name =  "고먐미";
		cat1.aging(1);
//		cat1.eating();
		cat1.sleeping();
		cat1.info();
		
		System.out.println("--------------------");
		
		dog1.name = "멍멍이";
		dog1.aniSound = "멍멍왈~";
		dog1.info();
		
		System.out.println("--------------------");
		bird1.layEgg();
		System.out.println(bird1.layEgg);
		bird1.info();
		
	}

}
