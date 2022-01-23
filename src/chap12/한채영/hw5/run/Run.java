package chap12.한채영.hw5.run;

import java.util.Scanner;

import chap12.한채영.hw5.controller.NumberOk;

public class Run {

	public static void main(String[] args) {

		NumberOk no = new NumberOk();
		Scanner sc = new Scanner(System.in);
		String yn;

		while (true) {
			no.numGame();

			System.out.println("계속 하시겠습니까?(y/n)");
			yn = sc.nextLine();
			if (yn.equalsIgnoreCase("y")) {
				System.out.println("새로운 게임을 시작합니다!!");
				continue;
			} else if (yn.equalsIgnoreCase("n")) {
				System.out.println("게임을 종료합니다.");
				return;
			}
		}

	}

}
