package chap14_입출력.chap14_김민지.hw3.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7809622915283643616L;
	private String title;
	private String author;
	private int price;
	private Calendar dates;
	private double discount;
	
	public Book(String title, String author, int price, Calendar dates, double discount) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discount = discount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDates() {
		return dates;
	}

	public void setDates(Calendar dates) {
		this.dates = dates;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() { // 결과 출력하기 위해 toString 설정
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 출간 "); // 날짜 형식 세팅
		String str=sdf.format(dates.getTime()); // sdf.format(날짜 가져오기)
		return title+" "+author+" "+price+" "+str + discount;
	}
	
	

	
}
