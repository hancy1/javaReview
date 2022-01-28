package chap15_컬렉션.chap15_김민지.collection.silsub1.model.comparator;

import java.util.Comparator;

import chap15_컬렉션.chap15_김민지.collection.silsub1.model.vo.Board;

public class DescBoardNo implements Comparator{
	
	public DescBoardNo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Object o1, Object o2) { 
		if (o1 instanceof Board && o2 instanceof Board) { // instanceof : 객체가 특정 클래스에 속하는지 아닌지를 확인 가능, 상속관계도 확인해줌 여기선, o1이 Board에 속하냐? o1이 Board 의 객체인가?
			Board b1 = (Board) o1;
			Board b2 = (Board) o2;

			return b2.getBoardNo()-b1.getBoardNo(); // 내림차는 b2 - b1 큰 숫자에서 작은 숫자 빼기 , 오름차는 b1 - b2 작은 숫자에서 큰 숫자 빼기 
		}
		return 0;
	}

	

	
	

}
