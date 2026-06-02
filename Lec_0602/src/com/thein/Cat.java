package com.thein;

public class Cat extends Animal {
	
	public void animalSound() {
		System.out.println("야옹");
	}
	
	public void animalColor() {
		System.out.println("치즈");
		
		super.animalColor();
	}
}	
