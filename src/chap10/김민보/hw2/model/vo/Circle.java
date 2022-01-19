package chap10.김민보.hw2.model.vo;

public class Circle extends Point {

	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}


	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
		
		// TODO Auto-generated constructor stub
	}


	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	

	public void draw() {
		super.draw();
		
		double area = Math.PI * radius * radius;
		double dulre = Math.PI * radius * 2;
		
	
		
		System.out.printf("면적 : %.1f\n", area);		
		System.out.printf("둘레 : %.1f\n", dulre);
		
	}	
	
	
}
