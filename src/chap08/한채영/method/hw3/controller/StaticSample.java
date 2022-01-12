package chap08.한채영.method.hw3.controller;

public class StaticSample {

	private static String value;

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}

	public static void toUpper() {
		
		value = value.toUpperCase();

	}

	public static int valueLength() {
		
		return value.length();
		
	}
	
	public static String valueConcat(String str) {
		
		return value.concat(str);
		
	}
	
public static void setChar(int index, char c) {
		
	String val = value.replace(value.charAt(index), c);
	value = val;
	
	}
}
