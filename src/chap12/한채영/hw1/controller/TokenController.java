package chap12.한채영.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {

	public String afterToken(String str) {

		StringTokenizer st = new StringTokenizer(str, " ");
		String s = "";

		while (st.hasMoreTokens()) {
			s += st.nextToken();
		}

		return s;
	}

//매개변수로 받은 문자열의 첫 번째 글자를 대문자로 바꾼 문자열 반환
	public String firstCap(String input) {

		String str = input.replace(input.charAt(0), input.toUpperCase().charAt(0));

		return str;
	}

//매개변수로 받은 문자열 중에서 매개변수로 들어온 문자가 몇 개 존재하는지 개수를 반환
	public int findChar(String input, char one) {

		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == one)
				count++;

		}
		return count;
	}

}
