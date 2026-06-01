package com.thein.scan;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		System.out.println("===== 두 숫자의 합을 구하기 =====");
		
		Scanner sc = new Scanner(System.in);	// ctrl + shift + o : Scanner -> 임포트 단축키, 근데 다른 기능인데 이름이 같은 애가 있다고 한다. 그래서 잘 확인하라고 하셨음
												//// ?? 임포트? 찾아볼 것
		System.out.println("첫 번째 숫자: ");
		int n = sc.nextInt();
		System.out.println("두 번째 숫자: ");
		int m = sc.nextInt();
		System.out.println("두 숫자의 합: ");
		System.out.println(n +m);

	}

}
