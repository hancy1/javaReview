package chap10.한채영.hw2.model.vo;

public class Circle extends Point{

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

	@Override
	public void draw() {
		
		super.draw();
		System.out.println("면적: " + 3.14 * radius * radius);
		System.out.println("둘레: " + 3.14 * radius * 2);
	
	}

	
	
	
}
