package com.ojh;

public class Calc {

	public double add(double a, double b) {
        return a + b;
	}
	public double subtract(double a, double b) {
		return a - b;
	}
	public double multiply(double a, double b) {
		return a * b;
	}
	public double divide(double a, double b) {
		return a / b;
	}
	public int remain(double a, double b) {
		return (int) (a % b);
	}
	
//    강사님 A ==================================================================

	// 더하기 기능
	public void addCal(int i, int j) {
		System.out.println(i + j);
	}
	// 뺄셈
	public void subCal(int i, int j) {
		System.out.println(i - j);
	}
	// 곱셈
	public void mulCal(int i, int j) {
		System.out.println(i * j);
	}
	// 나눗셈
	public void divCal(int i, int j) {
		System.out.println(i / j);
	}
	// 나머지
	public void remCal(int i, int j) {
		System.out.println(i % j);
	}
	
//  ==================================================================	
	
	// return 값이 있는 더하기 기능
	public int addCal2(int i, int j) {
		return (i + j);
	}
	// return 값이 있는 빼기 기능
	public int subCal2(int i, int j) {
		return (i - j);
	}
	// return 값이 있는 곱하기 기능
	public int mulCal2(int i, int j) {
		return (i * j);
	}
	// return 값이 있는 나누기 기능
	public int divCal2(int i, int j) {
		return (i / j);
	}
	// return 값이 있는 나머지 기능
	public int remCal2(int i, int j) {
		return (i % j);
	}
	
	
}
