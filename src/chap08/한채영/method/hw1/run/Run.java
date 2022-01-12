package chap08.한채영.method.hw1.run;

import chap08.한채영.method.hw1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample a = new NonStaticSample();
		a.printLottoNumbers();
		a.outputChar(5, 'a');
		a.alphabette();
		a.mySubstring("apple", 2, 4);
		
	}

}
