package chap12.chap12_김민지.hw6.run;

import chap12.chap12_김민지.hw6.controller.DateCalculator;

public class Run {

	public static void main(String[] args) {
		
		DateCalculator dc = new DateCalculator();
		
		System.out.println("총 날짜 수 : " + dc.leapDate());

	}

}
