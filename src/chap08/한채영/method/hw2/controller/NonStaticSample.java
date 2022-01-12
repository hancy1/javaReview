package chap08.한채영.method.hw2.controller;

import java.util.Arrays;

public class NonStaticSample {

	public int[] intArrayAllocation(int length) {
		// 전달받은 정수 (length) 만큼 int 배열을 할당
		// 임의의 1부터 100까지의 값으로 값을 기록하고 배열 주소 리턴

		int arr[] = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}

		return arr;

	}

	public void display(int[] arr) {
		System.out.print("크기가 5인 배열의 랜덤값: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void swap(int[] arr, int idx1, int idx2) {

		int tmp = 0;
		tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;

		System.out.print("인덱스 바꾼 후 배열: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void sortDescending(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("내림차순 정렬: ");
		Arrays.toString(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public void sortAscending(int[] arr) {

		System.out.print("오름차순 정렬: ");
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public int countChar(String str, char c) {
		
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==c) {
				count++;
			}	
		}
		
		return count;
	}

	public int totalValue(int num1, int num2) {
		
		int sum = 0;
		
		if(num1 > num2) {
		for(int i = num2+1; i < num1; i++)
			sum += i;
		} else {
			for(int i = num1+1; i < num2; i++)
				sum += i;
		}
		 return sum;		
	}

	public char pCharAt(String str, int index) {
		
		return str.charAt(index);
				
	}

	public String pConcat(String str1, String str2) {
		
		return str1.concat(str2);
		
		
	}

}
