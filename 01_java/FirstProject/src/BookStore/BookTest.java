package BookStore;

import java.util.Arrays;

public class BookTest {
	int N = 5;
	int index=0; 
	Book[] books;
	
	
	public BookTest(){
		books = new Book[N-1];
	}
	
	
	public static void main(String[] args) {
		BookTest b = new BookTest();
		Novel b1 = new Novel("1111","어린왕자","작가1","출판사1",1,"설명1","판타지");
		Novel b2 = new Novel("2222","노인과바다","작가2","출판사2",2,"설명2","판타지");
		Magazine b3 = new Magazine("3333","잡지","작가3","출판사3",3,"설명3",10,5);
		
		b.addBook(b1);
		b.addBook(b2);
		b.addBook(b3);
		
		b.getAllBooks();
		b.findByIsbn("3333");
		b.findByTitle("노인과바다");
		b.findByPublisher("출판사2");
		b.findByPrice(0);
	
		
	}
	
	public void addBook(Book book) {
		books[index] = book;
		index++;
	}
	
	public Book[] getAllBooks() {
		
		for(int i=0; i<index; i++) {
			System.out.println("============="+(i+1)+"번째================");
			System.out.println(books[i].toString());
				
				
		}
	
		return books;
	}
	
	public Book findByIsbn(String isbn) {
		for(int i=0; i<index; i++) {
			if(books[i].getIsbn().equals(isbn)) {
				System.out.println("찾는 isbn값은 "+isbn+"입니다.");
				return null;
			}	
		}
		
		System.out.println("해당 isbn을 같는 책은 존재하지 않습니다.");

		return null;
	}
	
	public Book[] findByTitle(String Title) {
		

		boolean flag = false;
		
		for(int i=0; i<index; i++) {
			if(books[i].getTitle().equals(Title)) {
				System.out.println(books[i].toString());
				flag = true;
			}
			
		}
		
		if( flag == false)
			System.out.println("해당 title과 같은 책은 존재하지 않습니다.");
		return null;
	}
	
	public Book[] findByPublisher(String publisher) {
		boolean flag = false;
		for(int i=0; i<index; i++) {
			if(books[i].getPublisher().equals(publisher)) {
				System.out.println(publisher);
				flag =true;
			}	
		}
		if( flag == false)
			System.out.println("해당 Publisher를 같는 책은 존재하지 않습니다.");
		
		return null;
	}
	
	public Book[] findByPrice(int price) {
		
		boolean flag = false;
		for(int i=0; i<index; i++) {
			if(books[i].getPrice()<=price) {
				System.out.println(books[i].getTitle());
				flag = true;
			}	
		}
		if( flag == false)
			System.out.println("해당 가격의 책은 존재하지 않습니다.");
		
		
		return null;
	}
	
	
}	
