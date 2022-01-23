package chap12.한채영.hw6.controller;

import java.util.GregorianCalendar;

public class DateCalculator {

	public DateCalculator() {
		// TODO Auto-generated constructor stub
	}

	public boolean isLeapYear(int year) {

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			return true; // 윤년
		} else {
			return false; // 평년
		}

	}

	public long leapDate() {

		long total = 0;

		GregorianCalendar gc = new GregorianCalendar();

		int year = gc.get(GregorianCalendar.YEAR);
		int month = gc.get(GregorianCalendar.MONTH) + 1;
		int day = gc.get(GregorianCalendar.DATE);

		for (int i = 0; i < year; i++) {
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
				total += 366;
			} else {
				total += 365;
			}
		}

		System.out.println("total" + total);

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			total += 31;
		} else if (month == 2) {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				total += 29;
			} else {
				total += 28;
			}
		} else {
			total += 30;
		}

		System.out.println("total" + total);

		total += day;

		return total;
	}

}
