package com.thein;

public class CatA extends Animal {

	public void animalColor() {
		System.out.println("Cheeeeeese");
	}
	
	public void animalColorFlag(boolean flag) {
		
		if(flag) {
		super.animalColor();	// flag 가 true 일 때
		} else {
			animalColor();		// flag 가 false 일 때
		}
	}

}
