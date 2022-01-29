package chap15_컬렉션.한채영.collection.silsub1.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import chap15_컬렉션.한채영.collection.silsub1.model.comparator.AscBoardDate;
import chap15_컬렉션.한채영.collection.silsub1.model.comparator.AscBoardNo;
import chap15_컬렉션.한채영.collection.silsub1.model.comparator.AscBoardTitle;
import chap15_컬렉션.한채영.collection.silsub1.model.comparator.DescBoardDate;
import chap15_컬렉션.한채영.collection.silsub1.model.comparator.DescBoardNo;
import chap15_컬렉션.한채영.collection.silsub1.model.comparator.DescBoardTitle;
import chap15_컬렉션.한채영.collection.silsub1.model.dao.BoardDao;
import chap15_컬렉션.한채영.collection.silsub1.model.vo.Board;

public class BoardManager {

	private BoardDao bd = new BoardDao();
	private Scanner sc = new Scanner(System.in);

	public BoardManager() {
		// TODO Auto-generated constructor stub
	}

	public void writeBoard() {
		System.out.println("새 게시글 쓰기입니다.");
		System.out.println("글 제목: ");

		String title = sc.nextLine();
		System.out.println("작성자: ");
		String author = sc.nextLine();

		Date date = new Date();
		date.getDate();

		System.out.println("글 내용: ");
		String text = "";
		String content = "";
		while (true) {
			text = sc.nextLine();
			if (text.equalsIgnoreCase("exit")) {
				break;
			}
			content += text + "\n";
		}

		int bNo;
		try {
			bNo = bd.getLastBoardNo() + 1;
			Board b = new Board(bNo, title, author, date, content);
			bd.writeBoard(b);
		} catch (Exception e) {
			Board b = new Board(1, title, author, date, content);
			bd.writeBoard(b);
		}

		System.out.println("게시글 쓰기 완료!");

	}

	public void displayAllList() {

		ArrayList<Board> list = bd.displayAllList();

		Iterator<Board> itr = list.iterator();

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public void displayBoard() {
		System.out.println("조회할 글 번호: ");
		int bNo = sc.nextInt();

		Board b = bd.displayBoard(bNo);

		if (b != null) {
			System.out.println(b.toString());
			bd.upReadCount(bNo);
		} else {
			System.out.println("조회된 글이 없습니다.");
		}

	}

	public void modifyTitle() {

		System.out.println("수정할 글 번호: ");
		int bNo = sc.nextInt();

		Board b = bd.displayBoard(bNo);

		if (b != null) {
			System.out.println(b.toString());

			System.out.println("변경할 글 제목: ");
			sc.nextLine();
			String title = sc.nextLine();

			bd.modifyTitle(bNo, title);
		} else {
			System.out.println("조회된 글이 없습니다.");
		}
	}

	public void modifyContent() {
		System.out.println("수정할 글 번호: ");
		int bNo = sc.nextInt();

		Board b = bd.displayBoard(bNo);

		if (b != null) {
			System.out.println(b.toString());

			System.out.println("변경할 글 내용: ");
			sc.nextLine();
			String content = "";

			while (true) {

				String text = sc.nextLine();
				if (!text.equalsIgnoreCase("exit")) {
					content += text + "\n";
				} else {
					break;
				}
			}
			bd.modifyContent(bNo, content);
		} else {
			System.out.println("조회된 글이 없습니다.");
		}
	}

	public void deleteBoard() {

		System.out.println("삭제할 글 번호: ");
		int bNo = sc.nextInt();
		Board b = bd.displayBoard(bNo);
		if (b != null) {
			System.out.println("정말로 삭제하시겠습니까?(y/n)");
			sc.nextLine();
			String yn = sc.nextLine();

			if (yn.equalsIgnoreCase("y")) {
				bd.deleteBoard(bNo);
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("이전 메뉴로 이동합니다.");
			}
		} else {
			System.out.println("조회된 글이 없습니다.");
		}

	}

	public void searchBoard() {

		System.out.println("검색할 제목: ");
		sc.nextLine();
		String title = sc.nextLine();
		ArrayList<Board> b = bd.searchBoard(title);

		if (b.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (Board bd : b) {
				System.out.println(bd.toString());
			}
		}
	}

	public void saveListFile() {
		bd.saveListFile();
	}

	public void sortList(int item, Boolean isDesc) {

		ArrayList<Board> a = bd.displayAllList();

		if (item == 1 && isDesc == true) {
			a.sort(new DescBoardNo());
		} else if (item == 1 && isDesc == false) {
			a.sort(new AscBoardNo());
		} else if (item == 2 && isDesc == true) {
			a.sort(new DescBoardDate());
		} else if (item == 2 && isDesc == false) {
			a.sort(new AscBoardDate());
		} else if (item == 3 && isDesc == true) {
			a.sort(new DescBoardTitle());
		} else if (item == 3 && isDesc == false) {
			a.sort(new AscBoardTitle());
		}

		System.out.println(a.toString());
	}

}
