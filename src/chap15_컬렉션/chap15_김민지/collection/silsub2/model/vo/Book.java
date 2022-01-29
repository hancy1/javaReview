package chap15_컬렉션.chap15_김민지.collection.silsub2.model.vo;

import java.io.Serializable;

public class Book implements Serializable, Comparable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7817544810622347438L;
	private String bNo;
	private int category;
	private String title;	
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

	public String getbNo() {
		return bNo;
	}

	public void setbNo(String bNo) {
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
		
		String str = ""; // 카테고리 분류 별
		if(category == 1) {
			str = "인문";
		}else if(category == 2) {
			str = "자연과학";
		}else if(category == 3) {
			str = "의료";
		}else {
			str = "기타";
		}
		
		return "Book [bNo=" + bNo + ", title=" + title + ", category=" + str + ", author=" + author + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		
		
		
		
		return ((Book)arg0).getTitle().compareTo(this.title); // 제목	별 오름차순 내용 구현
	}
	
	
	
	

}
