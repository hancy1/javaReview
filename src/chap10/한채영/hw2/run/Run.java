package chap10.한채영.hw2.run;

import chap10.한채영.hw2.model.vo.Circle;
import chap10.한채영.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		
		Circle[] cir = new Circle[2];
		Rectangle[] rec = new Rectangle[2];
		
		cir[0] = new Circle(1, 2, 3);
		cir[1] = new Circle(3, 3, 4);
		
		rec[0] = new Rectangle(-1, -2, 5, 2);
		rec[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("===== circle =====");
		
		for(Circle c : cir) {
			c.draw(); 
		}
		
		System.out.println("===== Rectangle =====");
		
		for(Rectangle r : rec) {
			r.draw(); 
		}
	}

}
