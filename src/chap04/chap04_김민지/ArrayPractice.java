package chap04.chap04_김민지;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1(){
		int [] arr = new int [10];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}

		//확인
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}


	public void practice2(){
		int [] arr = new int [10];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length-i;
		}

		//확인
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void practice3(){
		System.out.println("양의 정수 : ");
		int num = sc.nextInt();

		int [] arr = new int [num];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4(){
		String [] arr = new String[5];

		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";

		System.out.println(arr[1]);		

	}

	public void practice5(){
		System.out.println("문자열 : ");
		String str = sc.nextLine();

		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);

		char [] arr = new char[str.length()]; // 문자열이 들어갈 배열을 만들어준다. 문자열길이만큼

		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i); // 배열에 문자열을 하나하나 넣어준다.
		}

		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");

		int count = 0; // str에 ch가 들어있는 개수

		for(int i = 0; i < arr.length; i++) {
			if(ch == arr[i]) {
				System.out.print(i + " ");
				count++;
			}
		}

		System.out.println("\n" + ch + "개수 : " + count);
	}

	public void practice6(){
		String [] arr = new String [7];

		arr[0] = "월";
		arr[1] = "화";
		arr[2] = "수";
		arr[3] = "목";
		arr[4] = "금";
		arr[5] = "토";
		arr[6] = "일";

		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if(num < 7) {
			System.out.println(arr[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void practice7(){
		System.out.println("정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for(int i = 0; i < arr.length; i++) {
			System.out.println("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}

		int sum = 0; // 총합
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}

		System.out.println("\n총 합 : " + sum);

	}

	public void practice8(){
		while(true) {
			System.out.println("정수 : ");
			int num = sc.nextInt();

			if(num>=3 && num%2==1) { // 3이상이고 홀수여야 한다. 2로 나눴을때 몫이 1씩 남으니까!
				int [] arr = new int [num];

				for(int i = 0; i < (arr.length/2)+1; i++) { // 반을 나누고 +1 을 해서 중반까지는 오름차순
					arr[i] = i+1;
					System.out.print(arr[i] + ", ");
				}
				for(int i = 0; i <(arr.length/2)-1; i++) { // 반을 나누고 -1 을 해서 내림차순
					System.out.print(((arr.length/2)-i) + ", ");
				}
				System.out.println(arr[0]); // 마지막은 항상 arr[0] 
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
	}

	public void practice9(){

		String [] arr = {"후라이드", "양념", "간장", "순살", "반반"};

		System.out.println("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();

		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(str)) { // 문자열은 equals로 비교.
				System.out.println(str + "치킨 배달 가능");
				return; // 반복문 끝.
			}			
		}
		System.out.println(str + "치킨은 없는 메뉴입니다.");
	}


	public void practice10(){
		int [] arr = new int [10];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1); // math.random 은 0.0~9.9
			System.out.print(arr[i] + " ");
		}		
	}

	public void practice11(){
		int [] arr = new int [10];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1); // math.random 은 0.0~9.9
			System.out.print(arr[i] + " "); // 숫자확인
		}

		Arrays.sort(arr); // 오름차순 정렬
		System.out.println();
		System.out.println("최대값 : " + arr[9]);
		System.out.println("최소값 : " + arr[0]);
	}

	public void practice12(){
		int [] arr = new int [10];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*10+1);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice13(){
		System.out.println("주민등록번호(-포함) : ");
		String no = sc.nextLine();

		char [] arr = new char[no.length()];

		for(int i = 0; i < no.length(); i++) {
			arr[i] = no.charAt(i);
			if(i>7) { // 주민번호 8번째까지 나와야하니까 인덱스는 7번째까지 나오게
				arr[i] = '*';
			}
			System.out.print(arr[i]);
		}
	}

	public void practice14(){
		int [] lotto = new int [6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random()*45+1);
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--; // 중복제거
				}
			}
			
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto)); // 배열 내용 출력하기
		

	}
	
	
	public void practice15(){ // 위 14번 arrays로 안하고 직접 해보기
		int [] lotto = new int [6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random()*45+1);
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--; // 중복제거
					break;
				}
			}
			
		}
		
		for(int i = 0; i < lotto.length; i++) {
			for(int j = i+1; j < i; j++) { // j는 i보다 하나크게
				if(lotto[i] > lotto[j]) { // 인덱스[1] 이 인덱스[2] 보다 클때는 인덱스[1]을 뒤로 보내야하니까 값을 바꿔준다.
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp; 
				}
			}
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		

	}




}
