package com.thein.proj4;

abstract class Animal implements InterAnimal {

	@Override
	public void run() {
		System.out.println("동물이 달립니다");
	}
	
	@Override
	public void sleep() {
		System.out.println("동물이 잡니다");
	}
}
