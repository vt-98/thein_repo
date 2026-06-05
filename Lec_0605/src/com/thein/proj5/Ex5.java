package com.thein.proj5;

import java.util.ArrayList;

public class Ex5 {
	
	public static void main(String[] args) {
		
		//선언부
		ArrayList<String> cars;
		
		// 초기화
		cars = new ArrayList<String>(); //ArrayList<String> cars 였는데 중복 오류로 cars로 수정
		System.out.println(cars);
		
		// 값을 추가
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars + "\n갯수는 " + cars.size() + "\n");
	    
	    // 특정 위치에 값을 추가
	    cars.add(0, "추가된 KIA 친구");
	    System.out.println(cars + "\n갯수는 " + cars.size() + "\n");
	    
	    // 0번째 위치의 값을 출력
	    System.out.println(cars.get(0));
	    System.out.println(cars + "\n갯수는 " + cars.size() + "\n");
	    
	    // 1번째 위치에 "Cadillac" 추가
	    cars.set(1, "Cadillac");
	    System.out.println(cars + "\n갯수는 " + cars.size() + "\n");
	    
	    // 4번째 데이터 삭제
	    cars.remove(4);
	    System.out.println(cars + "\n갯수는 " + cars.size() + "\n");
	    
	    // 데이터 전체 깨끗하게 삭제
	    cars.clear();
	    System.out.println(cars + "\n갯수는 " + cars.size() + "\n");
	    
	}
}
