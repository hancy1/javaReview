package chap07.한채영.hw3.view;

import java.util.Scanner;

import chap07.한채영.hw3.model.vo.Employee;

public class EmpMenu {

	Scanner sc = new Scanner(System.in);

	public EmpMenu() {

	}

	public void mainMenu() {

		Employee emp = null;

		while (true) {

			System.out.println("===== 사원 정보 관리 프로그램 =====");
			System.out.println("1. 새 사원 정보 입력"); // inputEmployee() 실행 -> 반환 값으로 emp 초기화
			System.out.println("2. 사원 정보 수정"); // modifyEmployee() 실행
			System.out.println("3. 사원 정보 삭제"); // 가비지 컬렉터가 지워주게끔
			System.out.println("4. 사원 정보 출력"); // Employee의 information() 사용
			System.out.println("9. 프로그램 종료"); // return 처리
			System.out.println("메뉴 번호 선택: ");
			int menu = sc.nextInt();

			switch (menu) {

			case 1:
				emp = inputEmployee(); //반환 값으로 emp 초기화
				break;
			case 2:
				modifyEmployee(emp);
				break;
			case 3:
				emp = null;
				break;
			case 4:
				System.out.println(emp.information());
				break;
			case 9:
				return;
			}

		}
	}

	public Employee inputEmployee() {
		// 키보드를 통해 사원 정보를 입력받게끔 구현
		// 매개변수 생성자를 이용하여 입력 받은 값으로 객체 생성
		// 생성된 객체의 주소 값 반환

		sc.nextLine(); // 버퍼빼기

		System.out.println("이름: ");
		String name = sc.nextLine();

		System.out.println("부서: ");
		String dept = sc.nextLine();

		System.out.println("직급: ");
		String job = sc.nextLine();

		System.out.println("나이: ");
		int age = sc.nextInt();

		sc.nextLine();
		System.out.println("성별: ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("급여: ");
		int salary = sc.nextInt();
		
		System.out.println("보너스: ");
		double bonus = sc.nextDouble();
		
		sc.nextLine();
		System.out.println("전화번호: ");
		String phone = sc.nextLine();
		
		System.out.println("주소: ");
		String address = sc.nextLine();
		
		Employee emp = new Employee(name, dept, job, age, gender, salary, bonus, phone, address);
		return emp;
	}

	public void modifyEmployee(Employee emp) {

		while (true) {
			System.out.println("===== 사원 정보 수정 메뉴 =====");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 번호 선택: ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				sc.nextLine();
				System.out.println("변경할 이름: ");
				String name = sc.nextLine();
				emp.setEmpName(name);
				break;
			case 2:
				System.out.println("변경할 급여: ");
				int sal = sc.nextInt();
				emp.setSalary(sal);
				break;
			case 3:
				sc.nextLine();
				System.out.println("변경할 부서: ");
				String dept = sc.nextLine();
				emp.setEmpName(dept);
				break;
			case 4:
				sc.nextLine();
				System.out.println("변경할 직급: ");
				String job = sc.nextLine();
				emp.setEmpName(job);
				break;
			case 9:
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;
			}
		}

	}

}
