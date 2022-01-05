package chap05.김민보;

import java.util.Scanner;

public class DimensionPractice {
public void practice1(){
		
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1) 1 ~ 16까지 값을 차례대로 저장하세요.
		//2) 저장된 값들을 차례대로 출력하세요.
		
		int[][] arr = new int[4][4];
		
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	public void practice2(){
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
		//2) 저장된 값들을 차례대로 출력하세요
		
		int[][] arr = new int[4][4];

		int count = 16;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count--;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void practice3(){
		
		//3행 3열짜리 문자열 배열을 선언 및 할당하고
		//인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.


		String[][] arr = new String[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public void practice4(){
		//4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
		//아래의 내용처럼 처리하세요.
		
		int[][] arr = new int[4][4];		
		
		
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j=0; j<arr[i].length-1; j++) {
				arr[i][j] = (int)(Math.random() * 10 + 1);
				
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				
				arr[3][3] += arr[i][j];
				
			}			
		}	
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice5(){
		
		//2차원 배열의 행과 열의 크기를 사용자에게 직접 입력 받되, 1~10사이 숫자가 아니면
		//“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
		//크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
		//(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타내고 90은 Z를 나타냄)
		Scanner sc = new Scanner(System.in);

		while (true) {
			
			System.out.println("행의 크기(1~10) : ");
			int h = sc.nextInt();

			if (h < 1 || 10 < h) {
				System.out.println("반드시 1~10사이의 정수를 입력해야 합니다. 다시 입력하세요");
				continue;
			}

			System.out.println("열의 크기(1~10) : ");
			int y = sc.nextInt();

			
			if (y < 1 || 10 < y) {
				System.out.println("반드시 1~10사이의 정수를 입력해야 합니다. 처음부터 다시 입력하세요");
				continue;
			}

			else {
				char[][] arr = new char[h][y];

				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						arr[i][j] = (char) (Math.random() * 26 + 65);
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
				break;
			}
		}

	}

	public void practice6(){
		
		
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원", 
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};

		//위의 초기화되어 있는 배열을 가지고 아래의 ‘[그림] 실습문제6 흐름’과 같은 방식으로 출력하세요.
		//단, print()를 사용하고 값 사이에 띄어쓰기(“ “)가 존재하도록 출력하세요.	
		//한줄로 다 출력
			
			for (int i = 0; i < strArr.length; i++) {
				for (int j = 0; j < strArr[i].length; j++) {
					System.out.print(strArr[j][i] + " ");
				}
			} // System.out.println(); 한줄에 다 출력 하는거라 안씀
		
			
	}
	
	
	public void practice7(){
		
		//사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 각각 해당 행의 크기도 받아
		//문자형 가변 배열을 선언 및 할당하세요.
		//그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("행의 크기를 입력 하세요 : ");
		int hang = sc.nextInt();

		char[][] arr = new char[hang][];
		char index = 'a';

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "행의 크기를 입력 하세요 : ");
			int y = sc.nextInt(); // 입력받은 값으로 가변 배열 할당 할것임

			arr[i] = new char[y];

			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = index++;// 문자 a부터 순서대로 할당~!
			}
		}

		// 출력하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}

	}
		
		
	
	
	
	public void practice8(){
		
		/*
		1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
		3행 2열로 2차원 배열 2개를 이용하여 분단을 나눠서 저장.
		1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.
		<출석부>
		1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
		7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
		*/
		
		String[] arr = new String[] { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표",
		"홍하하" };

		String[][] sArr1 = new String[3][2];
		String[][] sArr2 = new String[3][2];
		
		int index = 0;
		
		for (int i = 0; i < sArr1.length; i++) {
			for (int j = 0; j < sArr1[i].length; j++) {
				sArr1[i][j] = arr[index++];
			}
		}
		for (int i = 0; i < sArr2.length; i++) {
			for (int j = 0; j < sArr2[i].length; j++) {
				sArr2[i][j] = arr[index++];
			}
		}
		
		System.out.println("== 1분단 ==");
		for (int i = 0; i < sArr1.length; i++) {
			for (int j = 0; j < sArr1[i].length; j++) {
				System.out.print(sArr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for (int i = 0; i < sArr2.length; i++) {
			for (int j = 0; j < sArr2[i].length; j++) {
				System.out.print(sArr2[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	
	public void practice9(){
		//위 문제에서 자리 배리 배치한 것을 가지고 학생 이름을 검색하여
		//해당 학생이 어느 자리에 앉았는지 출력하세요.
			String[] arr = new String[] { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표",
			"홍하하" };
			
			String[][] sArr1 = new String[3][2];
			String[][] sArr2 = new String[3][2];
			
			int index = 0;
			
			for (int i = 0; i < sArr1.length; i++) {
				for (int j = 0; j < sArr1[i].length; j++) {
					sArr1[i][j] = arr[index++];
				}
			}
			for (int i = 0; i < sArr2.length; i++) {
				for (int j = 0; j < sArr2[i].length; j++) {
					sArr2[i][j] = arr[index++];
				}
			}
			
			System.out.println("== 1분단 ==");
			for (int i = 0; i < sArr1.length; i++) {
				for (int j = 0; j < sArr1[i].length; j++) {
					System.out.print(sArr1[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println("== 2분단 ==");
			for (int i = 0; i < sArr2.length; i++) {
				for (int j = 0; j < sArr2[i].length; j++) {
					System.out.print(sArr2[i][j] + " ");
				}			
				System.out.println();
			}
			
			System.out.println("==============================");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("검색할 학생 이름을 입력 하세요 : ");
			String name = sc.nextLine();
			
			for (int i = 0; i < sArr1.length; i++) {
				for (int j = 0; j < sArr1[i].length; j++) {
					if (sArr1[i][j].equals(name)) {
						if (i == 1) {
							System.out.println("검색하신 " + name + " 학생은 1분단 " + (i + 1) + "번째 줄 왼쪽에 있습니다.");
						} else {
							System.out.println("검색하신 " + name + " 학생은 1분단 " + (i + 1) + "번째 줄 오른쪽에 있습니다.");
						}
					}
				}
			}
			
			for (int i = 0; i < sArr2.length; i++) {
				for (int j = 0; j < sArr2[i].length; j++) {
					if (sArr2[i][j].equals(name)) {
						if (i == 1) {
							System.out.println("검색하신 " + name + " 학생은 2분단 " + (i + 1) + "번째 줄 왼쪽에 있습니다.");
						} else {
							System.out.println("검색하신 " + name + " 학생은 2분단 " + (i + 1) + "번째 줄 오른쪽에 있습니다.");
						}
					}
				}
			}
		
	}
	
	
}
