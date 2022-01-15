package chap09.chap09_김민지.hw2.run;

import java.util.Scanner;

import chap09.chap09_김민지.hw2.model.vo.Student;

public class Run {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		Student [] stu = new Student[10];  // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
		
		int count = 0; // 학생 수를 나타내는 변수 -> 한 명 추가 시 1씩 증가시켜줄꺼임
		
		
		while(true) {
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
			sc.nextLine();
			
			stu[count++] = new Student (grade, classroom, name, kor, eng, math); // 한 명씩 추가 되었기 때문에 count 1증가
			
			System.out.println("계속 추가하시겠습니까? (y/n)");
			String a = sc.nextLine().toUpperCase();
			
			if(a.charAt(0) == 'Y') { // 계속 추가할 것인지 물어보고, ‘n’ 입력 시 반복문 빠져나감
				continue;
			} else {
				break;
			}
		}

		
				
		int sum = 0; // 학생들의 점수 합계
		
		for(int i = 0; i < count; i++) {
			
			sum = stu[i].getKor() + stu[i].getEng() + stu[i].getMath();
			
			System.out.println(stu[i].information() + ", 평균 : " + sum/3 );
		}
		
		
	}

}
