package chap15_컬렉션.김민보.mvc.hw1.model.comparator;

import java.util.Comparator;

import chap15_컬렉션.김민보.mvc.hw1.model.vo.Board;

public class AscBoardDate implements Comparator {

    public AscBoardDate() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Board && o2 instanceof Board) {
            Board b1 = (Board) o1;
            Board b2 = (Board) o2;

            return b1.getBoardDate().compareTo(b2.getBoardDate());
        }
        return 0;

    }

}
