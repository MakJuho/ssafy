package BookStore;

public class Magazine extends Book{
	private int year;
	private int month;
	
	public Magazine(String isbn, String title, String author, String publisher, int price, String desc, int year, int month) {
		super(isbn, title, author, publisher, price, desc);
		this.year = year;
		this.month = month;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+"Magazine [year=" + year + ", month=" + month + "]";
	}

	

	
}
