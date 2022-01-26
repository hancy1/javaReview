package chap12.김민보.hw4.run;

import chap12.김민보.hw4.controller.EmpTest;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpTest et = new EmpTest();

		et.setEmp();
		System.out.println("=========정렬 이전 =========");
		et.printEmp();
		
		et.nameSortPrint();
		System.out.println("=========정렬 이후 ==========");
		et.printEmp();
		
		
	}

}
