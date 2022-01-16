package chap09.김민보.hw2.run;

import java.util.Scanner;

import chap09.김민보.hw2.model.vo.Student;

public class Run {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] students = new Student[10];
		
		//처음에 객체 초기화 안해주면  아래서 10명 다 입력할때는 괜찮으나, 더적은 학생수를 입력하면 null오류가 계속 뜨므로 초기화 해주고 시작함
		for(int i = 0; i<students.length; i++) {
			students[i] = new Student();
		}	
		
		
		Scanner sc = new Scanner(System.in);
		
		//int 타입 변수 count에다가 학생수 기록함
		int count = 0;
		
		while(true){
			
			if (count < students.length) {
				
				System.out.println("학년 : ");
				int grade = sc.nextInt();
				
				System.out.println("반 : ");
				int classroom = sc.nextInt();
				
				sc.nextLine();
				System.out.println("이름 : ");
				String name = sc.nextLine();
				
				System.out.println("국어점수 : ");
				int kor = sc.nextInt();			
				
				System.out.println("영어점수 : ");
				int eng = sc.nextInt();	
				
				System.out.println("수학점수 : ");
				int math = sc.nextInt();	
				
				students[count++] = new Student(grade, classroom, name, kor, eng, math);
				
				sc.nextLine();
				System.out.println("계속 추가 하시겠습니까? 종료 시 : n");
				String exit = sc.nextLine();				
				if(exit.equals("n")){					
					System.out.println("종료합니다.");
					
					break;
					
				}else {//종료키워드 "n" 말고 다른모든말들은 계속 진행한다.
					continue;
				}
				
			}//학생수 10명 초과했을 때
			else if(count > students.length) {
				System.out.println("최대 10명까지만 입력가능합니다.");
				break;			
			}	
			
		}
		
		// 배열이 담겨있는 학생들의 정보 모두 출력
		
		for(int i = 0; i<students.length; i++) {
			// 값이 기본값으로 들어있는 "0"학년 객체는 전부 출력하지 않고 다른 숫자가 입력되어있는 객체의 값만 출력함
			if(students[i].getGrade()!=0) {
				System.out.println(students[i].information());
			}			
		}	
	}

}
