package com;

class Book{
	int num;
	String title;
	
	public Book(int num, String title) {
		super();
		this.num = num;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [num=" + num + ", title=" + title + "]";
	}

	@Override
	public int hashCode() {
		
		
		return 999;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj != null && obj instanceof Book) {
			Book b = (Book)obj;
			if(num == b.num && title.equals(b.title)) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
}

public class HashEqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1 = new Book(111, "Hello Java");
		Book b2 = new Book(111, "Hello Java");
		
		
		System.out.println(b1 ==b2);
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
			
	}

}
