package chap10.김민보.hw1.model.vo;

public class Employee extends Person {
	
	private int salary;
	private String dept;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, double height, double weight, int salsry, String dept) {
		
		super(age, height, weight);		
		super.name = name;//네임 직접 접근		
		this.salary = salary;
		this.dept = dept;
		
		// TODO Auto-generated constructor stub
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	
	
	public String information() {
		return super.information() + ", 급여 : " + salary + ", 부서 : " + dept;
	}
	
}
