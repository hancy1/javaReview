package chap07.김민보.view;

import java.util.Scanner;

import chap07.김민보.model.vo.Employee;

public class EmpMenu {

	Scanner sc = new Scanner(System.in);
	
	public EmpMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
		
		Employee emp = null;
		
		while(true) {
			
			System.out.println("===사원 정보 관리 프로그램===");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");			
			
			
			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			

			switch(num) {
			case 1:
				emp = inputEmployee();				
				break;
			
			case 2:			
				modifyEmpoyee(emp);				
				break;
				
			case 3:				
				emp=null; //가비지컬렉터가제거			
				break;
				
			case 4:				
				System.out.println(emp.information());				
				break;
				
			case 9:
				System.out.println("프로그램이 종료됩니다.");				
				return;
				
			}
		}	
	}


	public Employee inputEmployee() { // Employee를 반환하는 inputEmployee메소드
		
		// 키보드를 통해 사원 정보를 입력받게끔 구현
		sc.nextLine();
		System.out.println("이름: ");
		String empName = sc.nextLine();
		
		System.out.println("부서명 : ");
		String dept = sc.nextLine();
		
		System.out.println("직급 :");
		String job = sc.nextLine();		
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.println("성별(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("급여 : ");
		int salary = sc.nextInt();
		
		System.out.println("보너스포인트 : ");
		double bonusPoint = sc.nextDouble();
		
		sc.nextLine();
		System.out.println("전화번호 : ");
		String phone = sc.nextLine();
		
		System.out.println("주소 : ");
		String adress = sc.nextLine();		
		
		
		return new Employee(empName, dept, job, age, gender, salary, bonusPoint, phone, adress);		

		
	}
	
	

	public void modifyEmpoyee(Employee emp) {
		
		while(true) {
			
			System.out.println("===사원 정보 수정 메뉴===");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전 메뉴로");			
			
			
			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				System.out.println("변경할 이름 : ");				
				String name = sc.nextLine();
				emp.setEmpName(name);
				
				break;
			
			case 2:
				System.out.println("변경할 급여금액: ");
				int salary = sc.nextInt();					
				emp.setSalary(salary);
				
				break;
			
			case 3:
				System.out.println("변경할 부서 : ");
				String dept = sc.nextLine();
				emp.setDept(dept);
				
				break;
			
			case 4:
				System.out.println("변경할 직급 : ");
				String job = sc.nextLine();
				emp.setJob(job); 
				
				break;
			
			case 9:
				System.out.println("이전 메뉴로 돌아갑니다.");
				
				return;
			}
			
			
		}
		
	}
	
}
