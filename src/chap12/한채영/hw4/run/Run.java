package chap12.한채영.hw4.run;

import chap12.한채영.hw4.controller.EmpTest;

public class Run {

	public static void main(String[] args) {
		
		EmpTest et = new EmpTest();
		
		et.setEmp();
		System.out.println("------------------------정렬 이전------------------------");
		et.printEmp();
		
		et.namesortPrint();
		System.out.println("------------------------정렬 이후------------------------");
		et.printEmp();
	}

}
