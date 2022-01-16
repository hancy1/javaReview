package chap09.한채영.hw1.run;

import chap09.한채영.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		// 객체배열을 크기 3으로 할당 한 뒤
		// 0번 인덱스에는 기본생성자를 통해서 객체 생성
		// 1번 인덱스에는 매개변수 6개짜리 생성자를 이용하여 객체 생성
		// 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
		
		Employee[] emp = new Employee[3];
		
		emp[0] = new Employee();
		emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

		for(Employee e : emp) {
			System.out.println(e.information());
		}
		
		System.out.println("=================================================");
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력
		
		emp[0] = new Employee(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2,"01055559999", "전라도 광주");
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		for(Employee e : emp) {
			System.out.println(e.information());
		}
		
		System.out.println("=================================================");
		
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 보너스가 적용된 연봉 = (급여 + (급여 * 보너스포인트)) * 12
		
		int bonus0 = (int) ((emp[0].getSalary() + (emp[0].getSalary() * emp[0].getBonusPoint())) * 12);
		int bonus1 = (int) ((emp[1].getSalary() + (emp[1].getSalary() * emp[1].getBonusPoint())) * 12);
		int bonus2 = (int) ((emp[2].getSalary() + (emp[2].getSalary() * emp[2].getBonusPoint())) * 12);
		
		System.out.println("김말똥의 연봉 : " + bonus0 + "원");
		System.out.println("홍길동의 연봉 : " + bonus1 + "원");
		System.out.println("강말순의 연봉 : " + bonus2 + "원");
		
		System.out.println("=================================================");
		
		// 3명 직원의 연봉 평균을 구하여 출력
		
		int avg = (bonus0 + bonus1 + bonus2) / 3;
		
		System.out.println("직원들의 연봉의 평균: " + avg +"원");
	}

}
