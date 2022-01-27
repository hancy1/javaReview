package chap14_입출력.김민보.hw3.run;

import chap14_입출력.김민보.hw3.controller.BookManager;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//BookManager 클래스 객체 생성 후 각 메소드를 순차적으로 실행
		
		BookManager bm = new BookManager();
		bm.fileSave();
		bm.fileRead();
		
		
	}

}
