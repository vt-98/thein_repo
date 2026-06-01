package com.ojh;

public class Myobj {
	
	int x = 5;
	String name = "집";
	
	// 구분(노트참고): void myMethod()
	public void myMethod() {
		System.out.println("myMethod!!!");
		
	}

	// 구분: void myMothod(int i)
	//// Q1. 오브젝트의 이름을 전달받아서 출력할 것.
//	public void myMethod(int i) {
//		if (i == 1) {
//	        System.out.println("1번");
//	    } else if (i == 2) {
//	        System.out.println("2번");
//	    } else if (i == 3) {
//	        System.out.println("3번");
//	    } else {
//	        System.out.println("1~3만 선택할 것");
//	    }	
//	}
	//// A1
	public void myMethod(int i) {
		//A1-1.
		System.out.println("meMethod 실행됨");
		System.out.println(i);
		
		//A1-2
		System.out.println("myobj_" + i);
		
		//// 변수를 활용하기 시작. 변수를 잘 사용하는 것이 중요하다. 스트링이 적으면 적을수록 굿
		//A1-3
		String str1 = "myboj_";
		System.out.println(str1 + i);
		
		//A1-4
		String result = "myobj_" + i;
		System.out.println(result);
		
		//A1-5 굿굿. 유지보수 편리
		String result2 = str1 + i;
		System.out.println(result2);
	}

	
}
