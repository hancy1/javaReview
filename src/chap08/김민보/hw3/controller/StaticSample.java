package chap08.김민보.hw3.controller;

public class StaticSample {
	
	private static String value;

	
	public static String getValue() {
		return value;
	}

	
	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	
	//!모든 메소드는 출력문 없이 value에 접근해서 출력해야됨!
	
	public static void toUpper() {
		
		value = value.toUpperCase();	
		
	}

	public static void setChar(int index, char c) {
		// 전달받은 인덱스 위치의 value 값을 전달받은 문자로 변경하는 static 메소드
						
		char[] arr = value.toCharArray();		
		arr[index] = c;
		
		value = String.valueOf(arr);
		
	}
	
	public static int valueLength() {
		// value 필드 값에 기록되어 있는 문자 갯수 리턴
		int count = 0; //리턴할값 초기화
		
		count = value.length();		
		
		return count;
	}
	
	public static String valueConcat(String str) {
		// 문자열 값을 전달받아 value 필드 값과 하나로 합쳐서 리턴
		
		
		String sumStr = " "; //리턴할 값 초기화
		
		sumStr = value + str;
		value = sumStr;
		
		return sumStr;
		
		
	}

	
}
