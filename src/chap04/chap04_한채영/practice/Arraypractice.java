package chap04.chap04_한채영.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Arraypractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		/*
		 * 길이가 10 인 정수형 배열을 만들고 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 그 값을 다음과 같이 출력하세요
		 */

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}

	}

	public void practice2() {

		// 길이가 10 인 정수형 배열을 만들고 반복문을 이용하여 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요

		int arr[] = new int[10];

		for (int i = 9; i >= 0; i--) {

			arr[i] = i + 1;
			System.out.print(arr[i] + " ");

		}

	}

	public void practice3() {

		/*
		 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 1 부터 입력 받은 값까지 배열에 초기화한 후 출력하세요
		 */

		System.out.println("양의 정수: ");
		int num = sc.nextInt();

		int arr[] = new int[num];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}

	}

	public void practice4() {

		/*
		 * 길이가 5 인 String 배열을 선언하고 사과 ”, 귤 “, 포도 “, 복숭아 ”, 참외 로 초기화 한 후 배열 인덱스를 활용해서 귤을
		 * 출력하세요
		 */

		String arr[] = { "사과", "귤", "포도", "복숭아", "참외" };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].equals("귤")) {
				System.out.println(arr[i]);
			}
		}

	}

	public void practice5() {

		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지 인덱스를
		 * 출력하세요
		 */

		System.out.println("문자열: ");
		String str = sc.nextLine();

		char arr[] = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {

			arr[i] = str.charAt(i); // 문자열을 배열에 넣어주는 작업

		}

		System.out.println("문자: ");
		char ch = sc.nextLine().charAt(0);
		int count = 0;

		System.out.print(str + "에 " + ch + "가 존재하는 위치: ");
		for (int i = 0; i < arr.length; i++) {

			if (ch == arr[i]) {
				count++;
				System.out.print(i + " ");
			}

		}
		System.out.println();
		System.out.println(ch + "의 개수: " + count);

	}

	public void practice6() {

		/*
		 * “ 월 “ ~ 일 ” 요일 까지 초기화된 문자열 배열을 만들고 0 부터 6 까지 숫자를 입력 받아 입력한 숫자와 같은 인덱스에 있는 요일을
		 * 출력하고 범위에 없는 숫자를 입력 시 잘못 입력하셨습니다 를 출력하세요 ex.
		 */

		String arr[] = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };

		System.out.println("0~6사이 숫자 입력: ");
		int num = sc.nextInt();

		if (num > 6) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println(arr[num]);
		}

	}

	public void practice7() {

		/*
		 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의
		 * 인덱스에 값을 초기화 하세요 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요
		 */

		System.out.println("정수: ");
		int num = sc.nextInt();

		int arr[] = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("배열 " + i + "번째 인덱스에 넣을 값: ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

		System.out.println();

		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println("총합: " + total);
	}

	public void practice8() {

		/*
		 * 3 이상인 홀수 정수를 입력 받아 배열의 중간까지는 1 부터 1 씩 증가하여 오름차순으로 값을 넣고 중간 이후부터 끝까지는 1 씩 감소하여
		 * 내림차순으로 값을 넣어 출력하세요 단 , 입력한 정수가 홀수가 아니거나 3 미만일 경우 다시 입력하세요 를 출력하고 다시 정수를 받도록
		 * 하세요
		 */

		while (true) {

			System.out.println("3이상인 홀수 정수를 입력하세요: ");
			int num = sc.nextInt();

			if (num % 2 == 0 || num < 3) {
				System.out.println("다시 입력하세요.");
				continue;
			} else {

				int arr[] = new int[num];

				// arr.length/2 + 1 = 3

				for (int i = 0; i < arr.length / 2 + 1; i++) {

					arr[i] = i + 1;
					System.out.print(arr[i] + " ");
				}

				for (int i = arr.length / 2 + 1; i > 1; i--) {

					arr[i] = i - 1;
					System.out.print(arr[i] + " ");
				}

				break;

			}

		}

	}

	public void practice9() { // 값이 중복돼서 나와서 가이드 확인..

		/*
		 * 사용자가 입력한 값이 배열에 있는지 검색하여 있으면 “OOO 치킨 배달 가능 “, 없으면 “OOO 치킨은 없는 메뉴입니다 를 출력하세요 단
		 * , 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요
		 */

		String arr[] = { "후라이드", "양념", "알마치", "허니콤보" };

		System.out.println("치킨 이름을 입력하세요: ");
		String chicken = sc.nextLine();

		boolean b = false; // 동일한 메뉴가 있는지 없는지 논리값을 만들어주는 변수

		for (int i = 0; i < arr.length; i++) {

			if (chicken.equals(arr[i])) {

				b = true; // 동일한 값을 찾아내면 b를 트루로 만들고 더 볼 필요가 없기 때문에 break 걸어서 for 문 나가기
				break;

			}
		}

		if (b) { // b가 true 즉 입력한 치킨이 메뉴에 있는 경우
			System.out.println(chicken + "치킨 배달 가능");
		} else {// b가 false 즉 입력한 치킨이 메뉴에 없는 경우
			System.out.println(chicken + "치킨은 없는 메뉴입니다.");

		}
	}

	public void practice10() {

		/*
		 * 10 개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요
		 */

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 10 + 1);

			System.out.print(arr[i] + " ");
		}

	}

	public void practice11() {

		/*
		 * 10 개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜 배열에 초기화 후 배열 전체 값과 그 값
		 * 중에서 최대값과 최소값을 출력하세요
		 */

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 10 + 1);

			System.out.print(arr[i] + " ");
		}

		System.out.println();

		int copy[] = arr.clone();

		Arrays.sort(copy);// 오름차순 정렬
		for (int i = 0; i < arr.length; i++) {

			System.out.print(copy[i] + " ");
		}

		System.out.println();
		System.out.println("최대값: " + copy[copy.length - 1]);
		System.out.println("최소값: " + copy[0]);
	}

	public void practice12() {

		/*
		 * 10 개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후
		 * 출력하세요
		 */

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}

		}

		// System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void practice13() {

		/*
		 * 주민등록번호를 String 문자열로 입력 받고 입력 받은 그 문자열을 각 인덱스 별 문자를 char 에 옮겨 담기 단 , 성별 자리
		 * 이후부터는 *로 담기
		 */

		System.out.println("주민등록번호(-포함): ");
		String no = sc.nextLine();

		char arr[] = new char[14];

		for (int i = 0; i < 8; i++) {
			arr[i] = no.charAt(i);
			System.out.print(arr[i]);
		}

		for (int i = 8; i < arr.length; i++) {
			arr[i] = '*';
			System.out.print(arr[i]);
		}
	}

	public void practice14() {

		/*
		 * 로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요
		 */
		
		int lotto[] = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			
			lotto[i] = (int) (Math.random() * 45 + 1);
			
			for(int j = 0; j < i ; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			
		}
		Arrays.sort(lotto);
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

	}
}
