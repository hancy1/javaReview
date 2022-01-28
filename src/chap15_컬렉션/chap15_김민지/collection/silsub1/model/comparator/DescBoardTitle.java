package chap15_컬렉션.chap15_김민지.collection.silsub1.model.comparator;

import java.util.Comparator;

import chap15_컬렉션.chap15_김민지.collection.silsub1.model.vo.Board;

public class DescBoardTitle implements Comparator{
	
	public DescBoardTitle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Board && o2 instanceof Board) { 
			Board b1 = (Board) o1;
			Board b2 = (Board) o2;

			return b2.getBoardTitle().compareTo(b1.getBoardTitle());
		}
		return 0;
	}
	

}
