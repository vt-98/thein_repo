package com.thein;

public class Ex6_Abstract {

	public static void main(String[] args) {
		
		Tiger tiger = new Tiger();
		tiger.animalSound();
		tiger.sleep();		// sleep 이 Tiger에 없으니 super 클래스 Carnivore로 가서 찾아옴

	}

}
