package chap15_컬렉션.김민보.mvc.hw1.model.comparator;

import java.util.Comparator;

import chap15_컬렉션.김민보.mvc.hw1.model.vo.Board;



public class DescBoardNo implements Comparator {
	
	public DescBoardNo() {
		
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		if (arg0 instanceof Board && arg1 instanceof Board) {
			Board b1 = (Board) arg0;
			Board b2 = (Board) arg1;

			return b2.getBoardNo()-b1.getBoardNo();
		}

		return 0;
	}

	/*@Override
	public int compare(Board b1, Board b2) {
		// TODO Auto-generated method stub
		return b2.getBoardNo()-b1.getBoardNo();
	}*/

}
