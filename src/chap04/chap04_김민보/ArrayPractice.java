package chap04.chap04_김민보;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1(){
		//길이가 10인 정수형 배열을 만들고 반복문을 이용하여
		//순서대로 배열 인덱스에 넣은 후 그 값을 다음과 같이 출력하세요.
		//ex.
		//1 2 3 4 5 6 7 8 9 10
		
		int[] iArr = new int[10];
		
		for(int i = 0; i<iArr.length; i++) {			
			iArr[i] = i+1;
			System.out.print(iArr[i] + " ");
		}
	}
		
	public void practice2(){
		//길이가 10인 정수형 배열을 만들고 반복문을 이용하여
		//역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		//ex.
		//10 9 8 7 6 5 4 3 2 1	
		
		int[] iArr = new int[10];
		
		for(int i = 0; i<iArr.length; i++) {			
			iArr[i] = 10-i;
			System.out.print(iArr[i] + " ");
		}	
	}
	
	public void practice3(){
		//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		//1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		//ex.
		//양의 정수 : 5
		//1 2 3 4 5 
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] iArr = new int[num];
		
		for (int i = 0; i<iArr.length; i++) {
			iArr[i] = i+1;
			System.out.print(iArr[i] + " ");
		}
		
	}
	
	public void practice4(){
		//길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
		//배열 인덱스를 활용해서 귤을 출력하세요
		
		String[] sArr = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(sArr[1]);
		
	}
	
	
	public void practice5(){
		//문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		//개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요
				
		
		Scanner sc = new Scanner(System.in);		

		System.out.println("문자열 : ");
		String str = sc.nextLine();
		
		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		
		char[]arr = new char[str.length()];
				
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		int count = 0;
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}			
		}
		
		System.out.println();
		System.out.println("i의 개수 : " + count);		
		
	}
	
	public void practice6(){
		
		//“월“ ~ “일” (요일)까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		//입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		//범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		String day[] = {"월", "화", "수", "목", "금", "토", "일"};
		
		if(num<=6 && 0<=num) {
			System.out.println(day[num]);
		}
		
		else {
			System.out.println("잘못 입력하셨습니다.");
		}		
	}
	
	
	
	public void practice7(){
		//사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		//배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		//그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int num1 = sc.nextInt();
		
		int[] iArr = new int[num1];		
	
		
		
		for(int i = 0; i<iArr.length; i++) {
			System.out.println("배열" + i + "번째 인덱스에 넣을 값 : ");
			int num2 = sc.nextInt();			
			iArr[i] = num2;			
		}
		
				
		System.out.println(Arrays.toString(iArr));//배운 메소드 사용해서 출력
		
		
		int sum = 0;
		
		for(int i = 0; i<iArr.length; i++) {
			sum += iArr[i];
		}
		System.out.println("총 합 : " + sum);
		
	}

	
	public void practice8(){
		//3이상인 홀수 정수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		//중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		//단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		//다시 정수를 받도록 하세요.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("정수 : ");
			int num = sc.nextInt();
			
			if(3<=num && num % 2==1) {
				
				int[] iArr= new int[num];
				
				//반은 올라가게
				//     7일경우 4.5 보다 작은거니까 1,2,3,4까지만...오름 차순으로 들어감
				for(int i = 0; i < iArr.length/2 + 1; i++) {
					iArr[i] = i + 1;
				}
				
				/*
				//이해하기 쉽게 한번 그냥 출력!!
				//인트형이라 소수점 아래가 자동으로 버려지는것 이용함
				int test = iArr.length/2 + 1;
				System.out.println("내림차순 시작하는 인덱스 : " + test);
				*/
				
				//반은 내림차순으로 넣기~!
				//practic2 역순으로 인덱스 넣는거 참조함!!!
				for(int i = iArr.length/2 + 1; i < iArr.length; i++) {
					iArr[i] = num - i;
					// ex. 4번 인덱스의 경우 iArr[4] = 7 - 4 = 3
				}
				
				
				//출력
				for(int i = 0; i < iArr.length; i++) {
					System.out.print(iArr[i] + " ");
				}
				
				break;					
			}
			
			else {
				System.out.println("다시 입력하세요.");
				continue;
			}
		}		
	}
	
	
	public void practice9(){
		//사용자가 입력한 값이 배열에 있는지 검색하여
		//있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		//단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		String menu[] = {"허니콤보", "레허반반", "후라이드"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("치킨 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		for(int i = 0; i < menu.length; i++) {
			if(menu[i].equals(name)) {
				System.out.println(name + "치킨 배달 가능");
				return;		
			}
		}
		System.out.println(name+"치킨은 없는 메뉴입니다.");
	}
	
	
	public void practice10(){
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		//1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		
		int[] arr = new int[10];
		
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 +1);			
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	public void practice11() {
		
		int[] arr = new int[10];
				
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 +1);			
		}
		System.out.println(Arrays.toString(arr));
		
		int max = 1;
		int min = 10;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				
				//이해를 돕기위해 출력!!
				System.out.println("현재 max값 : "+max);
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
	}
	
	
	public void practice12() {
		
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		//1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		int[] arr = new int[10];		
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 +1);
			
			//중복제거
			for(int j = 0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public void practice13(){
		 
			Scanner sc = new Scanner(System.in);		

			System.out.println("주민등록번호(-포함) : ");
			String str = sc.nextLine();
			
			char[]arr = new char[str.length()];
					
			
			for(int i = 0; i < arr.length; i++) {
				if(i<8) { //주민번호는 항상 같은자리수니까 8보다 작을때까지는 숫자로 저장하고 그이후에 *로 저장하면 됨
					arr[i] = str.charAt(i);
				}			
				else {
					arr[i] = '*';
				}			
			}
			System.out.print(arr);				 
		 }
		
	public void practice14(){

		
				int[] arr = new int[6];
				
				
				for(int i =0; i<arr.length; i++) {
					arr[i] = (int)(Math.random()*45+1);
					
					for(int j = 0; j<i; j++) {
						if(arr[i] == arr[j]) {
							i--;
							break;
						}
					}
				}
				Arrays.sort(arr);
				System.out.println(Arrays.toString(arr));
				
		 }
}
