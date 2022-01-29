package chap15_컬렉션.한채영.collection.silsub1.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import chap15_컬렉션.한채영.collection.silsub1.model.vo.Board;

public class BoardDao {

	private ArrayList<Board> list = new ArrayList<>();

	public BoardDao() {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("board_list.dat"))){				
			
				list.addAll((ArrayList<Board>)ois.readObject());
	
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	}

	public int getLastBoardNo() {
		
		return list.get(list.size() - 1).getBoardNo();
		
	}

	public void writeBoard(Board board) {
		
		list.add(board);
	}

	public ArrayList<Board> displayAllList() {
		
		return list;
	}

	public Board displayBoard(int no) {
		
		Board b = null;
		for(int i = 0 ; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == no) {
				b = list.get(i);
				break;
			}
		}
		return b;
	}

	public void upReadCount(int no) {
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == no) {
				list.get(i).setReadCount(list.get(i).getReadCount()+1);
			}
		}
		
	}

	public void modifyTitle(int no, String title) {
		
		for(int i = 0 ; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == no) {
				list.get(i).setBoardTitle(title);
			}
		}
		
	}

	public void modifyContent(int no, String content) {
		for(int i = 0 ; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == no) {
				list.get(i).setBoardContent(content);
			}
		}
	}

	public void deleteBoard(int no) {
		for(int i = 0 ; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == no) {
				list.remove(i);
				break;
			}
		}
		
	}

	public ArrayList<Board> searchBoard(String title) {
		
		ArrayList<Board> searchList = new ArrayList<Board>();
		
		for(int i = 0 ; i < list.size(); i++) {
			if(list.get(i).getBoardTitle().contains(title)) {
				searchList.add(list.get(i));
				
				//가이드보고 한 부분.  조회수도 올려주기
				list.get(i).setReadCount(list.get(i).getReadCount() + 1);
			}
		}
		return searchList;
	}

	public void saveListFile() {
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("board_list.dat"));
			oos.writeObject(list);
			System.out.println("파일이 저장되었습니다.");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
