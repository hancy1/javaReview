package chap12.한채영.hw3.run;

import chap12.한채영.hw3.controller.SetDate;

public class Run {

	public static void main(String[] args) {

		SetDate sd = new SetDate();
		System.out.println(sd.todayPrint());
		//sd.setDay();
		System.out.println(sd.setDay());
	}

}
