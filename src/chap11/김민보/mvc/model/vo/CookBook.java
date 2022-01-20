package chap11.김민보.mvc.model.vo;

public class CookBook extends Book{

	private boolean coupon;
	
	public CookBook() {
		// TODO Auto-generated constructor stub
	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		// TODO Auto-generated constructor stub
		
		this.coupon = coupon;		
	}

	public boolean isCoupon() {
		return coupon;
	}
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return super.toString()+" / 쿠폰 유무 : " + coupon;
	}
	
	
	
	
	
}
