package com.thein.proj5;

import java.util.ArrayList;

public class Ex6_ArrayMain1 {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("포도");
		
		for(String f: fruits) {		//for-each 노트 참고
			System.out.println(f);
		}
	}

}
