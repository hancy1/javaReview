package chap15_컬렉션.chap15_김민지.collection.silsub1.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import chap15_컬렉션.chap15_김민지.collection.silsub1.model.comparator.AscBoardDate;
import chap15_컬렉션.chap15_김민지.collection.silsub1.model.comparator.AscBoardNo;
import chap15_컬렉션.chap15_김민지.collection.silsub1.model.comparator.AscBoardTitle;
import chap15_컬렉션.chap15_김민지.collection.silsub1.model.comparator.DescBoardDate;
import chap15_컬렉션.chap15_김민지.collection.silsub1.model.comparator.DescBoardNo;
import chap15_컬렉션.chap15_김민지.collection.silsub1.model.comparator.DescBoardTitle;
import chap15_컬렉션.chap15_김민지.collection.silsub1.model.dao.BoardDao;
import chap15_컬렉션.chap15_김민지.collection.silsub1.model.vo.Board;

public class BoardManager {
	
	private BoardDao bd = new BoardDao();
	private Scanner sc = new Scanner(System.in);
	
	public BoardManager() {
		// TODO Auto-generated constructor stub
	}

	public void writeBoard() {
		
		System.out.println("새 게시글 쓰기 입니다.");
		System.out.println("글 제목 : "); // "글 제목 : " >> 입력 받음 (공백 포함)
		String title = sc.nextLine();
		
		System.out.println("작성자 : "); // "작성자 : " >> 입력 받음 (공백 없이)
		String s = sc.nextLine();
		
		String writer = ""; // 작성자 공백없이 받을 곳
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch != ' ') {
				writer += ch;
			}
		}
		
		Date date = new Date(); // 작성날짜는 현재 날짜로 처리함
		
		System.out.println("글 내용 (exit 입력시 완료됩니다.): ");
		String str = "";
		String content = "";
		
		while(true) {
			str = sc.nextLine();
			if(str.equalsIgnoreCase("exit")) { // "글 내용 : " >> 여러 줄로 입력 받음 >>"exit" 입력하면 입력종료
				break;
			}else {
				content += str+"\n";
			}
		}
		
		Board board = new Board();
		
		try {
			board = new Board(bd.getLstBoardNo()+1, title, writer, date, content); // BoardDao의 getLastBoardNo() 메소드를 통해 게시글의 마지막 번호를 알아옴
			
			
		}catch(IndexOutOfBoundsException e) {
			
			board = new Board(1, title, writer, date, content);
			
		}finally {
			
			bd.writerBoard(board); // BoardDao의 writeBoard() 메소드 호출 시 해당 Board 전달	
		}
		
		
		
	}

	public void displayAllList() {
		
		 Iterator it = bd.displayAllList().iterator(); // BoardDao의 displayAllList() 메소드를 호출하여 ArrayList를 전달받음
		 
		 while(it.hasNext()) { // Iterator를 이용하여 list 에 기록된 정보를 모두 화면에 출력시킴
			 System.out.println(it.next());
		 }
		
		
		
	}

	public void displayBoard() {
		System.out.println("조회할 글 번호 : ");
		int bNo = sc.nextInt();
		sc.nextLine();
		
		Board board = bd.displayBoard(bNo);
		
		if(board == null) {
			System.out.println("조회된 글이 없습니다.");
		}else {
			System.out.println(board);
			
			bd.upReadCount(bNo);
		}
		
	}

	public void modifyTitle() {
		
		System.out.println("수정할 글 번호 : ");
		int bNo = sc.nextInt();
		sc.nextLine();
		
		Board board = bd.displayBoard(bNo);
		
		if(board != null) {
			System.out.println(board);
			
			System.out.println("변경할 글 제목 : ");
			String newTitle = sc.nextLine();
			
			bd.modifyTitle(bNo, newTitle);
			
		}else {
			System.out.println("조회된 글이 없습니다.");
		}
		
		
		
		
		
		
	}

	public void modifyContent() {
		
		System.out.println("수정할 글 번호 : ");
		int bNo = sc.nextInt();
		sc.nextLine();
		
		Board board = bd.displayBoard(bNo);
		
		if(board != null) {
			System.out.println(board);
			
			System.out.println("변경할 글 내용 : ");
			String content = sc.nextLine();
			
			bd.modifyContent(bNo, content);
			
		}else {
			System.out.println("조회된 글이 없습니다.");
		}
		
	}

	public void deleteBoard() {
		
		System.out.println("삭제할 글 번호 : ");
		int bNo = sc.nextInt();
		sc.nextLine();
		
		Board board = bd.displayBoard(bNo);
		
		if(board == null) {
			System.out.println("조회된 글이 없습니다.");
		}else {
			System.out.println(board);
			
			System.out.println("정말로 삭제하시겠습니까? (y/n)");
			char a = sc.nextLine().toUpperCase().charAt(0);
			
			if(a == 'Y') {
				bd.deleteBoard(bNo);
			}
		}
		
	}

	public void searchBoard() {
		System.out.println("검색할 제목 : ");
		String title = sc.nextLine();
		
		ArrayList<Board> list = bd.searchBoard(title);
		
		if(list.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			Iterator it = list.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
	}

	public void saveListFile() {
		
		bd.saveListFile();
		
	}

	public void sortList(int item, boolean isDesc) {
		
		ArrayList<Board> list =  bd.displayAllList();
		
		switch(item) {
		case 1 :
			if(isDesc) {
				list.sort(new DescBoardNo());
			}else {
				list.sort(new AscBoardNo());
			}
		case 2 :
			if(isDesc) {
				list.sort(new DescBoardDate());
			}else {
				list.sort(new AscBoardDate());
			}
		case 3 :
			if(isDesc) {
				list.sort(new DescBoardTitle());
			}else {
				list.sort(new AscBoardTitle());
			}
		}
		
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	

}
