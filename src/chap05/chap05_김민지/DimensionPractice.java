package chap05.chap05_김민지;

import java.util.Scanner;

public class DimensionPractice {
	public void practice1(){
		int [][] arr = new int [4][4];

		int value = 1;

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf( "%3d", arr[i][j]);
			}System.out.println();
		}
	}


	public void practice2(){

		int [][] arr = new int [4][4];

		int value = 16;

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;
			}
		}

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}System.out.println();
		}
	}

	public void practice3(){
		String [][] arr = new String [3][3];


		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%s", arr[i][j]); // %s 문자열 형식으로 출력
			}System.out.println();
		}
	}


	public void practice4(){

		int [][] arr = new int [4][4];

		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr[i].length-1; j++) { // 3,3 까지만 채우고 4,4에는 합계가 들어가야하므로 -1

				arr[i][j] = (int)(Math.random()*10+1);

				arr[3][i] += arr[i][j]; // 행들의 값
				arr[i][3] += arr[i][j]; // 열들의 갑

				arr[3][3] += arr[i][j]; // 총합

			}
		}

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				//System.out.print(arr[i][j] + " ");
				System.out.printf("%3d", arr[i][j]); //%3d : 3자리의 정수형을 표현한다는 뜻. 앞에 빈공간 2개가 생기고 그 다음 숫자 2가 출력됩니다.

			}
			System.out.println();
		}
	}


	public void practice5(){

		Scanner sc = new Scanner (System.in);

		while(true) {
			System.out.println("행 크기 : ");
			int row = sc.nextInt();

			System.out.println("열 크기 : ");
			int col = sc.nextInt();

			if(row > 0 || row <11 && col >0 || col < 11) {

				char [][] arr = new char [row][col]; 

				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						arr[i][j] = (char)((int) (Math.random()*25+65)); // 왜 25 65 순서바꾸면 안나오는지..?
					}
				}
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
			}
		}

	}

	public void practice6(){
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원", 
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};

			for(int i = 0; i < strArr.length; i++) {
				for(int j = 0; j < strArr[i].length; j++) {
					System.out.print(strArr[j][i] + " ");
				}
				System.out.println();
			}
	}

	public void practice7(){

		/*사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 각각 해당 행의 크기도 받아
		 문자형 가변 배열을 선언 및 할당하세요.
		 그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		 ex.
		 행의 크기 : 4
		 0행의 크기 : 2
		 1행의 크기 : 6
		 2행의 크기 : 3
		 3행의 크기 : 5
		 a b 
		 c d e f g h 
		 i j k 
		 l m n o p*/

		Scanner sc = new Scanner (System.in);

		System.out.println("행의 크기 : ");
		int row = sc.nextInt();

		char[][] arr = new char[row][]; // 행만큼의 char 배열 만들기 알파벳 넣을거기 때문에

		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "행의 크기 : "); // 각 행의 크기 입력받기
			int col = sc.nextInt();

			arr[i] = new char [col];
		}

		char value = 'a'; // 가변배열에 넣어줄 value 초기화 선언 

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) { // 가변배열에 value 값 넣어줌
				arr[i][j] = value++;
			}
		}

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice8(){
		String [] arr = new String [] {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};

		//System.out.println(Arrays.toString(arr)); 배열 잘 들어갔나 확인

		String [][] stu1 = new String [3][2];
		String [][] stu2 = new String [3][2];

		int count = 0; //학생들 넘치면 끊어줘야 하니까 초기화 선언

		for(int i = 0; i < stu1.length; i++) {
			for(int j = 0; j < stu1[i].length; j++) {
				stu1[i][j] = arr[count++]; // arr[5] 까지 들어갔을것 
			}
		}

		for(int i = 0; i < stu2.length; i++) {
			for(int j = 0; j < stu2[i].length; j++) {
				stu2[i][j] = arr[count++]; 
			}
		}

		System.out.println("== 1분단 ==");
		for(int i = 0; i < stu1.length; i++) {
			for(int j = 0; j < stu1[i].length; j++) {
				System.out.print(stu1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		for(int i = 0; i < stu2.length; i++) {
			for(int j = 0; j < stu2[i].length; j++) {
				System.out.print(stu2[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice9(){
		Scanner sc = new Scanner (System.in);
		
		String [] arr = new String [] {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};

		//System.out.println(Arrays.toString(arr)); 배열 잘 들어갔나 확인

		String [][] stu1 = new String [3][2];
		String [][] stu2 = new String [3][2];

		int count = 0; //학생들 넘치면 끊어줘야 하니까 초기화 선언

		for(int i = 0; i < stu1.length; i++) {
			for(int j = 0; j < stu1[i].length; j++) {
				stu1[i][j] = arr[count++]; // arr[5] 까지 들어갔을것 
			}
		}

		for(int i = 0; i < stu2.length; i++) {
			for(int j = 0; j < stu2[i].length; j++) {
				stu2[i][j] = arr[count++]; 
			}
		}

		System.out.println("== 1분단 ==");
		for(int i = 0; i < stu1.length; i++) {
			for(int j = 0; j < stu1[i].length; j++) {
				System.out.print(stu1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		for(int i = 0; i < stu2.length; i++) {
			for(int j = 0; j < stu2[i].length; j++) {
				System.out.print(stu2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("============================");
		System.out.println("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		String part = ""; // 분단 -> 어떤 배열
		int row = 0; // 몇번째 줄 -> 행
		String col = ""; // 왼쪽 오른쪽 -> 열
		
		for(int i = 0; i < stu1.length; i++) {
			for(int j = 0; j < stu1[i].length; j++) {
				if(stu1[i][j].equals(name)) {
					part = "1분단";
					row = i+1; // 첫째줄부터니까 0+1
					
					if(j == 0) {
						col = "왼쪽";
					}else {
						col = "오른쪽";
					}
				}
			}
		}
		
		for(int i = 0; i < stu2.length; i++) {
			for(int j = 0; j < stu2[i].length; j++) {
				if(stu2[i][j].equals(name)) {
					part = "2분단";
					row = i+1; // 첫째줄부터니까 0+1
					
					if(j == 0) {
						col = "왼쪽";
					}else {
						col = "오른쪽";
					}
				}
			}
		}
		
		if(part.equals("")) {
			System.out.println("검색하신 학생은 없습니다.");
		}else {
			System.out.println("검색하신 " + name + " 학생은 " + part + " " + row + "번째 줄 " + col +"에 있습니다." );
		}
		
	}


}
