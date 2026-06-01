package com.ojh;

public class Ex1 {

	public static void main(String[] args) {
		
		Myobj myobj_1 = new Myobj();
		Myobj myobj_2 = new Myobj();
		Myobj myobj_3 = new Myobj();
		
		
		String str = "Lorem ifsum";
		int num = 7;

		System.out.println(myobj_1.x);
		System.out.println(myobj_1.name);
		System.out.println(myobj_2.x);
		System.out.println(myobj_2.name);
		System.out.println(myobj_3.x);
		myobj_3.x = 10;
		myobj_3.name = "집에 가고 싶다.";
		System.out.println(myobj_3.x);
		System.out.println(myobj_3.name);
		System.out.println(myobj_2.x);
		
		myobj_1.myMethod();
		myobj_2.myMethod();
		myobj_3.myMethod();
		
		System.out.println("==============================");
		
		myobj_1.myMethod(1);
		myobj_2.myMethod(2);
		myobj_3.myMethod(3);
		myobj_3.myMethod(4);
	
	}

}
