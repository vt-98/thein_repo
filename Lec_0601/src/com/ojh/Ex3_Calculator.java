package com.ojh;

public class Ex3_Calculator {

	public static void main(String[] args) {
		System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
		// Q1. 클래스를 사용하여 사칙연산을 담당하는 계산기를 작성합시다
		
		// 내가 쓴 A
		Calc cal = new Calc();
	
		double a = 12.0;
		double b = 5.0;
		
		System.out.println(a + " + " + b + " = " + cal.add(a, b));
	    System.out.println(a + " - " + b + " = " + cal.subtract(a, b));
	    System.out.println(a + " * " + b + " = " + cal.multiply(a, b));
	    System.out.println(a + " / " + b + " = " + cal.divide(a, b));
	    System.out.println(a + " % " + b + " = " + cal.remain(a, b));

		System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
		
//	     강사님 A ===================================================
		// 쓰시려고 했는데 어려울까봐 안 쓰셧다고 하심
		//// int num1;
	    //// int num2;
	    //// String strResult;
		int result;
	    
	    // 1. 계산기 클래스 정의하기
//	    Calc cal = new Calc();
	    
	    // 2. 필요한 기능(사칙연산) 정의하기
	    // sumCal() : tot = num1 + num2
	    cal.addCal(200,100);
	    cal.subCal(200,100);
	    cal.mulCal(200,100);
	    cal.divCal(200,100);
	    cal.remCal(200,100);
	    
	    System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
	    
	    // 3. 결과값 출력하기
	    // 덧셈
	    result = cal.addCal2(200,100);
	    System.out.println("add result = " + result);
	    // 뺄셈
	    result = cal.subCal2(200,100);
	    System.out.println("substract result = " + result);
	    // 곱셈
	    result = cal.mulCal2(200,100);
	    System.out.println("multifly result = " + result);
	    // 나눗셈
	    result = cal.divCal2(200,100);
	    System.out.println("divide result = " + result);
	    // 나머지
	    result = cal.remCal2(200,100);
	    System.out.println("remain result = " + result);
	    
	}

}
