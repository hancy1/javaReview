package chap12.chap12_김민지.practice3.model.vo;

public class Dog extends Animal{
	
	public static final String PLACE ="애견카페"; // 밑줄 : static 대문자 : 상수 final
	private int weight;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
		// TODO Auto-generated constructor stub
	}

	protected int getWeight() {
		return weight;
	}

	protected void setWeight(int weight) {
		this.weight = weight;
	}

	protected static String getPlace() {
		return PLACE;
	}

	@Override
	public String toString() {
		return " 몸무게는 " + weight + "kg 입니다.";
	}

	@Override
	public void speak() {
		System.out.println(super.toString() + this.toString());
		
	}
	
	
	
	

}
