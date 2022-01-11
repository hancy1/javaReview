package chap06.김민보.hw2.run;

import 김민보.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book x = new Book();//기본 생성자 이용해서 생성 (첫번째)
		
		System.out.println(x.information()); //빈값으로 출력될듯		
		
		
		Book j = new Book(); //데이터값이용해서 객체 생성(두번쨰)
		
		
		j.setTitle("자바의정석");
		j.setPrice(20000);
		j.setDiscountRate(0.2);
		j.setAuthor("윤상섭");
		
		System.out.println(j.information());
		
		
		System.out.println("==============");
		System.out.println("수정된 결과 확인");
		//기본생성자로 출력한객체에  setter로 값수정
		
		x.setTitle("c언어");
		x.setPrice(30000);
		x.setDiscountRate(0.1);
		x.setAuthor("홍길동");
		
		System.out.println(x.information());
		System.out.println("==============");//할인율 계산해서 출력
		System.out.println("도서명 : " + x.getTitle());		
		System.out.println("할인된 가격 = " +(int) (x.getPrice()-(x.getPrice()*x.getDiscountRate())) + "원");
		System.out.println("도서명 : " + j.getTitle());		
		System.out.println("할인된 가격 = " +(int) (j.getPrice()-(j.getPrice()*j.getDiscountRate())) + "원");
		
		
	}

}
