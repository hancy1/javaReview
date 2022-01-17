package chap10.김민보.hw1.run;

import java.util.Scanner;

import chap10.김민보.hw1.model.vo.Employee;
import chap10.김민보.hw1.model.vo.Student;

public class Run {

	
	//근데 이거 ..배열로 많이 쓰나요?
	//거의 어레이리스트 써서 어레이리스트 더 많이 공부해야될거같은데
	//배열 정말 기억 잘 안나고 헷갈려요 ㅠ_ㅠ
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Student[] students = new Student[3];
		
		students[0] = new Student("손현우", 20, 178.2, 70, 1, "정보시스템공학과");		
		students[1] = new Student("유기현", 21, 187.3, 80, 2, "경영학과");
		students[2] = new Student("이민혁", 23, 167.0, 45, 4, "정보통신공학과");
		
		//향상된 for문으로 모든 입력된 학생 정보 출력하기
		for(Student s : students)
		System.out.println(s.information());
		
		
		
		Employee[] emps = new Employee[10];		
		
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
		
			
			// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
			// 한 명씩 추가 될 때마다 카운트함			
			// 여기서 반복문쓰니까 마지막에 입력한게 10번 다 들어가서 반복문 지움;;			
			// 카운트하는 변수 여기다 선언하면 계속 0으로 초기화됨 0번 인덱스에만 값 넣고싶은게 아니라면 꼭 while반복문 밖에다가 할것!
			
			if(count<emps.length) {
			emps[count] = new Employee(name, age, height, weight, salary, dept); 
			count++;
			}
			
			
			else if(count >= emps.length) {
				System.out.println("입력가능인원(10명)이 초과되었습니다.");
				break;
			}
			
			
			System.out.println("계속 추가 하시겠습니까? (y or n 입력) ");
			String yesno = sc.nextLine();
			
			if(yesno.equals("y") || yesno.equals("Y")) {
				continue;
			}
			
			else if(yesno.equals("n")|| yesno.equals("N")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("프로그램을 종료합니다.");
				break;//다른문자 입력하면 그냥 끝나게 
			}		
			
		}
		
		//배열에 담긴 정보 모두 출력..
		
		for(int i = 0; i<count; i++)
			System.out.println(emps[i].information());
		
	}
	

}
