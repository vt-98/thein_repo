package com.thein.proj2;

public class Ex2 {

	public static void main(String[] args) {
		
//		Level myVar = Level.MEDIUM;
//		System.out.println(myVar);
//		
//		switch(myVar) {
//	      case LOW:
//	        System.out.println("Rare");
//	        break;
//	      case MEDIUM:
//	         System.out.println("Medium");
//	        break;
//	      case HIGH:
//	        System.out.println("Well Done");
//	        break;
//	    }
		
//		for(Level myVar2 : Level.values()) {System.out.println(myVar2);}
		
		// ===== enum Level1 -> Level2로 바꾸고 주석 처리 =====
		
		System.out.println("====================");
		Level2 myVar2 = Level2.MEDIUM;
		System.out.println(myVar2);
		
		
		System.out.println("--------------------");
		for(Level2 v2 : Level2.values()) {
			System.out.println(v2 + ": " + v2.getDescription());
		}
		
		
		
		
		
	}

}
