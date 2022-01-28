package chap15_컬렉션.chap15_김민지.collection.silsub1.model.comparator;

import java.util.Comparator;

import chap15_컬렉션.chap15_김민지.collection.silsub1.model.vo.Board;

public class DescBoardDate implements Comparator{
	
	public DescBoardDate() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Board && o2 instanceof Board) { 
			Board b1 = (Board) o1;
			Board b2 = (Board) o2;

			return b2.getBoardDate().compareTo(b1.getBoardDate()); // 내림차는 큰 숫자를 기준으로 비교. b2.compareto(b1) 오름차는 작은 숫자를 기준으로 비교 b1.compareto(b2)
		}
		return 0;
	}
	
	

}
