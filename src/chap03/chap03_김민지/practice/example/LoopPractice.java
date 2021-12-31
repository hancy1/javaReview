package chap03.chap03_김민지.practice.example;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if(num>=1) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void practice2(){
		while(true) {
			System.out.println("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if(num>=1) {
				for(int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}

	}

	public void practice3(){
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if(num>=1) {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}


	public void practice4(){
		while(true) {
			System.out.println("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if(num>=1) {
				for(int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void practice5(){
		System.out.println("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i; // 모든 숫자의 합.
			if(i<num) {
				System.out.print(i + " + "); // num 보다 작을때까지 적고 + 적고
			}else {
				System.out.print(i + " = "); // num 과 같으면 = 적고
			}
		}
		System.out.println(sum); // 합
	}

	public void practice6(){
		System.out.println("첫 번쨰 숫자 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if(num1 >= 1 && num2 >= 1) { // 숫자 모두 1 이상이어야 함
			if(num1>num2) { // num1이 더 클 때 num2부터 num 1까지
				for(int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			}else { // num2이 더 클 때 num1부터 num2까지
				for(int i = num1; i <= num2; i++) { 
					System.out.print(i + " ");
				}
			}
		}else { // 두 숫자 중 하나나 둘다 1보다 작을때
			System.out.println("1이상의 숫자만을 입력해주세요.");
		}
	}

	public void practice7(){
		while(true) {
			System.out.println("첫 번쨰 숫자 : ");
			int num1 = sc.nextInt();
			System.out.println("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			if(num1 >= 1 && num2 >= 1) { // 숫자 모두 1 이상이어야 함
				if(num1>num2) { // num1이 더 클 때 num2부터 num 1까지
					for(int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					}
				}else { // num2이 더 클 때 num1부터 num2까지
					for(int i = num1; i <= num2; i++) { 
						System.out.print(i + " ");
					}
				}break;
			}else { // 두 숫자 중 하나나 둘다 1보다 작을때
				System.out.println("1이상의 숫자만을 입력해주세요.");
			}
		}
	}

	public void practice8(){
		System.out.println("숫자 : ");
		int num = sc.nextInt();

		System.out.println("===== "+ num + "단 =====");
		for(int i = 1; i <= 9; i++) {
			int result = 4*i; //4*?의 결과
			System.out.println("4 * " + i + " = " + result);
		}
	}

	public void practice9(){

		System.out.println("숫자 : ");
		int num = sc.nextInt();

		if(num>=2 && num <=9) {
			for(int i = 2; i <= num; i++) {
				System.out.println("===== "+ i + "단 =====");
				for(int j = 1; j <= 9; j++) {
					int result = i*j; 
					System.out.println( i + " * " + j + " = " + result);
				}
			}

		}else {
			System.out.println("2~9사이의 숫자만 입력해주세요.");
		}
	}

	public void practice10(){
		while(true) {
			System.out.println("숫자 : ");
			int num = sc.nextInt();

			if(num>=2 && num <=9) {
				for(int i = 2; i <= num; i++) {
					System.out.println("===== "+ i + "단 =====");
					for(int j = 1; j <= 9; j++) {
						int result = i*j; 
						System.out.println( i + " * " + j + " = " + result);
					}
				}
				break;
			}else {
				System.out.println("2~9사이의 숫자만 입력해주세요.");
			}
		}
	}

	public void practice11(){
		System.out.println("시작 숫자 : ");
		int num = sc.nextInt();

		System.out.println("공차 : ");
		int a = sc.nextInt();

		for(int i = 1; i <= 10; i++) { // 글자가 10개 나와야 하니까 1~10까지 반복
			System.out.print(num + " "); // 시작숫자가 먼저 나오고 공백
			num += a; // 시작 숫자에 공차를 계속 더해줌			
		}
	}

	public void practice12(){
		while(true) {
			System.out.println("연산자(+, -, *, /, %) : ");
			String str = sc.nextLine();

			if(str.equals("exit")) { // 연산자 입력에서 exit 입력할 경우 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				return;
			} else { // exit 입력이 아닐 시에!

				System.out.println("정수1 : ");
				int num1 = sc.nextInt();

				System.out.println("정수2 : ");
				int num2 = sc.nextInt();
				sc.nextLine(); // 반복될 시 다음에 string이 오기 때문에 버퍼 빼주기!

				int result = 0; // 연산결과 초기화 선언.

				switch(str) {
				case "+" : result = num1 + num2; break;
				case "-" : result = num1 - num2; break;
				case "*" : result = num1 * num2; break;
				case "/" : if(num2 == 0) { // num2가 0이면 다시 입력받기
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				} else {
					result = num1 / num2;
				}break;
				case "%" : result = num1 % num2; break;
				default : System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
				}
				System.out.println(num1 + " " +  str + " " +  num2 + " = " + result);
			}
		}
	}

	public void practice15(){
		/*사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		(for문 이용)
		 * ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
		ex) 2, 3, 5, 7, 11 …*/

		System.out.println("숫자 : ");
		int num = sc.nextInt();

		int count = 0; //나눈 횟수를 count로 초기화 선언

		if(num<2) { // 숫자가 2보다 작으면 잘못입력하셨습니다.
			System.out.println("잘못 입력하셨습니다.");
			return; // 종료
		}

		for(int i = 2; i <= num; i++) { // 2 ~ num 까지의 숫자로 num을 나눈다. num이 2보다 큰 걸 받으므로 무조건 1로 나누어지기때문에 따로 조건x
			if(num % i == 0) { // 나머지가 0 인 횟수를 count++ 해줌
				count++;
			}			
		}
		if(count == 1) { // count 가 1이면 자기 자신으로만 나눠진 것
			System.out.println("소수입니다.");
		}else { // count가 1이상이면 다른 숫자로도 나눠진 것
			System.out.println("소수가 아닙니다.");
		}

	}

	public void practice16 (){
		while(true) {
			System.out.println("숫자 : ");
			int num = sc.nextInt();

			int count = 0; //나눈 횟수를 count로 초기화 선언

			if(num<2) { // 숫자가 2보다 작으면 잘못입력하셨습니다.
				System.out.println("잘못 입력하셨습니다.");
				continue; // 다시 입력받기
			}

			for(int i = 2; i <= num; i++) { // 2 ~ num 까지의 숫자로 num을 나눈다. num이 2보다 큰 걸 받으므로 무조건 1로 나누어지기때문에 따로 조건x
				if(num % i == 0) { // 나머지가 0 인 횟수를 count++ 해줌
					count++;
				}			
			}
			if(count == 1) { // count 가 1이면 자기 자신으로만 나눠진 것
				System.out.println("소수입니다.");
			}else { // count가 1이상이면 다른 숫자로도 나눠진 것
				System.out.println("소수가 아닙니다.");
			} break; // 무한루프 멈추기
		}
	}

	public void practice17(){
		System.out.println("숫자 : ");
		int num = sc.nextInt();

		if(num<2) { // 2보다 작으면 안됨
			System.out.println("잘못 입력하셨습니다.");
		}


		int n = 0; // 소수의 갯수

		for(int i = 2; i <= num; i++) { // 2~num 까지 나눌것			
			int count = 0; // count 초기화 선언 for문 안에서 count를 사용하기 때문에!
			for(int j = 1; j <= i; j++) { // 1~num까지로 i를 나눌 것!
				if(i % j == 0) {
					count++; // i % j 를 나눈 횟수
				}

			}
			if(count == 2) { // 나눈 숫자가 1과 자기자신이어야 하니까 count는 2번이 되어야함.
				System.out.print( i + " ");
				n++; // 소수의 갯수
			}

		}
		System.out.println();
		System.out.println("2부터 " + num + "까지 소수의 개수는 " + n + "개입니다.");
	}

	public void practice18(){
		System.out.println("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();

		int count = 0;

		for(int i = 2; i <= num; i++) { // 2~num까지 출력해야하니까
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				if(i%2 == 0 && i%3 == 0) {
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("count : " + count);
	}

	public void practice19(){
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for(int i = 1; i <= num; i++) { // num 행 만들기

			for(int j = num; j >= i; j--) { // 공백넣기 줄어들어야하니까 --
				System.out.print(" ");
			}
			for(int k = 1; k<= i; k++) { // 별넣기 늘어가야하니까 ++
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void practice20(){
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = num-1; i >= 1; i--) { // 시작숫자를 num보다 하나 작게
			for(int j = i; j >= 1; j--) { // 숫자 줄어들게
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice21(){
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for(int i = 1; i <= num; i++) { // 행표시
			for(int j = num; j >= i; j--) { // 공백넣어주기
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for(int h = 2; h <=i; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	public void practice22(){
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for(int i = 1; i <= num; i++) { // i 는 num 만큼의 행
			for(int j = 1; j <= num; j++) { // j 는 열
				if(i == 1 || i == num) { // 첫째행 마지막행에는 * 다 찍고
					System.out.print("*");
				}else { // 첫째,마지막 행 제외
					if(j == 1 || j == num) { // j 가 열이므로 1열과 마지막 열에만 *
						System.out.print("*");
					}else {
						System.out.print(" "); // 나머지 열에는 공백
					}
				}
			}
			System.out.println();
		}
	}

	public void practice23() {
		for(int i = 1; i <= 5; i++) { // 5행
			for(int j = 5; j >= i; j--) { // 공백
				System.out.print(" ");
			}
			for(int j = 1; j <= i*2-1; j++) { // 홀수갯수로 숫자
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i = 4; i >= 1; i--) { // 숫자가 점점 줄어들어야하므로 --
			for(int j = 5; j >= i; j--) { // 공백넣기
				System.out.print(" ");
			}
			for(int j = 1; j <= i*2-1; j++) { // 홀수만 넣기
				System.out.print(j);
			}
			System.out.println();
		}

	}

	public void practice24() { // 어려움!!!!!!!!!!!!
		/*for(int i = 1; i <= 3; i++) { // 3행
			for(int j = 3; j >= i; j--) {
				System.out.print(" "); // 공백
			}
			for(int j = 1; j <= i*2-1; j++) {
				if(j == 1 || j == ) {
					System.out.print("*");
				}

			}
			System.out.println();
		}*/

		for(int i=-2; i<=2; i++) {		// -2 ~ 2 까지 반복 (5번 반복)

			int k = i < 0 ? -i : i;		// k 변수에 i 절대값 대입

			for(int j=k; j>0; j--) {	// 공백을 출력하는 반복문
				System.out.print(" ");
			}

			for(int j=1; j<=5-2*k; j++) { // 별을 출력하는 반복문

				if(j==1 || j==5-2*k) {		// 첫번째 열과 마지막 열에만 별 찍히고
					System.out.print("*");
				}else {						// 나머지는 별 찍히게
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void practice25() {
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j <= 10; j++) {
				if(i == 1 || i == 5) {
					System.out.print("*");
				}else {
					if(j == 1 || j == 10) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}

