package com.thein;

public class Account {
	String accountNum;
	String owner;
	int balance;
	
	// 생성자: 값을 초기화
	public Account(String accountNum, String owner, int balance) {
		
		this.accountNum = accountNum;
		this.owner = owner;
		this.balance = balance;
	}

	// 입금
	public void deposit(int amount) {
		
		// balance = balance + amount;
		balance += amount;
		System.out.println(amount + "원 입금 완료");
		System.out.println("잔액: " + balance);
		
	}
	
	// 출금
	public void withdraw(int amount) {
		
		if (amount > balance) {
			System.out.println("잔액부족");
			return;
		}
		
		balance -= amount;
		System.out.println(amount + "원 출금 완료");
		System.out.println("잔액: " + balance);
		
	}

	// 계좌정보
	public void showInfo() {
		System.out.println("계좌번호: " + accountNum );
		System.out.println("예금주: " + owner);
		System.out.println("잔액: " + balance);
		
	}
	
	
}
