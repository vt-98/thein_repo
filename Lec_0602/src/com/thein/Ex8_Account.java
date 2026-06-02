package com.thein;

public class Ex8_Account {

	public static void main(String[] args) {
		
		// 내가 통장을 개설할 때, 100000원의 초기 금액 입금.
		Account acc = new Account("940302", "오재현", 100000);
		
		System.out.println("==== 계좌정보 ====");
		// 계좌정보
		acc.showInfo();
		
		System.out.println("===============");
		
		// 입금
		acc.deposit(50000);
		
		System.out.println("---------------");
		
		// 출금
		acc.withdraw(30000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
