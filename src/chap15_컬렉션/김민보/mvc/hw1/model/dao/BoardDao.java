package chap15_컬렉션.김민보.mvc.hw1.model.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import chap15_컬렉션.김민보.mvc.hw1.model.vo.Board;

public class BoardDao {

    ArrayList<Board> list = new ArrayList<Board>();

    public BoardDao() {
        // TODO Auto-generated constructor stub
    }

    // 1. 게시글 쓰기
    public void writeBoard(Board board) {
        list.add(board);
    }

    // 게시물의 마지막 번호 얻어오기
    public int getLastBoardNo() { // 게시물의 마지막 번호 얻어오기

        return list.get(list.size() - 1).getBoardNo();
    }

    // 2. 게시글 전체 보기
    public ArrayList<Board> displayAllList() {

        return list;
    }

    // 3_1. 게시글 한개 보기
    public Board displayBoard(int no) {
        Board board = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBoardNo() == no) {
                // 반복문을 돌리면서 list에 있는 Board객체들의 게시글 번호를 확인하고
                // 사용자가 입력했던 번호랑 일치하는게 이씨다면
                board = list.get(i);
                // 그 Board객체를 저장
                break;
            }
        }
        return board;
    }

    // 3_2. 조회수 올리기
    public void upReadCount(int no) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBoardNo() == no) {
                list.get(i).setReadCount(list.get(i).getReadCount() + 1);
                // (기존의 조회수 + 1)을 조회수로써 수정한다.
                break;
            }
        }

    }

    // 4. 게시글 제목 수정
    public void modifyTitle(int no, String title) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBoardNo() == no) {
                list.get(i).setBoardTitle(title);
                break;
            }
        }
    }

    // 5. 게시글 내용 수정
    public void modifyContent(int no, String content) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBoardNo() == no) {
                list.get(i).setBoardContent(content);
                break;
            }
        }
    }

    // 6. 게시글 삭제
    public void deleteBoard(int no) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBoardNo() == no) {
                list.remove(i);
                break;
            }
        }
    }

    // 7. 게시글 검색
    public ArrayList<Board> searchBoard(String title) {

        ArrayList<Board> searchList = new ArrayList<Board>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBoardTitle().contains(title)) {
                searchList.add(list.get(i));

                // 조회수 올리기
                list.get(i).setReadCount(list.get(i).getReadCount() + 1);
            }
        }

        return searchList;
    }

    // 8. 파일에 저장하기
    public void saveListFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("board_list.dat"))) {
            System.out.println(list);
            oos.writeObject(list);

            System.out.println("board_list.dat에 성공적으로 저장되었습니다.");

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}