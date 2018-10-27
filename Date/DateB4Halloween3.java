package com.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class DateB4Halloween3 {
	public static void main(String[] args) {
		LocalDateTime localTime = LocalDateTime.now();
		LocalDate halloweenday = localTime.toLocalDate();
		int day = halloweenday.getDayOfMonth();
		Month month = halloweenday.getMonth();
		int dayOfyear = halloweenday.getDayOfYear();
		int year= halloweenday.getYear();
		System.out.println(month + " "+day + " "+year);
	   
	    Period days = Period.between(LocalDate.of(year, month, day), LocalDate.of(2018, 10, 31));
	    System.out.println("There are " + days + " days before Halloween.");
	   
	   
	}
}
