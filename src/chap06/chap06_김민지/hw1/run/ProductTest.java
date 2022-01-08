package chap06.chap06_김민지.hw1.run;

import chap06.chap06_김민지.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		Product a = new Product();
		Product b = new Product();
		Product c = new Product();
		
		
		a.setProductId("ssgnote9");
		a.setProductName("갤럭시노트9");
		a.setProductArea("경기도 수원");
		a.setPrice(960000);
		a.setTax(10.0);
		
		b.setProductId("lgxnote5");
		b.setProductName("LG스마트폰5");
		b.setProductArea("경기도 평택");
		b.setPrice(780000);
		b.setTax(0.7);
		
		c.setProductId("ktsnote3");
		c.setProductName("KT스마트폰3");
		c.setProductArea("서울시 강남");
		c.setPrice(250000);
		c.setTax(0.3);
		
		System.out.println(a.information());
		System.out.println(b.information());
		System.out.println(c.information());
		
		System.out.println("=====================================================");
		
		a.setPrice(1200000);
		b.setPrice(1200000);
		c.setPrice(1200000);
		
		a.setTax(0.05);
		b.setTax(0.05);
		c.setTax(0.05);
		
		System.out.println(a.information());
		System.out.println(b.information());
		System.out.println(c.information());
	
		System.out.println("=====================================================");

		System.out.println(a.information2());
		System.out.println(b.information2());
		System.out.println(c.information2());
		

	}

}
