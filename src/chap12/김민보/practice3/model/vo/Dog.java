package chap12.김민보.practice3.model.vo;

public class Dog extends Animal{

	public String PLACE = "애견카페";
	private int weight;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}	
	
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
		// TODO Auto-generated constructor stub	
		
	}	

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(super.toString() + "몸무게는 " + weight + "kg 입니다.");
	}

}