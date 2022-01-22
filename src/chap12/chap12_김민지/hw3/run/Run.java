package chap12.chap12_김민지.hw3.run;

import chap12.chap12_김민지.hw3.controller.SetDate;

public class Run {

	public static void main(String[] args) {
		
		SetDate tw1 = new SetDate();
		
		tw1.todayPrint();
		System.out.println(tw1.todayPrint());
		tw1.setDay();
		System.out.println(tw1.setDay());

	}

}
