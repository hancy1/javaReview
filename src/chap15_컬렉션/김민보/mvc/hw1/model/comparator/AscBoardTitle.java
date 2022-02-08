package chap15_컬렉션.김민보.mvc.hw1.model.comparator;

import java.util.Comparator;

import chap15_컬렉션.김민보.mvc.hw1.model.vo.Board;


public class AscBoardTitle implements Comparator {

    public AscBoardTitle() {

    }

    @Override
    public int compare(Object arg0, Object arg1) {
        if (arg0 instanceof Board && arg1 instanceof Board) {
            Board b1 = (Board) arg0;
            Board b2 = (Board) arg1;

            return b1.getBoardTitle().compareTo(b2.getBoardTitle());
        }

        return 0;
    }

    /*
     * @Override
     * public int compare(Board b1, Board b2) {
     * // TODO Auto-generated method stub
     * return b1.getBoardTitle().compareTo(b2.getBoardTitle());
     * }
     */

}
