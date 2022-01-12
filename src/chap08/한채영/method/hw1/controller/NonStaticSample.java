package chap08.한채영.method.hw1.controller;

import java.util.Arrays;

public class NonStaticSample {

	public void printLottoNumbers() {

		// 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
		// 응용 --> 오름차순 정렬로 출력

		int arr[] = new int[6];

		System.out.print("1. 랜덤 값: ");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public void outputChar(int num, char c) {
		// 매개변수로 전달받은 문자 c를 전달받은 num 갯수 만큼 출력하는 메소드

		System.out.print("2. " + c + "문자 " + num + "개 출력: ");
		for (int i = 1; i <= num; i++) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

	public char alphabette() {
		// 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
		// 주의! 소문자 대문자 모두 포함

		int num = (int) (Math.random() * 2);

		if (num == 0) {
			char ch = (char) (Math.random() * 26 + 65);
			System.out.println("3. 랜덤 영문자 출력: " + ch);
			return ch;
		} else {
			// 97 ~ 122 소문자
			char chh = (char) (Math.random() * 26 + 97);
			System.out.println("3. 랜덤 영문자 출력: " + chh);
			return chh;
		}

	}

	public String mySubstring(String str, int index1, int index2) {
		// 매개변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
		// 해당 인덱스 범위의 문자열을 추출하여 리턴
		// 단, 전달받은 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴
		
		String s = str.substring(index1, index2);
		if(s != null) {
			System.out.println("4. " + str + "의 " + index1 + "번 " + index2 + "번 인덱스 사이의 값 출력: " + s);
			return s;
		} else {
			return null;
		}
		
	}

}
