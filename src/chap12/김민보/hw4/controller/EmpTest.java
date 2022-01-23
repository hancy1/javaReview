package chap12.김민보.hw4.controller;

import java.util.Scanner;

import chap12.김민보.hw4.model.vo.Employee;

public class EmpTest {

	Employee[] empArr = new Employee[6];
	
	public void setEmp() {
		
		
		//위에 사용데이터랑 실행결과에 나오는 데이터랑 다름...?;
		
		empArr[0] = new Employee("김문말", 24, 1500000, 1.245);
		empArr[1] = new Employee("이장소", 40, 2500000, 1.4);
		empArr[2] = new Employee("박금순", 22, 1780000, 1.3);
		empArr[3] = new Employee("최봉호", 31, 1950000, 1.365);
		empArr[4] = new Employee("홍달림", 34, 1650000, 1.212);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.println("급여를 입력하세요 : ");
		int salary = sc.nextInt();
		
		System.out.println("세율을 입력하세요 : ");
		double tax = sc.nextDouble();
		
		empArr[5] = new Employee(name, age, salary, tax);
		
				
	}
	
	public void printEmp() {
		
		for(int i = 0; i<empArr.length; i++) {
			System.out.println(empArr[i].toString());					
		}		
		
	}
	
	public void nameSortPrint() {
		
		for(int i = 0; i<empArr.length; i++) {
			for(int j = 0; j<i; j++) {				
				if(empArr[i].getName().compareTo(empArr[j].getName()) < 0 ){					
					Employee temp = empArr[i];
					empArr[i] = empArr[j];
					empArr[j] = temp;
				}
			}
		}	
	}
	
	
	
	
}
