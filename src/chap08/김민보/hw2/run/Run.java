package chap08.김민보.hw2.run;

import chap08.김민보.hw2.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		NonStaticSample non = new NonStaticSample();

		int[] arr = non.intArrayAllocation(5);
		
		System.out.print("크기가 5인 배열의 랜덤 값 : ");
		non.display(arr);
		
		System.out.println();
		
		
		System.out.print("내림 차순 출력 : ");
		non.sortDescending(arr);
		
		System.out.println();
		
		System.out.print("오름 차순 출력 : ");
		non.sortAscending(arr);
		
		System.out.println();
		
		System.out.print("apple 문자열 중에 p의 갯수 : ");
		String apple = "apple";
		char p = 'p';	
		
		System.out.println(non.countChar(apple, p));
		
		
		System.out.print("13과 7사이 정수들의 합계 : ");	
		System.out.println(non.totalValue(13, 7));
		
		
		System.out.print("programming 문자열의 3번 인덱스 문자: ");	
		System.out.println(non.pCharAt("programming", 3));
		
		System.out.print("JAVA와 programming을 합친 문자열 : ");	
		System.out.println(non.pConcat("JAVA", "programming"));
		
		
	
	}

}
