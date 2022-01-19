package chap10.김민보.hw2.model.vo;

public class Rectangle extends Point {
	
	private int width;
	private int height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);		
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
		
	}

	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}




	public void draw() {
		super.draw();
		
		int area = width*height;
		int dulre = 2 * (width + height);
		
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + dulre);
		
	}	
}
