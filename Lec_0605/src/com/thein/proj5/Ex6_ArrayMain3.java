package com.thein.proj5;

import java.util.ArrayList;

public class Ex6_ArrayMain3 {
	
	public static void main(String[] args) {
		
		ArrayList<String> members = new ArrayList<String>();
		
		members.add("김철수");
		members.add("이영희");
		members.add("박민수");
		System.out.println(members);
		
		members.add("이영희");
		System.out.println(members);
	}
}
