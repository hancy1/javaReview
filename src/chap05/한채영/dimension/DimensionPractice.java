package chap05.한채영.dimension;

import java.util.Scanner;

public class DimensionPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		/*
		 * 4행4열짜리정수형배열을선언및할당하고 1) 1 ~ 16까지값을차례대로저장하세요. 2) 저장된값들을차례대로출력하세요.
		 */

		int num[][] = new int[4][4];
		int n = 1;

		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num.length; j++) {

				num[i][j] = n;
				n++;
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice2() {

		/*
		 * 4행4열짜리정수형배열을선언및할당하고 1) 16 ~ 1과같이값을거꾸로저장하세요. 2) 저장된값들을차례대로출력하세요.
		 */

		int arr[][] = new int[4][4];

		int num = 16;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				arr[i][j] = num;
				num--;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice3() {

		/*
		 * 3행3열짜리문자열배열을선언및할당하고 인덱스0행0열부터2행2열까지차례대로접근하여“(0, 0)”과같은형식으로저장후출력하세요.
		 */

		String arr[][] = new String[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				arr[i][j] = "(" + i + ", " + j + ")";
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice4() {

		/*
		 * 4행4열 2차원배열을 생성하여 0행0열부터 2행2열까지는 1~10까지의 임의의 정수값 저장 후 아래의 내용처럼 처리하세요.
		 */

		int arr[][] = new int[4][4];

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {

				arr[i][j] = (int) (Math.random() * 10 + 1);
				//System.out.print(arr[i][j] + " ");

				arr[3][3] += arr[i][j];
			}
			//System.out.println();
		}			

//		arr[0][3] = arr[0][0] + arr[0][1] + arr[0][2];
//		arr[1][3] = arr[1][0] + arr[1][1] + arr[1][2];
//		arr[2][3] = arr[2][0] + arr[2][1] + arr[2][2];

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length - 1; j++)
				arr[i][3] += arr[i][j];

			 //System.out.println(arr[i][3]);
		}

//		arr[3][0] = arr[0][0] + arr[1][0] + arr[2][0];
//		arr[3][1] = arr[0][1] + arr[1][1] + arr[2][1];
//		arr[3][2] = arr[0][2] + arr[1][2] + arr[2][2];

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				arr[3][i] += arr[j][i];
			}
			//System.out.print(arr[arr.length-1][i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "    ");
			}
			System.out.println();
		}

	}

	public void practice5() {

		/*
		 * 2차원배열의행과열의크기를사용자에게직접입력받되,1~10사이숫자가아니면 “반드시1~10 사이의정수를입력해야합니다.” 출력후다시정수를받게하세요.
		 * 크기가정해진이차원배열안에는영어대문자가랜덤으로들어가게한뒤출력하세요. (char형은숫자를더해서문자를표현할수있고65는A를나타내고90은Z를나타냄)
		 */

		while (true) {
			System.out.println("1~10 사이의 정수를 입력하세요.");
			System.out.println("행 크기: ");
			int num1 = sc.nextInt();
			System.out.println("열 크기: ");
			int num2 = sc.nextInt();

			if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			} else {

				char arr[][] = new char[num1][num2];

				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr.length; j++) {

						arr[i][j] = (char) (Math.random() * 25 + 65);

						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
				break;
			}

		}
	}

	public void practice6() {

		String[][] arr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[j][i] + " ");

			}
		}
	}

	public void practice7() {

		/*
		 * 사용자에게 행의 크기를 입력받고 그 수만큼의 반복을 통해 각각 해당 행의 크기 도받아 문자형 가변배열을 선언 및 할당하세요. 그리고 각
		 * 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		 */

		System.out.println("행의 크기: ");
		int num = sc.nextInt();

		char arr[][] = new char[num][];

		for (int i = 0; i < num; i++) {
			System.out.println(i + "행의 크기 : ");
			int num2 = sc.nextInt();

			arr[i] = new char[num2];
		}

		char ch = 'a';

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = ch;
				ch++;

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice8() {

		/*
		 * 1차원배열에 12명의 학생들을 출석부 순으로 초기화하고 3행2열로 2차원배열 2개를 이용하여 분단을 나눠서 저장. 1분단 왼쪽부터 오른쪽,
		 * 1행에서 아래행 순으로 자리를 배치하세요. <출석부> 1. 강건강2. 남나나3. 도대담4. 류라라5. 문미미6. 박보배 7. 송성실8.
		 * 윤예의9. 진재주10. 차천축11. 피풍표12. 홍하하
		 */

		System.out.println("== 1분단 ==");
		String arr1[][] = { { "강건강", "남나나" }, { "도대담", "류라라" }, { "문미미", "박보배" } };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		String arr2[][] = { { "송성실", "윤예의" }, { "진재주", "차천축" }, { "피풍표", "홍하하" } };

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice9() {

		System.out.println("== 1분단 ==");
		String arr1[][] = { { "강건강", "남나나" }, { "도대담", "류라라" }, { "문미미", "박보배" } };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		String arr2[][] = { { "송성실", "윤예의" }, { "진재주", "차천축" }, { "피풍표", "홍하하" } };

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("=========================================");

		System.out.println("검색할 학생 이름을 입력하세요: ");
		String name = sc.nextLine();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {

				if (name.equals(arr1[i][j])) {
					System.out.println(
							"검색하신 " + name + " 학생은 1분단 " + (i + 1) + "번째 줄 " + (j == 0 ? "왼쪽" : "오른쪽") + "에 있습니다.");
				}
			}
		}
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {

				if (name.equals(arr2[i][j])) {
					System.out.println(
							"검색하신 " + name + " 학생은 2분단 " + (i + 1) + "번째 줄 " + (j == 0 ? "왼쪽" : "오른쪽") + "에 있습니다.");
				}
			}
		}

	}
}
