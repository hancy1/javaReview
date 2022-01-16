package chap09.김민보.hw1.run;

import chap09.김민보.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee[] emp = new Employee[3];//객체 3으로 할당
		emp[0] = new Employee();//0번 기본인덱스
		emp[1] = new Employee(1, "홍길동", 19, 'M', "010-2222-3333", "서울 잠실");//1번인덴스 : 매개변수 6개짜리로 생성
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'f', 1000000, 0.01, "010-1111-2222", "서울마곡");
		//2번인덱스: 매개변수 10개짜리로 생성
		
		//전부 다 출력
		for(int i = 0; i<emp.length; i++) {
			System.out.println("emp["+ i +"] : "+emp[i].information());
		}
		
		
		System.out.println("==========================================================================");
		
		//10개 전부 수정해야되기때문에 매개변수 10개짜리 생성자로 새로 입력
		emp[0] = new Employee(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "010-5555-9999", "광주광역시");
		
		//입력안된 4개 항목만 추가입력
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		//수정된 객체만 출력
		System.out.println("emp["+ 0 +"] : "+ emp[0].information());
		System.out.println("emp["+ 1 +"] : "+ emp[1].information());
		
		
		System.out.println("==========================================================================");
		//보너스가 적용된 1년 연봉을 계산하여 출력
		

		for(int i = 0; i<emp.length; i++) {
			System.out.println(emp[i].getEmpName() +"의 연봉 : " + emp[i].loveSalary() + "원");
		}
		
		//Employee에 loveSalary 메소드 따로 만들어서 출력함
		
		
		System.out.println("==========================================================================");
		//직원 3명의 평균 연봉을 구하여 출력
		
		int sum = 0;
		
		//직원의 연봉을 하나씩 불러와서 더함
		for(int i =0; i<emp.length; i++) {			
			sum += emp[i].loveSalary();			
		}
		
		//평균값 구하기
		int avg = sum/emp.length;
		
		
		System.out.println("직원들 연봉의 평균 : " + avg + "원");
		
		
		
	
		
		
	}

}
