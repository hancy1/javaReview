package chap06.chap06_김민지.hw2.run;

import chap06.chap06_김민지.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book a = new Book();
		Book b = new Book();
		
		b.setTitle("자바의정석");
		b.setPrice(20000);
		b.setDiscountRate(0.2);
		b.setAuthor("윤상섭");
		
		System.out.println(a.information());
		System.out.println(b.information());
		
		System.out.println("=============================");
		
		System.out.println("수정된 결과 확인");
		
		a.setTitle("C언어");
		a.setPrice(30000);
		a.setDiscountRate(0.1);
		a.setAuthor("홍길동");
		
		System.out.println(a.information());
		
		System.out.println("=============================");
		
		System.out.println(a.information2());
		System.out.println(b.information2());

	}

}
