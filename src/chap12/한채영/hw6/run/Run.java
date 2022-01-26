package chap12.한채영.hw6.run;

import chap12.한채영.hw6.controller.DateCalculator;

public class Run {

	public static void main(String[] args) {

		DateCalculator dc = new DateCalculator();
		
		if(dc.isLeapYear(2022) == true) {
			System.out.println("올해는 윤년입니다.");
		} else {
			System.out.println("올해는 평년입니다.");
		}
	
		System.out.println("총 날짜 수: " + dc.leapDate());
		
	

	}

}
