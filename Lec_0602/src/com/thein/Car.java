package com.thein;

public class Car {
	
	int modelYear;
	String modelName;
	
	public Car() {
		System.out.println("기본생성자");
		
		System.out.println("--------------------------");
	}

//	   new Car(       "붕붕띠" )	
	public Car(String modelName) {
		this(2026, modelName);
		
		System.out.println(modelName);
		this.modelName = modelName;
		System.out.println("this.모델명: " + this.modelName);
		
		System.out.println("--------------------------");
	}

//	   new Car(      1969   ,          "현대"  )
	public Car(int modelYear, String modelName) {
		System.out.println(modelYear);
		System.out.println(modelName);
		
//		this.modelYear = modelYear;
//		this.modelName = modelName;
		System.out.println("this.출신연도: " + this.modelYear);
		System.out.println("this.모델명: " + this.modelName);
	}

	public void printInfo() {
		System.out.println(modelYear + " - " + modelName);
		
	}

}
