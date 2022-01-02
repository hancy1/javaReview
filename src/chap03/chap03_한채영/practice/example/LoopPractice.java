package chap03.chap03_한채영.practice.example;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		/*
		 * 메소드 명 : public void 사용자로부터 한 개의 값을 입력 받아 1 부터 그 숫자까지의 숫자들을 모두 출력하세요 단 , 입력한
		 * 수는 1 보다 크거나 같아야 합니다 만일 1 미만의 숫자가 입력됐다면 잘못 입력하셨습니다 를 출력하세요
		 */
		System.out.println("1이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice2() {

		/*
		 * practice1() 문제와 동일하나 , 1 미만의 숫자가 입력됐다면 “ 잘못 입력하셨습니다 . 다시 입력해주세요 가 출력되면서 다시
		 * 사용자가 값을 입력하도록 하세요
		 */

		System.out.println("1이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			practice2();
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}

	}

	public void practice3() {

		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1 부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요 단 , 입력한 수는 1 보다 크거나 같아야
		 * 합니다
		 */

		System.out.println("1이상의 숫자를 입력하세요: ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}

	}

	public void practice4() {

		/*
		 * practice3() 문제와 동일하나 , 1 미만의 숫자가 입력됐다면 “ 잘못 입력하셨습니다 . 다시 입력해주세요 가 출력되면서 다시
		 * 사용자가 값을 입력하도록 하세요
		 */

		for (;;) {

			System.out.println("1이상의 숫자를 입력하세요: ");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			} else {
				for (int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			}
		}

	}

	public void practice5() {

		// 1부터 사용자에게 입력받은 수까지의 정수들의 합을 출력하세요

		System.out.println("정수를 하나 입력하세요: ");
		int num = sc.nextInt();

		int total = 0;

		for (int i = 1; i <= num; i++) {

			System.out.print(i);
			total += i;

			if (i == num) {
				System.out.print(" = " + total);
				continue;
			}

			System.out.print(" + ");
		}

	}

	public void practice6() {

		/*
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요 만일 1 미만의 숫자가 입력됐다면 1 이상의 숫자만을 입력해주세요를
		 * 출력하세요
		 */

		System.out.println("첫 번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자: ");
		int num2 = sc.nextInt();

		if (num1 * num2 == 0) {
			System.out.println("1이상의 숫자만을 입력해주세요.");
		} else if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		}

	}

	public void practice7() {

		/*
		 * 위 문제와 모든 것이 동일하나 , 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요 가 출력되면서 다시 사용자가 값을 입력하도록
		 * 하세요
		 */
		while (true) {
			System.out.println("첫 번째 숫자: ");
			int num1 = sc.nextInt();
			System.out.println("두 번째 숫자: ");
			int num2 = sc.nextInt();

			if (num1 * num2 == 0) {
				System.out.println("1이상의 숫자만을 입력해주세요.");
				continue;

			} else if (num1 < num2) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			} else {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			}
			break;
		}
	}

	public void practice8() {

		// 사용자로부터 입력 받은 숫자의 단을 출력하세요

		System.out.println("숫자: ");
		int num = sc.nextInt();

		System.out.println("==== " + num + "단 ====");
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

	public void practice9() { // 어려웠던 문제

		/*
		 * 사용자로부터 입력 받은 숫자의 단부터 9 단까지 출력하세요 단 , 2 ~9 사이의 숫자가 아닌 경우 “2~9 사이의 숫자만 입력해주세요를
		 * 출력하세요
		 */

		System.out.println("숫자: ");
		int num = sc.nextInt();

		if (num < 2 || num > 9) {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		} else {

			while (true) {

				if (num == 10) {
					break;
				} else {
					System.out.println("==== " + num + "단 ====");
					for (int i = 1; i <= 9; i++) {
						System.out.println(num + " * " + i + " = " + num * i);
					}
					num++;
				}

			}
		}
	}

	public void practice10() {

		/*
		 * Practice9() 문제와 동일하나 , 2~9 사이의 숫자가 아닌 값이 입력됐다면 “2~9 사이의 숫자를 입력해주세요 가 출력되면서 다시
		 * 사용자가 값을 입력하도록 하세요
		 */
		while (true) {
			System.out.println("숫자: ");
			int num = sc.nextInt();

			if (num < 2 || num > 9) {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
				continue;
			} else {

				while (true) {

					if (num == 10) {
						break;
					} else {
						System.out.println("==== " + num + "단 ====");
						for (int i = 1; i <= 9; i++) {
							System.out.println(num + " * " + i + " = " + num * i);
						}
						num++;
					}

				}
				break;
			}
		}
	}

	public void practice11() {

		/*
		 * 사용자로부터 시작 숫자와 공차를 입력 받아 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요. 단, 출력되는 숫자는 총
		 * 10개입니다.
		 */

		System.out.println("시작숫자: ");
		int start = sc.nextInt();
		System.out.println("공차: ");
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.print(start + " ");
			start += num;
			// start -= num;
		}

	}

	public void practice12() {

		/*
		 * 정수 두 개와 연산자(문자열로 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요. 단, 해당 프로그램은 연산자 입력에
		 * “exit”라는 값이 들어올 때까지 무한 반복하며 exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다. 또한 연산자가
		 * 나누기이면서 두 번째 정수가 0으로 들어오면 “0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며, 없는 연산자가 들어올 시 “없는
		 * 연산자입니다. 다시 입력해주세요.”라고 출력하고 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요
		 */

		while (true) {

			System.out.println("연산자(+, -, *, /, %) : ");
			String str = sc.nextLine();

			if (str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}

			System.out.println("정수1: ");
			int num1 = sc.nextInt();

			System.out.println("정수2: ");
			int num2 = sc.nextInt();
			sc.nextLine(); // 버퍼빼기

			if (str.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			} else {
				switch (str) {

				case "+":
					System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
					break;

				case "-":
					System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
					break;

				case "*":
					System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
					break;

				case "/":
					System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
					break;

				case "%":
					System.out.println(num1 + " % " + num2 + " = " + num1 % num2);
					break;

				default:
					System.out.println("없는 연산자입니다. 다시 입력하세요");
					break;

				}

			}
		}
	}

	public void practice15() { // 못 풀어서 가이드 참고함
		/*
		 * 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요. 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를
		 * 출력하세요.
		 */

		System.out.println("숫자: ");
		int num = sc.nextInt();

		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			for (int i = 2; i < num; i++) { // 소수는 1과 자신을 나눴을 때만 나머지가 0이 되므로 2부터 num-1까지의 숫자를 나눠 0이 된다면 소수가 아닌 것을 알 수
				// 있다.
				if (num % i == 0) {
					System.out.println("소수가 아닙니다.");
					break;
				} else {
					System.out.println("소수입니다.");
					break;
				}
			}
		}

	}

	public void practice16() {

		/*
		 * 위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
		 */

		while (true) {

			System.out.println("숫자: ");
			int num = sc.nextInt();

			if (num < 2) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
				continue;
			} else {
				for (int i = 2; i < num; i++) { // 소수는 1과 자신을 나눴을 때만 나머지가 0이 되므로 2부터 num-1까지의 숫자를 나눠 0이 된다면 소수가 아닌 것을 알
					// 수
					// 있다.
					if (num % i == 0) {
						System.out.println("소수가 아닙니다.");
						return;
					} else {
						System.out.println("소수입니다.");
						return;
					}
				}
			}

		}
	}

	public void practice17() { // 못 풀어서 가이드 참고함

		/*
		 * 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요. 단, 입력한 수가 2보다 작은 경우 “잘못
		 * 입력하셨습니다.”를 출력하세요.
		 */

		System.out.println("숫자: ");
		int num = sc.nextInt();

		int count = 0;
		boolean flag = true;

		if (num < 2) {
			System.out.println("잘못 입력하셨습니다,");
		} else {
			for (int i = 2; i <= num; i++) {
				for (int j = 2; j < i; j++) {

					if (i % j == 0) { // 소수일 때
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.print(i + " ");
					count++;
				}
				flag = true; // 다시 true로 초기화
			}

			System.out.println("\n" + "2부터 " + num + "까지 소수의 개수는 " + count + "개입니다.");

		}
	}

	public void practice18() {

		/*
		 * 1부터 사용자에게 입력 받은 수까지 중에서 1) 2와 3의 배수를 모두 출력하고 2) 2와 3의 공배수의 개수를 출력하세요.
		 */

		System.out.println("숫자: ");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= num; i++) {

			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}

			if (i % 2 == 0 && i % 3 == 0) {
				count++;
			}

		}

		System.out.println("\ncount : " + count);

	}

	public void practice19() {

		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= 1; j--) {

				if (i >= j) {
					System.out.print('*');
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public void practice20() {

		System.out.println("정수 입력: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

		for (int i = 1; i <= num - 1; i++) {
			for (int j = num - 1; j >= 1; j--) {
				if (i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void practice21() { // 못 풀어서 가이드참고함

		System.out.println("정수 입력: ");
		int user = sc.nextInt();

		int num = 1; // "*"출력할때 사용할 변수
		for (int i = user; i > 0; i--) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < num; k++) {
				System.out.print("*");
			}

			num += 2;
			System.out.println();

		}

	}

	public void practice22() {

		System.out.println("정수입력: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i == 1 || i == num) {
				for (int z = 1; z <= num; z++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 1; j <= num; j++) {
					if (j == 1 || j == num) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}

	public void practice23() {

		int num = 1;

		for (int i = 1; i <= 5; i++) {

			for (int k = 5; k > i; k--) {
				System.out.print(" ");

			}

			for (int j = 1; j <= num; j++) {
				System.out.print(j);
			}

			num += 2;
			System.out.println();

		}

		int num2 = 7;
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= num2; k++) {
				System.out.print(k);
			}

			num2 -= 2;
			System.out.println();
		}

	}

	public void practice24() {

		//이건 가이드봐도 모르겠음 ..ㅠㅠ
		
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

		for (int i = 1; i <= 5; i++) {

			if (i == 1 || i == 5) {
				System.out.println("**********");
			} else {
				for (int j = 1; j <= 10; j++) {
					if (j == 1 || j == 10) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
				System.out.println();
			}

		}

	}
}