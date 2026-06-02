package com.thein;

public class Ex1_MyClass {

	public static void main(String[] args) {
		
//		데이터타입 오브젝트이름 = 이 클래스를 오브젝트로 생성하겠다();
		Car car1 = new Car();
		Car car2 = new Car("붕붕띠");
		Car car3 = new Car(1969, "현대");
		
		System.out.println("==========================");
		
		car1.printInfo();
		car2.printInfo();
		car3.printInfo();
		
		System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+");
		
//		캡슐화 private
		Person person1 = new Person();
		
		person1.setPersonName("홍길동");
		System.out.println(person1.getPersonName());
		
		
		
		
		
		
	}

}
