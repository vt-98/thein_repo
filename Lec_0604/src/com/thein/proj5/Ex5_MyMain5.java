package com.thein.proj5;

public class Ex5_MyMain5 {

	public static void main(String[] args) {
		
		// 실습 진행: 간편결제 시스템
		
		Payment p0 = new Payment();
		Payment p1 = new CardPayment();
		Payment p2 = new TossPay();
		
		p0.pay(999);
		p1.pay(10000);
		p2.pay(20000);
	}

}
