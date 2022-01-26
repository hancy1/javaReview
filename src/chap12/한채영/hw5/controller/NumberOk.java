package chap12.한채영.hw5.controller;

import java.util.Scanner;

public class NumberOk {

	private int ran;
	private Scanner sc = new Scanner(System.in);

	public NumberOk() {
		// TODO Auto-generated constructor stub
	}

	public void numGame1() {//가이드에서도 n 입력했을 때 계속 진행됨.. 잘못입력된 값 없이는 코딩완료

		while (true) {
			int count = 1;

			ran = (int) (Math.random() * 100 + 1);

			System.out.println("ran값 " + ran);
			
			while (true) {
				System.out.println("1부터 100사이의 정수를 하나 입력하세요: ");
				int num = sc.nextInt();

				if (ran == num) {
					System.out.println(count + "번만에 맞췄습니다!");

					while (true) {

						System.out.println("계속 하시겠습니까?(y/n)");
						sc.nextLine();
						String yn = sc.nextLine();

						while (true) {
							if (yn.equalsIgnoreCase("y") || yn.equalsIgnoreCase("n")) {
								break;
							} else {
								System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
								continue;
							}
						}
						if (yn.equalsIgnoreCase("y")) {
							System.out.println("새로운 게임을 시작합니다!!");
							continue;
						} else if (yn.equalsIgnoreCase("n")) {
							System.out.println("게임을 종료합니다.");
							return;
						}

					}

				}

				else if (ran > num) {
					System.out.println(num + "보다 큽니다. " + count + "번째 실패!");
					count++;
				} else if (ran < num) {
					System.out.println(num + "보다 작습니다. " + count + "번째 실패!");
					count++;
				}

			}

		}
	}
	
	public void numGame() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(true) {
			int ranNum = (int)(Math.random()*100+1);
			System.out.println(ranNum);	// 정답 체크용으로 미리 확인하기
			int i=0;
		
			while(true) {
				i++;
				System.out.print("1부터 100 사이의 정수를 하나 입력하세요 : ");
				int num = sc.nextInt();
				sc.nextLine();
				
				if(ranNum < num) {
					System.out.println(num+"보다 작습니다."+i+"번째 실패!! ");
				}	
				else if(ranNum > num) {
					System.out.println(num+"보다 큽니다."+i+"번째 실패!! ");
				}
				else {
					System.out.println(i+"번 만에 맞췄습니다!");
					while(true) {
						System.out.print("계속  하시겠습니까?(y/n) : ");
						str = sc.nextLine();
						if(str.equalsIgnoreCase("y")||str.equalsIgnoreCase("n"))
							break;
						else
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
							continue;
					}
				}
				if(str.equalsIgnoreCase("y")||str.equalsIgnoreCase("n"))
					break;
			}
			if(str.equalsIgnoreCase("y")) {
				System.out.println("\n새로운 게임을 시작합니다!!");
				continue;
			}
			else if(str.equalsIgnoreCase("n")) {
				System.out.println("게임을 종료합니다.");
				return;
			}
		}
	}
}
