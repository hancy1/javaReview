package chap10.chap10_김민지.hw1.run;

import java.util.Scanner;

import chap10.chap10_김민지.hw1.model.vo.Employee;
import chap10.chap10_김민지.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 3명의 학생 정보를 기록할 수 있게 객체 배열을 할당하고 아래의 사용데이터를 참고하여 3명의 학생 객체 생성 후 반복문을 통해 출력
		
		Student[] stu = new Student[3];
		
		stu[0] = new Student("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
		stu[1] = new Student("김말똥", 21, 187.3, 80, 2, "경영학과");
		stu[2] = new Student("강개순", 23, 167.0, 45, 4, "정보통신공학과");
		
		for(Student s : stu) {
			System.out.println(s.information());
		}

		Scanner sc = new Scanner(System.in);
		
		//2. 최대 10명의 사원 정보를 기록할 수 있게 객체 배열을 할당하고 반복문을 사용하여 키보드로 사원 정보를 입력 받도록 구현 2명 정도의 사원 정보를 입력 받아 각 객체에 저장하고 현재까지 기록된 사원들의 정보 출력
		Employee[] emp = new Employee[10];
		
		int count = 0;
		
		while(true) {
			System.out.println("이름 : ");
			String name = sc.nextLine();
			
			System.out.println("나이 : ");
			int age = sc.nextInt();
			
			System.out.println("신장 : ");
			double height = sc.nextDouble();
			
			System.out.println("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.println("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			
			System.out.println("부서 : ");
			String dept = sc.nextLine();
			
						
			emp[count++] = new Employee(name, age, height, weight, salary, dept);
			
			
			System.out.println("계속 입력하시겠습니까? (y/n)");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			
			if(ch == 'N') {
				break;
			}
		}
		for(int i = 0; i < count; i++) {
			System.out.println(emp[i].information());
		}
	}

}
