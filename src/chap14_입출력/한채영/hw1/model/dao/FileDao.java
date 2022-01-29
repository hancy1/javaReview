package chap14_입출력.한채영.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {

	Scanner sc = new Scanner(System.in);

	public FileDao() {
		// TODO Auto-generated constructor stub
	}

	public void fileSave() {

		StringBuilder sb = new StringBuilder();
		System.out.println("파일에 저장할 내용을 반복해서 입력하세요. exit입력하면 종료");
		while (true) {

			String text = sc.nextLine();

			if (!text.equalsIgnoreCase("exit")) {
				sb.append(text + "\n");
			} else {
				break;
			}
		}

		System.out.println("저장하시겠습니까?(y/n)");
		String yn = sc.nextLine();

		if (yn.equalsIgnoreCase("y")) {

			System.out.println("파일명을 입력하세요.");
			String file = sc.nextLine();
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file + ".txt"))) {

				bw.write(sb.toString()); // sb형을 bw통해 파일에 저장할 때 tostring사용
				System.out.println(file + ".txt 파일에 성공적으로 저장했습니다.");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("다시 메뉴로 돌아갑니다.");
			return;
		}

	}

	public void fileOpen() {

		System.out.println("열기 할 파일명 : ");
		String filename = sc.nextLine() + ".txt";
		String txt;

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

			while ((txt = br.readLine()) != null) {
				System.out.println(txt);
			}
		} catch (FileNotFoundException e) {

			System.out.println("존재하는 파일이 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void fileEdit() {

		System.out.println("수정 할 파일명 : ");
		String filename = sc.nextLine() + ".txt";
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = null;
		String txt;

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

			while ((txt = br.readLine()) != null) {
				System.out.println(txt);
			}
			System.out.println("파일에 추가할 내용을 입력하세요(exit입력하면 종료됩니다.): ");

			while (true) {

				String text = sc.nextLine();

				if (!text.equalsIgnoreCase("exit")) {

					sb.append(text + "\n");
				} else {
					break;
				}

			}

			System.out.println("변경된 내용을 파일에 추가하시겠습니까? (y/n)");
			if (sc.nextLine().charAt(0) == 'y' || sc.nextLine().charAt(0) == 'Y') {

				bw = new BufferedWriter(new FileWriter(filename, true));
				bw.write(sb.toString());
				System.out.println("입력받은 " + filename + "파일의 내용이 변경되었습니다.");

			} else if (sc.nextLine().charAt(0) == 'n' || sc.nextLine().charAt(0) == 'N') {
				return;
			}

		} catch (FileNotFoundException e) {

			System.out.println("존재하는 파일이 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
