package org.altar.training.ex12;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;


public class Main {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2017, 6, 19);
		
		System.out.println("Birthday party is scheduled to " + nextSunday(date));
	}
	
	private static LocalDate nextSunday(LocalDate date){
		if(date.getDayOfWeek() == DayOfWeek.SUNDAY){
			return date;
		}
		
		return date.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
	}
}
