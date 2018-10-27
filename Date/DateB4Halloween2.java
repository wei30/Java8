package com.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Locale;

public class DateB4Halloween2 {
	public static void main(String[] args) {
		LocalDateTime localTime = LocalDateTime.now();
		LocalDate halloweenday = localTime.toLocalDate().withDayOfMonth(31);
		System.out.println(halloweenday);
		if(halloweenday.equals(LocalDate.now())){
			System.out.println("Happy Halloween");
		}else{
			System.out.println("Not a Halloween Day");
		}
	   Period days = Period.between(LocalDate.now(), LocalDate.of(2018, 10, 31));
	   System.out.println("There are " + days + " days before Halloween.");
	}
}
