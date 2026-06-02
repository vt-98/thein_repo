package com.thein;

public class Ex5 {
	
	public static void main(String[] args) {
		
		// Class 이름으로 넣으면 static 으로 만들어짐. [StaticClass]의 public static String StaticVal.
		
		// 클래스 기준
		
		System.out.println(StaticClass.staticVal);
		
		System.out.println("변경 전: " + StaticClass.staticIntVal);
		StaticClass.staticIntVal = 999;
		System.out.println("변경 후: " + StaticClass.staticIntVal);
		
		System.out.println("------------------------------");
		
		// 오브젝트 기준
		
		StaticClass s1 = new StaticClass();
		StaticClass s2 = new StaticClass();
		StaticClass s3 = new StaticClass();
		
		System.out.println("변경 전: " + s1.color);
		
		s1.color = "#FF0052";
		s1.color = "#00C68D";
		s1.color = "#007979";
		
		System.out.println("변경 후: " + s1.color);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
