package chap15_컬렉션.김민보.ArrayList.model.vo;

public class Book {
	
	private int bNo;
	private String title;
	private int category;
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, int category, String author) {
		super();		
		this.title = title;
		this.category = category;
		this.author = author;
	}

	public int getbNo() {
		return bNo;
	}
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	
	@Override
	public String toString() {
		return "도서 번호 : " + bNo + ", 제목 : " + title + ", 장르 : " + category + ", 저자 : " + author;
	}
	
}
