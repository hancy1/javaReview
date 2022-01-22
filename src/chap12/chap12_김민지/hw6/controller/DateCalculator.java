package chap12.chap12_김민지.hw6.controller;

import java.util.Calendar;

public class DateCalculator {

	public DateCalculator() {
		// TODO Auto-generated constructor stub
	}

	public long leapDate() { 

		Calendar cal = Calendar.getInstance(); // 오늘날짜 가져오기
		long sumDays = 0L; // 날짜를 더해서 담을 객체 생성

		for(int i = 1; i <= cal.get(Calendar.YEAR); i++) { // 1년부터 올해까지!
			if(i == cal.get(Calendar.YEAR)) { // 올해연도를 isLeapYear 메소드를 이용해 윤년, 평년 출력하기
				if(isLeapYear(i)) {
					System.out.println("올해는 윤년입니다.");
				}else {
					System.out.println("올해는 평년입니다.");
				}

				for(int j = 1; j <= (cal.get(Calendar.MONTH)+1); j++) { //  현재 월 : +1 해주기!!!!!!!
					if(j == (cal.get(Calendar.MONTH)+1)) {
						for(int k = 1; k <= cal.get(Calendar.DATE); k++) { // 현재 일 : 
							sumDays+=1; // 현재 월 의 일 만큼 sumDays 를 더해준다.
						}
					}else if(j == 2) { // 2월은 윤년 : 29일 평년 : 28일 더해준다.
						if(isLeapYear(i)) {
							sumDays+=29;
						}else {
							sumDays+=28;
						}
					}else if(j == 4 || j == 6 || j == 9 || j == 11) { // 4, 6, 9, 11 월은 30일 나머지는 31일을 더해준다.
						sumDays+=30;
					}else sumDays += 31;
				} // 여기까지는 올해의 월, 일만큼을 더해준 것.
			}else { // 올해 전까지의 연도를 따져서 윤년이면 366, 평년이면 365를 더해준다.
				if(isLeapYear(i)) {
					sumDays+=366;
				}else sumDays+=365;
			}

		}
		return sumDays;
	}


	public boolean isLeapYear(int year) { // 윤년 : 4의 배수이면서, 100의 배수가 아니거나 400의 배수가 되는 해

		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}else {
			return false;
		}
	}

}
