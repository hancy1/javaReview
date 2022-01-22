package chap12.chap12_김민지.hw5.controller;

import java.util.Scanner;

public class NumberOk {

	private int ran;

	public NumberOk() {
		// TODO Auto-generated constructor stub
	}

	public void numGame() { // 반복문(랜덤숫자 생성 (count세며 맞추기 (계속할지안할지)))
		
		Scanner sc = new Scanner(System.in);
		String str = ""; // 계속 할건지에 대한 대답

		while(true) { 
			ran = (int) (Math.random()*100+1); // 랜덤숫자 생성
			//System.out.println(ran); // 정답확인을 위해 미리 출력해보기
			int count = 0; // 몇 번째에 맞추는지 카운트


			while(true) {
				count++; // 몇번째 맞추는지 숫자!

				System.out.println("1부터 100 사이의 정수를 하나 입력하세요 : ");
				int num = sc.nextInt();
				sc.nextLine();

				if(num > ran) {
					System.out.println(num + "보다 작습니다. " + count + "번째 실패!!");
				}else if(num < ran) {
					System.out.println(num + "보다 큽니다. " + count + "번째 실패!!");
				}else {
					System.out.println(count + "번 만에 맞췄습니다!");
					
					// 정답을 맞췄으면 계속 할건지 물어보기

					while(true) {
						System.out.println("계속 하시곘습니까? (y/n) : ");
						str = sc.nextLine();

						if(str.equalsIgnoreCase("Y") || str.equalsIgnoreCase("N")) {
							break; // 게속할건지에 대한 반복문 벗어남 -> 맟주는 반복문으로 이동
						}else {
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
							continue; // 반복문 다시 반복
						}
					}

				}
				if(str.equalsIgnoreCase("Y") || str.equalsIgnoreCase("N")) {
					break; // 현재 맞추는 반복문안. 벗어나서 랜덤숫자생성 반복문으로 이동
				}
			}
			// 현재 위치는 랜덤숫자 생성 반목문 안!
			if(str.equalsIgnoreCase("Y")) {
				System.out.println("새로운 게임을 시작합니다!!");
				continue; // 반복문을 다시 돌아서 랜덤숫자 생성 -> 문제 맞추기 또 반복
			}else if(str.equalsIgnoreCase("N")) {
				System.out.println("게임을 종료합니다.");
				return; // 반복문 탈출!!!!
			}
		}
	}
}
