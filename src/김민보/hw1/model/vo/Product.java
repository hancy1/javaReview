package 김민보.hw1.model.vo;

public class Product {
	
	//클래스
	
	//필드
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;		
	
	//기본생성자
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Product(String productId, String productName, String productArea, int price, double tax) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}


	//세터게터
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductArea() {
		return productArea;
	}
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}




	//출력(information)


	public String information() {
		
		String info = productId + " "+ productName +" " +  productArea + " " + price + " " + tax + " ";
		return info;
	}
}
