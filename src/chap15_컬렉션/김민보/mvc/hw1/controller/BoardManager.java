package chap15_컬렉션.김민보.mvc.hw1.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import chap15_컬렉션.김민보.mvc.hw1.model.comparator.AscBoardDate;
import chap15_컬렉션.김민보.mvc.hw1.model.comparator.AscBoardNo;
import chap15_컬렉션.김민보.mvc.hw1.model.comparator.AscBoardTitle;
import chap15_컬렉션.김민보.mvc.hw1.model.comparator.DescBoardDate;
import chap15_컬렉션.김민보.mvc.hw1.model.comparator.DescBoardNo;
import chap15_컬렉션.김민보.mvc.hw1.model.comparator.DescBoardTitle;
import chap15_컬렉션.김민보.mvc.hw1.model.dao.BoardDao;
import chap15_컬렉션.김민보.mvc.hw1.model.vo.Board;

public class BoardManager {

    private BoardDao bd = new BoardDao();
    private Scanner sc = new Scanner(System.in);

    public void writeBoard() {

        System.out.println("새 게시글 쓰기입니다.");

        System.out.print("글제목 : ");
        String title = sc.nextLine();

        System.out.print("작성자 : ");
        String writer = sc.nextLine();

        String realWriter = "";
        for (int i = 0; i < writer.length(); i++) {
            char ch = writer.charAt(i);
            if (ch != ' ') {
                realWriter += ch;
            }
        }

        Date date = new Date();

        System.out.print("글 내용 (exit 입력 시 종료) : ");
        String str = "";
        String content = "";

        while (true) {
            str = sc.nextLine();

            if (str.equals("exit"))
                break;

            content += str + "\n";
        }

        try {
            bd.writeBoard(new Board(bd.getLastBoardNo() + 1, title, writer, date, content));
        } catch (IndexOutOfBoundsException e) {
            bd.writeBoard(new Board(1, title, writer, date, content));
        }
    }

    public void displayAllList() {
        /* System.out.println(bd.displayAllList()); */
        Iterator it = bd.displayAllList().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    public void displayBoard() {
        System.out.print("조회할 글 번호 : ");
        int no = sc.nextInt();

        Board board = bd.displayBoard(no);
        if (board == null) { // displayBoard() 실행 결과 일치하는 게시글이 없으면
            System.out.println("조회된 게시글이 없습니다.");
        } else { // 조회된 게시글이 있으면
            System.out.println(board);

            // 조회수 올리기
            bd.upReadCount(no); // 조회수를 올리기 위해 지금 조회된 게시글의 번호를 넘김
        }

    }

    public void modifyTitle() {
        System.out.print("수정할 글번호 : ");
        int no = sc.nextInt();
        sc.nextLine();

        Board board = bd.displayBoard(no);
        if (board == null) {
            System.out.println("조회된 글이 없습니다.");
        } else {
            System.out.println(board);

            System.out.print("변경할 제목 : ");
            String title = sc.nextLine();
            bd.modifyTitle(no, title);
        }

    }

    public void modifyContent() {
        System.out.print("수정할 글번호 : ");
        int no = sc.nextInt();
        sc.nextLine();

        Board board = bd.displayBoard(no);
        if (board == null) {
            System.out.println("조회된 글이 없습니다.");
        } else {
            System.out.println(board);

            System.out.print("변경할 내용 : ");
            String content = sc.nextLine();
            bd.modifyContent(no, content);
        }

    }

    public void deleteBoard() {
        System.out.print("삭제할 글번호 : ");
        int no = sc.nextInt();
        sc.nextLine();

        Board board = bd.displayBoard(no);
        if (board == null) {
            System.out.println("조회된 글이 없습니다.");
        } else {
            System.out.println(board);

            System.out.print("정말로 삭제하시겠습니까? (y/n) : ");
            char ch = sc.nextLine().toUpperCase().charAt(0);
            if (ch == 'Y') {
                bd.deleteBoard(no);
                System.out.println(no + "번 글이 삭제되었습니다.");
            }
        }

    }

    public void searchBoard() {

        System.out.print("검색할 제목 : ");
        String title = sc.nextLine();

        // 검색 결과가 다중일 수도 있으니깐 ArrayList로 결과값 받기
        ArrayList<Board> searchList = bd.searchBoard(title);

        if (searchList.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            for (int i = 0; i < searchList.size(); i++) {
                System.out.println(searchList.get(i));
            }
        }

    }

    public void saveListFile() {

        bd.saveListFile();

    }

    public void sortList(int item, boolean isDesc) {

        // BoardDao의 displayAllList()의 메소드를 호출하여 전체 글 리스트 전달 받아
        // item 이 1이면 번호순 정렬
        // item 이 2이면 날짜순 정렬
        // item 이 3이면 제목순 정렬 작동되게 정렬용 클래스 사용함
        // isDesc 가 true 이면 내림차순정렬 작동
        // isDesc 가 false 이면 오름차순정렬 작동되게 함

        ArrayList<Board> list = bd.displayAllList();
        switch (item) {
            case 1:
                if (isDesc)
                    list.sort(new DescBoardNo());
                else
                    list.sort(new AscBoardNo());
                break;
            case 2:
                if (isDesc)
                    list.sort(new DescBoardDate());
                else
                    list.sort(new AscBoardDate());
                break;
            case 3:
                if (isDesc)
                    list.sort(new DescBoardTitle());
                else
                    list.sort(new AscBoardTitle());
                break;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
