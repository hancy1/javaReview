package chap08.김민보.hw2.controller;

public class NonStaticSample {

	
	public int[] intArrayAllocation(int length) {
		
		int[] arr = new int[length];
		
		for(int i=0; i<arr.length; i++) {
			int num = (int)(Math.random()*100) + 1;			
			arr[i] = num;
		}	
		return arr;
	}
	
	
	public void display(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}		
	}
	
	public void swap(int[] arr, int index1, int index2) {
		
		int swap = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = swap;
		
		
	}
	
	public void sortDescending(int[] arr) {
		// 위의 swap 메소드를 이용하여 전달받은 배열을 내림차순 적용
		// 위의 display 메소드를 이용하여 출력
		
		for(int i=0; i<arr.length; i++) {			
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j]) {
					swap(arr, i, j); 
				}
			}
		}		
		display(arr); 
		
	}

	public void sortAscending(int[] arr) {
		// 위의 swap 메소드를 이용하여 전달받은 배열을 내림차순 적용
		// 위의 display 메소드를 이용하여 출력
		
		for(int i=0; i<arr.length; i++) {			
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j]) {
					swap(arr, i, j); 
				}
			}
		}		
		display(arr); 		
	}
	
	
	public int countChar(String str, char c) {
		// 문자열과 문자 하나를 전달받아 문자열에 포함된 문자의 갯수 리턴
		
		//갯수세는 ! int형 초기화
		int count= 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)== c) {
				count++;
			}			
		}		
		return count;
		
		
	}
	
	public int totalValue(int num1, int num2) {
		// 정수 두 개를 전달받아 두 수 중 작은 값에서 큰 값 사이의 정수들의 합계를 리턴
		// (단, 전달받은 두 정수는 포함되지 않아야된다.)
		
		int sum = 0;//리턴할 값 초기화 하고 시작함
		
		if(num1<num2) {
			for(int i = num1+1; i<num2; i++) {
				sum += i;				
			}
		}else if(num1>num2) {
			for(int i = num2+1; i<num1; i++) {
				sum += i;
			}			
		}else {
			System.out.println("다른 두 수를 입력하세요.");
		}			
		
		return sum;
		
	}
	
	
	public char pCharAt(String str, int index) {
		// 전달받은 문자열의 인덱스를 통해 해당 인덱스의 문자 리턴
		
		char s = '0';// 리턴할 값 미리 초기화 시켜놓기				
		s=str.charAt(index);		
		return s;	
		
	}
	
		
	
	public String pConcat(String str1, String str2) {
		// 두 개의 문자열을 전달 받아 하나의 문자열로 합쳐서 리턴
		
		String sum = " ";//리턴할 값 미리 초기화		
		sum = str1 + str2;		
		return sum;			
		
	}
	
	
}
