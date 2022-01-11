package 김민보.hw1.run;

import 김민보.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//객체할당
		Product g = new Product();
		
		g.setProductId("ssgnote9");
		g.setProductName("갤럭시노트9");
		g.setProductArea("경기도 수원");
		g.setPrice(960000);
		g.setTax(10.0);
		
		
		System.out.println(g.information());
		
		
		Product l = new Product();
		l.setProductId("lgxnote5");
		l.setProductName("LG스마트폰5");
		l.setProductArea("경기도 평택");
		l.setPrice(780000);
		l.setTax(0.7);
		
		System.out.println(l.information());
		
		
		Product k = new Product();
		k.setProductId("ktsnote3");
		k.setProductName("KT스마트폰3");
		k.setProductArea("서울시 강남");
		k.setPrice(250000);
		k.setTax(0.3);
		
		System.out.println(k.information());
		
		
		
		//가격,세율 바꾸기~!
		
		System.out.println("=======================================");
		
		g.setPrice(1200000);
		g.setTax(0.05);
		
		l.setPrice(1200000);
		l.setTax(0.05);
		
		k.setPrice(1200000);
		k.setTax(0.05);
		
		
		System.out.println(g.information());
		System.out.println(l.information());
		System.out.println(k.information());
	
		System.out.println("=======================================");
		
		System.out.println("상품명 = " + g.getProductName() );
		System.out.println("부가세 포함 가격 = " + (int)(g.getPrice()+ g.getPrice()*g.getTax()) + "원");
		
		System.out.println("상품명 = " + l.getProductName() );
		System.out.println("부가세 포함 가격 = " + (int)(l.getPrice()+ l.getPrice()*l.getTax()) + "원");
		
		System.out.println("상품명 = " + k.getProductName() );
		System.out.println("부가세 포함 가격 = " + (int)(k.getPrice()+ k.getPrice()*k.getTax()) + "원");
		
	}
		
		
	

}
