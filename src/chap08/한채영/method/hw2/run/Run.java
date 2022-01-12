package chap08.한채영.method.hw2.run;

import chap08.한채영.method.hw2.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticSample a = new NonStaticSample();

		int arr[] = a.intArrayAllocation(5);

		a.display(arr);

		a.swap(arr, 1, 2);

		a.sortDescending(arr);

		a.sortAscending(arr);

		System.out.println("apple 문자열에 p의 개수: " + a.countChar("apple", 'p'));

		System.out.println("13과 7사이 정수들의 합계: " + a.totalValue(13, 7));

		System.out.println("programming문자열의 3번 인덱스 문자: " + a.pCharAt("programming", 3));

		System.out.println("JAVA와 programming을 합친 문자열: " + a.pConcat("JAVA", "programming"));

	}

}
