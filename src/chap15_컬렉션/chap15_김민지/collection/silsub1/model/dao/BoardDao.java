package chap15_컬렉션.chap15_김민지.collection.silsub1.model.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import chap15_컬렉션.chap15_김민지.collection.silsub1.model.vo.Board;

public class BoardDao {
	
	private ArrayList<Board> list = new ArrayList<Board>();
	
	public BoardDao() {
		// TODO Auto-generated constructor stub
	}

	public int getLstBoardNo() { // 게시글의 마지막 번호를 알아옴
		
		int lastNo = list.get(list.size()-1).getBoardNo();
		
		return lastNo;
	}

	public void writerBoard(Board board) {
		
		list.add(board);
		
	}

	public ArrayList<Board> displayAllList() {
		
		return list;
	}

	public Board displayBoard(int bNo) {
		
		Board board = null;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == bNo) {
				board = list.get(i);
				break;
				
			}
			
		}
		return board;
		
	}

	public void upReadCount(int bNo) { // 전달받은 글 번호와 일치하는 게시글의 조회수 1 올려주기
		
		for(int i = 0; i < list.size(); i++) { 
			
			if(list.get(i).getBoardNo() == bNo) {
				list.get(i).setReadCount(list.get(i).getReadCount()+1); 
				break;
			}
		}
		
	}

	public void modifyTitle(int bNo, String newTitle) {
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == bNo) {
				list.get(i).setBoardTitle(newTitle);
				break;
			}
		}
		
		
	}

	public void modifyContent(int bNo, String content) {
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == bNo) {
				list.get(i).setBoardContent(content);
				break;
			}
		}
	}

	public void deleteBoard(int bNo) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == bNo) {
				list.remove(i);
				break;
			}
			
		}
		
	}

	public ArrayList<Board> searchBoard(String title) {
		
		ArrayList<Board> b = new ArrayList<Board> ();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardTitle().contains(title)) {
				b.add(list.get(i));
				
				list.get(i).setReadCount(list.get(i).getReadCount()+1); 
				
			}
		}
		
		return b;
	}

	public void saveListFile() {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("board_list.dat"))){
			
			System.out.println(list);
			oos.writeObject(list);
						
			System.out.println("board_list.dat에 성공적으로 저장되었습니다.");
			
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	
	

}
