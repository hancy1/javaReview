package chap12.chap12_김민지.hw4.run;

import chap12.chap12_김민지.hw4.controller.EmpTest;

public class Run {

	public static void main(String[] args) {
		EmpTest et = new EmpTest();
		
		et.setEmp();
		
		System.out.println("------------------------정렬 이전------------------------");
		
		et.printEmp();
		
		et.nameSortPrint();
		
		System.out.println("------------------------정렬 이후------------------------");
		
		et.printEmp();

	}

}
