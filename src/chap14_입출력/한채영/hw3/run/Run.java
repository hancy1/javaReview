package chap14_입출력.한채영.hw3.run;

import chap14_입출력.한채영.hw3.controller.BookManager;

public class Run {

	public static void main(String[] args) {

		BookManager bm = new BookManager();
		
		bm.fileSave();
		bm.fileRead();

	}

}
