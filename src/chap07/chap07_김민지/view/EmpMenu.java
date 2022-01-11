package chap07.chap07_김민지.view;

import java.util.Scanner;

import chap07.chap07_김민지.model.vo.Employee;

public class EmpMenu {

	Scanner sc = new Scanner (System.in);

	public EmpMenu() {
		// TODO Auto-generated constructor stub
	}

	public void mainMenu() {
		Employee emp = null; //mainMenu() 메소드에 초기 사원 객체 null 로 초기화 후 진행

		while(true) {
			System.out.println("===== 사원 정보 관리 프로그램 =====");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch(num) {
			case 1 : emp = inputEmployee();
			break;
			case 2 : modifyEmployee(emp);
			break;
			case 3 : emp = null; 
			break;
			case 4 : System.out.println(emp.information());
			break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			break;
			}
		}

	}

	public Employee inputEmployee() {

		System.out.println("사원명 : ");
		String empName = sc.nextLine();

		System.out.println("부서명 : ");
		String dept = sc.nextLine();

		System.out.println("직급 : ");
		String job = sc.nextLine();

		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("성별 : ");
		char gender = sc.nextLine().charAt(0);

		System.out.println("급여 : ");
		int salary = sc.nextInt();

		System.out.println("보너스포인트 : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();

		System.out.println("전화번호 : ");
		String phone = sc.nextLine();

		System.out.println("주소 : ");
		String address = sc.nextLine();

		Employee newEmp = new Employee(empName, dept, job, age, gender, salary, bonusPoint, phone, address);
		return newEmp;


	}

	public void modifyEmployee(Employee emp) {

		while(true) {
			System.out.println("==== 사원 정보 수정 메뉴 ====");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch(num) {

			case 1: System.out.println("변경할 이름 : ");
				    String newName = sc.nextLine();
				    emp.setEmpName(newName);
				    break;
			case 2: System.out.println("변경할 급여 : ");
					int newSalary = sc.nextInt();
					sc.nextLine();
					emp.setSalary(newSalary);
					break;
			case 3: System.out.println("변경할 부서 : ");
			        String newDept = sc.nextLine();
			        emp.setDept(newDept);
			        break;
			case 4: System.out.println("변경할 직급 : ");
				    String newJob = sc.nextLine();
				    emp.setJob(newJob);
				    break;
			case 9: System.out.println("이전 메뉴로 돌아갑니다."); return;
			default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			        break;
			}
		}

	}
}
