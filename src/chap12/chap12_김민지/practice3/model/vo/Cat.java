package chap12.chap12_김민지.practice3.model.vo;

public class Cat extends Animal{
	
	private String location;
	private String color;
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
		// TODO Auto-generated constructor stub
	}


	

	protected String getLocation() {
		return location;
	}



	protected void setLocation(String location) {
		this.location = location;
	}



	protected String getColor() {
		return color;
	}



	protected void setColor(String color) {
		this.color = color;
	}



	@Override
	public void speak() {
		System.out.println(super.toString() + " " + location + "에 서식하며, 색상은 " + color + "입니다.");
		
	}
	
	

}
