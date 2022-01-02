package chap03.chap03_김민보.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	
	public void practice1() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		//만일 1 미만의 숫자가 입력됐다면 “잘못 입력하셨습니다.“를 출력하세요.
		//(for문 이용)
		
		System.out.println("1이상의 정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = 1; i<=num ; i++) {
				System.out.print(i + " ");
			}
		}
		
		else {
			System.out.println("잘못 입력하셨습니다.");
		}		
		
	}
	
	
	public void practice2(){
		
		//위의 문제에서 잘못입력했을 떄 처음으로 돌아가게~!
					
		
		while(true) {			
			System.out.println("1이상의 정수를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				for(int i = 1; i<=num ; i++) {
					System.out.print(i + " ");				
				} break;
			}
		
			else {			
				System.out.println("잘못 입력하셨습니다.");
				continue;//가장 가까운 반복문으로 올라감/(맨앞 와일문)
			}		
		}
	}
	
	
	public void practice3(){
		//입력받은 한개의 숫자를 1까지 거꾸로 출력하기
		
		
		System.out.println("1이상의 정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = num; i>=1 ; i--) {
				System.out.print(i + " ");
			}
		}
		
		else {
			System.out.println("잘못 입력하셨습니다.");
		}	
	}
	
	
	public void practice4(){
		// 위의 문제랑 같은데 잘못 입력했을 때 처음으로 돌아가기
		
		
		while(true) {
			
			System.out.println("1이상의 정수를 입력하세요 : ");
		
			int num = sc.nextInt();
		
			if(num >= 1) {
				for(int i = num; i>=1 ; i--) {
					System.out.print(i + " ");
				} break;
				
			}
		
			else{
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}			
		}
		
	}

	public void practice5(){		
		
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요
		
		System.out.println("정수를 하나 입력하세요 : ");
		
		int num = sc.nextInt();		
		int sum = 0;
		
		for(int i = 1; i<=num; i++) { 
			sum += i;
			 
			if(i < num) { 
				System.out.print(i + " + ");
			}else { 
				System.out.print(i + " = " + sum);
			}
		}		
	} 
	
	public void practice6(){		
		//입력받은 두 수를 포함한 두수의 사이값 출력		
		
		
		System.out.println("첫번 째 1이상의 정수 : ");
		int a = sc.nextInt();
		
		System.out.println("두번 째 1이상의 정수 : ");
		int b = sc.nextInt();
		
		if(1 <= a && 1 <= b){
			if (a < b) {
				for(int i = a; i<=b ; i++) {					
					System.out.print(i+" ");
					}
				}
			
			else if(a > b) {
				for(int j =b; j<=a; j++) {
					System.out.print(j + " ");
				}
			}
			
			else if(a==b) {
				System.out.print(a +"와 " + b + "의 값이 같습니다.");
			}
			
		}
		
		else if(1>a || 1>b) {
			System.out.println("1이상의 숫자만 입력해주세요.");
			}
			
		
	}
	
	public void practice7() {
		//위와 같은데 잘못입력하면 처음으로 돌아가기~!
				
		
		while(true) {
			
			System.out.println("첫번 째 1이상의 정수 : ");
			int a = sc.nextInt();
			
			System.out.println("두번 째 1이상의 정수 : ");
			int b = sc.nextInt();
			
			if(1 <= a && 1 <= b){
				if (a < b) {
					for(int i = a; i<=b ; i++) {					
						System.out.print(i+" ");						
						}break;
					}				
				else if(a > b) {
					for(int j =b; j<=a; j++) {
						System.out.print(j + " ");						
					}break;
				}				
				else if(a==b) {
					System.out.print(a +"와 " + b + "의 값이 같습니다.");
					break;
				}				
			}			
			else {
				System.out.println("1이상의 숫자만 입력해주세요.");	
				continue;
				}			
		}
		
	}
	
	public void practice8(){
		//단 출력		
		
		System.out.println("1이상의 정수를 입력하세요 : ");		
		int dan = sc.nextInt();
		
		System.out.println("===== "+dan+"단 ======");
		
		for(int i = 1; i<=9; i++) {			
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
		
	}
	
	public void practice9(){
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 2~9 사이의 숫자가 아닌 경우 “2~9 사이의 숫자만 입력해주세요”를 출력하세요.
	
		System.out.println("입력 받은 숫자의 단부터 9단까지 출력 : ");		
		int dan = sc.nextInt();
		
		
		
		if(2<=dan && dan<=9) {			
			for(int i = dan; i<=9; i++) {
				System.out.println("===== "+i+"단 ======");
				for(int j = 1; j<=9; j++) {					
					System.out.println(i + " * " + j + " = " + (i * j));
				}				
			}
		}
		
		else {
			System.out.println("2~9사이의 숫자만 입력해주세요.");
		}
		
	}
	
	public void practice10(){
		//위와같은데 잘못 입력했을 때 사용자가 다시 입력하게 
		
		
		while(true) {
			System.out.println("입력 받은 숫자의 단부터 9단까지 출력 : ");		
			int dan = sc.nextInt();		
			
			if(2<=dan && dan<=9) {			
				for(int i = dan; i<=9; i++) {
					System.out.println("===== "+i+"단 ======");
					for(int j = 1; j<=9; j++) {					
						System.out.println(i + " * " + j + " = " + (i * j));
					}				
				} break;
			}
			
			else {
				System.out.println("2~9사이의 숫자만 입력해주세요.");
				continue;
			}
		}		
	}
	
	public void practice11(){
		// 사용자로부터 시작숫자와 공차를 입력받아 일정한 값으로 숫자가 커지거나 작아지는 프로그램 구현 출력되는 숫자 10개)
				
		
		System.out.println("시작 숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("공차 : ");
		int gong = sc.nextInt();
			
		
		for(int i = 1; i<=10; i++) {			
			System.out.print(num + " ");
			num += gong;
		}
		
		
	}

	public void practice12(){
		
		
		while(true) {
		
			System.out.println("첫번 째 정수 : ");
			int num1 = sc.nextInt();
		
			System.out.println("두번 째 정수 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine();
			
						
			System.out.println("(종료하려면 exit 입력) ");
			String str = " ";
			System.out.println("연산자를 입력해주세요 : ");			
			str = sc.nextLine();
		
			
			
			if(str.equals("exit")) {
				System.out.println("exit를 입력해서 프로그램이 종료됩니다.");
				break;
			}			
			
			
			
			else if(str.equals("+")) {				
					System.out.printf("%d  %s  %d = %d", num1, str, num2, num1+num2);
					break;
					}			
		
				
			else if(str.equals("-")) {				
					System.out.printf("%d  %s  %d = %d", num1, str, num2, num1-num2);
					break;
					}
				
			else if(str.equals("*")) {				
					System.out.printf("%d  %s  %d = %d", num1, str, num2, num1*num2);
					break;
					}
			
			else if(str.equals("/") && num2==0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요!");
				continue;
			}	
			
			
			else if(str.equals("/")) {				
					System.out.printf("%d  %s  %d = %d", num1, str, num2, num1/num2);
					break;
					}
				
			else if(str.equals("%")) {				
					System.out.printf("%d  %s  %d = %d", num1, str, num2, num1%num2);
					break;			
					}					
			
			//(str != "+" && str != "-" && str!= "*" && str != "/" && str !="%")
			
			else {
				System.out.println("없는연산자입니다 다시 입력해주세요!");
				continue;
				}
			
				
			}
		}
	
	public void practice15(){
		//사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		//단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		
			
		int i =0;		
		
		System.out.println("소수인지 판별하고 싶은 숫자 : ");
		int num = sc.nextInt();
		
		
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			}
		
		else if( num == 2 ) {
			System.out.println("소수입니다.");
			}	
		
		else { //나랑 같은 수로 나눠지는 건 어차피 소수도 마찬가지라 뺀거임../
			for(i=2; i<num; i++) {
				if(num%i==0)					
					break;
			}
			if(i==num){
				System.out.println("소수입니다.");
				}
			
			else {System.out.print("소수가 아닙니다.");
				}		
			}		
	}
	
	public void practice16 (){
		//위와같으나 2보다 작을때 처음으로 돌아가게		
				
		while(true) {
			int i =0;		
			
			System.out.println("소수인지 판별하고 싶은 숫자 : ");
			int num = sc.nextInt();
			
			if(num < 2) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
				}
			
			else if( num == 2 ) {
				System.out.println("소수입니다.");
				break;
				}	
			
			else {
				for(i=2; i<num; i++) {
					if(num%i==0)
						break;
				}
				if(i==num){
					System.out.println("소수입니다.");
					break;
					}
				
				else {System.out.print("소수가 아닙니다.");
					 break;
					}		
				}	
		}		
	}
	public void practice17() {
		//2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
		//단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		boolean flag = true;
		int count = 0; 
		
		if(num >= 2) {
			for(int i = 2; i <= num; i++) {		
				
				for(int j = 2; j < i; j++) {
					
					if(i % j == 0) {
						flag = false;
						break;
					}
				}
				
				if(flag) { 
					System.out.print(i + " ");
					count++;
				}
				
				flag = true; // 다시 true로 초기화
			}
			
			
			System.out.println("2부터 " + num + "까지 소수의 개수는 " + count + "개입니다.");
			
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}	
	}
	
	public void practice18() {
		
		//1부터 사용자에게 입력 받은 수까지 중에서
		//1) 2와 3의 배수를 모두 출력하고
		//2) 2와 3의 공배수의 개수를 출력하세요.
		//(for문 이용)
		//* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
		//모두 나머지가 0이 나오는 수
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= num; i++) {   
			
			if(i % 2 == 0 || i % 3 == 0) { 
				System.out.print(i + " ");
			}
			
			if(i % 2 == 0 && i % 3 == 0) { 
				count++;
			}
		}		
		System.out.println();
		System.out.println("count : " + count);
	}
	
	public void practice19() {
		
		//역피라미드형 삼각형
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		//5입력시 5줄이 나와야하니까 1까지출력함
		for(int i=num; i>=1; i--) {			
			
			//공백찍기( ex. 첫줄일경우 공백이 입력받은수 -1 이여야됨)
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=num-i+1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void practice20() {
		
		//다이아몬드형 별찍기
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// 위쪽
		for(int i=0; i<num; i++) {
			
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		// 아래
		for(int i=num-1; i>0; i--) {
			
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice21() {
	
		//정삼각형 별찍기
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int star = 1;
		for(int i=num; i>0; i--) {
			
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<star; k++) {
				System.out.print("*");
			}
			
			star += 2;
			System.out.println();
			
		}
		
	}
	
	public void practice22() {
		
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0 ; i < num ; i++) {
			
			for(int j = 0; j < num ; j++) {
				
				// 첫막줄 *
				if(i == 0 || i == num-1) {
					System.out.print("*");
				}
				else{//가운데 줄은 첫열, 끝열만 *이고 나머지 공백처리
					if(j == 0 || j == num-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println(); 
		}
	}
	
	
	public void practice23a() {
	
		//하드코딩	
		System.out.println("  *");
		System.out.println(" * *");
		System.out.println("*   *");
		System.out.println(" * *");
		System.out.println("  *");
		
	}
	
	public void practice23b() {
		
		for(int i=-2; i<=2; i++) {		// -2 ~ 2 까지 반복 (5번 반복)
			
			int k = i < 0 ? -i : i;		// k 변수에 i 절대값 대입
			
			for(int j=k; j>0; j--) {	// 공백을 출력하는 반복문
				System.out.print(" ");
			}
			
			for(int j=1; j<=5-2*k; j++) { // 별을 출력하는 반복문
				
				if(j==1 || j==5-2*k) {		// 첫번째 열과 마지막 열에만 별 찍히고
					System.out.print("*");
				}else {						// 나머지는 별 찍히게
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	
	public void practice24() {
		
		for(int i=-2; i<=2; i++) {		// -2 ~ 2 까지 반복 (5번 반복)
			
			int k = i < 0 ? -i : i;		// k 변수에 i 절대값 대입
			
			for(int j=k; j>0; j--) {	// 공백을 출력하는 반복문
				System.out.print(" ");
			}
			
			for(int j=1; j<=5-2*k; j++) { // 별을 출력하는 반복문
				
				if(j==1 || j==5-2*k) {		// 첫번째 열과 마지막 열에만 별 찍히고
					System.out.print("*");
				}else {						// 나머지는 별 찍히게
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	
	//25
	
	public void practice25() {
		
		for(int i=1; i<=5; i++) {		// 5행 반복 (5번 반복)
			
			for(int j=1; j<=10; j++) {	// 10열 반복 (10번 반복)
				
				if(i==1 || i==5) {			// 첫번째 행과 마지막 행에는
					System.out.print("*");	// 모든 열에 다 별 찍히도록
					
				}else {						// 그외의 행에는
					if(j==1 || j==10) {		// 첫번째 열과 마지막 열에만 별찍고
						System.out.print("*");
					}else {					// 그 외의 열에는 공백이 찍히도록
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
	
	


}
