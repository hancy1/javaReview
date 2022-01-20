package chap11.chap11_김민지.mvc.model.vo;

public class CookBook extends Book{
	
	private boolean coupon;
	
	public CookBook() {
		// TODO Auto-generated constructor stub
	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
		// TODO Auto-generated constructor stub
	}

	

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "CookBook [" + super.toString() + ", coupon = " + coupon + "]";
	}
	
	
	
	
	
	
	
	

}
