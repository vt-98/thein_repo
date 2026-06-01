package com.thein.operators;

public class Ex2_oper1 {

	public static void main(String[] args) {
		//연산자
		System.out.println("====== 산술연산자 =======");
		
		int x = 10;
		int y = 3;
		
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y));
		
		System.out.println("+=+=+=+=+=+=+=+=+=+=+");
		
		int z =5;
		++z;
		System.out.println("++z = " + (z));
		--z;
		System.out.println("--z = " + (z));
		
	}

}
