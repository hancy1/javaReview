package chap10.김민보.hw2.run;

import chap10.김민보.hw2.model.vo.Circle;
import chap10.김민보.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circles[] = new Circle[2];
		
		circles[0] = new Circle(1, 2, 3);
		circles[1] = new Circle(3, 3, 4);
		
		
		Rectangle recs[] = new Rectangle[2];
		
		recs[0] = new Rectangle(-1, -2, 5, 2);
		recs[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("===== circle =====");
		//향상된 for문 이용하기
		
		for(Circle c : circles)
			c.draw();		
		
		
		
		System.out.println("===== rectangle =====");
		
		for(Rectangle r : recs)
			r.draw();
		
		
	}

}
