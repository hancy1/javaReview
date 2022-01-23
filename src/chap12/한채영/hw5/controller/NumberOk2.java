package chap12.한채영.hw5.controller;

import java.util.Scanner;

public class NumberOk2 {

	private int ran;
	private Scanner sc = new Scanner(System.in);

	public NumberOk2() {
		// TODO Auto-generated constructor stub
	}

	public void numGame() {

		int count = 1;

		ran = (int) (Math.random() * 100 + 1);
		
		System.out.println("ran값 " + ran);
		
		while (true) {
			System.out.println("1부터 100사이의 정수를 하나 입력하세요: ");
			int num = sc.nextInt();

			if (ran == num) {
				System.out.println(count + "번만에 맞췄습니다!");
				return;
			} else if (ran > num) {
				System.out.println(num + "보다 큽니다. " + count + "번째 실패!");
				count++;
			} else if (ran < num) {
				System.out.println(num + "보다 작습니다. " + count + "번째 실패!");
				count++;
			}

		}
	}
}
