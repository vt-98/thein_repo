package com.thein.proj3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex3 {

	public static void main(String[] args) {
		
		// 로컬 PC를 기준으로 날짜 출력
		LocalDate date = LocalDate.now();
		System.out.println(date);

		// 로컬 PC를 기준으로 시간 출력
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		// 로컬 PC를 기준으로 날짜와 시간 출력
		LocalDateTime localDT = LocalDateTime.now();
		System.out.println("날짜 시간: " + localDT);
		
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String str = localDT.format(myFormat);
		System.out.println(str);
	}

}
