package chap10.chap10_김민지.hw1.model.vo;

public class Student extends Person{
	
	private int grade;
	private String major;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}
	

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String information() {
		return super.information() + ", 학년 ; " + grade + ", 전공 : " + major;
				
	}
	
	

}
