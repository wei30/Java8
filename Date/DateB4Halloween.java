package com.date;

import java.time.LocalDate;
import java.time.Period;

public class DateB4Halloween {
	public static void main(String[] args) {
	   Period days = Period.between(LocalDate.now(), LocalDate.of(2018, 10, 31));
	   System.out.println("There are " + days + " days before Halloween.");
	}
}
