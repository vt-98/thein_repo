package com.thein;

public class Ex2_Inheritance extends Vehicle {
	private String modelName = "Cadillac";
	
	public static void main(String[] args) {
		
//		Vehicle transit = new Vehicle();	// extends를 했으니깐 필요 x
//		transit.honk()
		
		Ex2_Inheritance ex2_Inheritance1 = new Ex2_Inheritance();
		
		ex2_Inheritance1.honk();
		
		System.out.println(ex2_Inheritance1.modelName);
		System.out.println(ex2_Inheritance1.brand);
		
		
		
		
		
		
		
		
	}

}
