package chap09.chap09_김민지.hw1.run;

import chap09.chap09_김민지.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee[] emp = new Employee[3]; // 객체배열을 크기 3으로 할당 한 뒤
		
		emp[0] = new Employee(); // 0번 인덱스에는 기본생성자를 통해서 객체 생성
		emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실"); // 1번 인덱스에는 매개변수 6개짜리 생성자를 이용하여 객체 생성
		emp[2] = new Employee (2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡"); // 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
		
		for(int i = 0; i < emp.length; i++) {
			System.out.println("emp[" + i + "] : " + emp[i].information());
		}
		
		System.out.println("==========================================================================");
		
		emp[0] = new Employee(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		for(int i = 0; i < emp.length-1; i++) {
			System.out.println("emp[" + i + "] : " + emp[i].information());
		}
		
		System.out.println("==========================================================================");
		
		for(int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].getEmpName()+"의 연봉 : " + ((int)(emp[i].getSalary()+(emp[i].getSalary()*emp[i].getBonusPoint()))*12) + "원");
		}
		
		System.out.println("==========================================================================");
		
		int sum = 0; // 직원들 연봉의 합
		
		for(int i = 0; i < emp.length; i++) {
						
			sum += (int)(emp[i].getSalary()+(emp[i].getSalary()*emp[i].getBonusPoint()))*12;
			
		}
		
		System.out.println("직원들의 연봉의 평균 : " + sum/emp.length + "원");
		
	}

}
