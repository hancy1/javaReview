package chap08.chap08_김민지.method.hw2.controller;

public class NonStaticSample {

	public int[] intArrayAllocation(int length) {
		// 전달받은 정수 (length) 만큼 int 배열을 할당
		// 임의의 1부터 100까지의 값으로 값을 기록하고 배열 주소 리턴

		int [] arr = new int [length]; // 배열을 length 만큼 만들어줌

		int result = 0;

		for(int i = 0; i < arr.length; i++) { // lengt 만큼 돌려서 랜덤숫자 넣어주기

			arr[i] = (int)(Math.random()*100+1);

		}
		return arr; // arr 주소값 리턴
	}

	public void display(int[] arr) {
		// 전달받은 배열 출력

		for(int i = 0; i < arr.length; i++) { 
			System.out.print(arr[i] + " ");
		}
	}

	public void swap(int[] arr, int idx1, int idx2) { // arr의 인덱스 값
		// 전달받은 배열의 각각의 인덱스 값을 교환

		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

	public void sortDescending(int[] arr) {
		// 위의 swap 메소드를 이용하여 전달받은 배열을 내림차순 적용
		// 위의 display 메소드를 이용하여 출력

		for(int i = 0; i < arr.length; i++) { // i 3   j 0 1 2 큰 숫자가 앞으로 가야하니까 바꿔줌
			for(int j = 0; j < i ; j++) {     //arr[3]:8  >  arr[2] : 4
				if(arr[i] > arr[j]) {	      //내림차순이므로 큰 숫자가 작은 인덱스에 가야함 
					swap(arr, i, j); 		  //swap 메소드에 보내서 위치를 바꿔준다.
				}
			}
		} 
		display(arr);
	}

	public void sortAscending(int[] arr) {
		// 위의 swqp 메소드를 이용하여 전달받은 배열을 오름차순 적용
		// 위의 display 메소드를 이용하여 출력

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] < arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		display(arr);
	}

	public int countChar(String str, char c) {
		// 문자열과 문자 하나를 전달받아 문자열에 포함된 문자의 갯수 리턴
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) { // str을 돌려주면서 인덱스값에 전달받은 매개변수 c가 있을떄마다 count++
				count++;
			}
		}
		return count;
	}
	
	
	public int totalValue(int num1, int num2) {
		// 정수 두 개를 전달받아 두 수 중 작은 값에서 큰 값 사이의 정수들의 합계를 리턴
		// (단, 전달받은 두 정수는 포함되지 않아야된다.)
		
		int sum = 0;
		
		if(num1 > num2) {
			for(int i = num2; i < num1; i++) {
				sum += i;
			}
		}
		return sum-num2;
	}
	
	
	public char pCharAt(String str, int index) {
		// 전달받은 문자열의 인덱스를 통해 해당 인덱스의 문자 리턴
		
		return str.charAt(index);
	}
	
	
	public String pConcat(String str1, String str2) {
		// 두 개의 문자열을 전달 받아 하나의 문자열로 합쳐서 리턴
		
		//return str1+str2;
		return str1.concat(str2);
	}
}
