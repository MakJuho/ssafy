package DigitalPlaza;

public class ProductTest {
	int N = 10;
	int index = 0;
	Product[] products;
	
	public ProductTest() {
		products = new Product[N];

	}
//	String name, int price, String desc, int size
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductTest pt = new ProductTest();
		TV tv = new TV("좋은 TV", 1999000, "정말 좋은 티비입니다", 1, 32);
		Refrigerator rg = new Refrigerator("좋은 냉장고", 2000000, "정말 좋은 냉장고입니다.",2, "삼성");
		
		pt.addProduct(tv);
		pt.addProduct(rg);
		
		pt.searchProduct();
		pt.searchProductUsingtag(3);
		pt.searchProductOrderByitem("좋은 TV");
		pt.searchTV();
		pt.searchRefrigerator();
		pt.removeItem(1);
		pt.getSum();
	}
	
	
	
	
	

	private void addProduct(Product pt) {
	
		products[index] = pt;
		index++;
	}
	
	private void searchProduct() {
		
		for(int i=0; i<index; i++) {
			System.out.println(products[i].toString());
		}
			
	}
	
	private void searchProductUsingtag(int tag) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for(int i=0; i<index; i++) {
			if(products[i].getTag() == tag) {
				System.out.println(products[i].toString());
				flag = true;
			}
		}
		if(flag == false)
			System.out.println("해당하는 tag는 없습니다.");
	}
	
	private void searchProductOrderByitem(String string) {
		boolean flag = false;
		for(int i=0; i<index; i++) {
			if(products[i].getName() == string) {
				System.out.println(products[i].toString());
				flag = true;
			}
		}
		if(flag == false)
			System.out.println("해당하는 title이 없습니다.");
	}
	
	private void searchTV() {
		// TODO Auto-generated method stub
		boolean flag = false;
		for(int i=0; i<index; i++) {
			if(products[i] instanceof TV) {
				System.out.println(products[i].toString());
				flag = true;
			}
		}
		if(flag == false)
			System.out.println("TV가 없습니다.");
	}
	
	private void searchRefrigerator() {
		// TODO Auto-generated method stub
		boolean flag = false;
		for(int i=0; i<index; i++) {
			if(products[i] instanceof Refrigerator) {
				System.out.println(products[i].toString());
				flag = true;
			}
		}
		if(flag == false)
			System.out.println("냉장고가 없습니다.");
	}
	
	private void removeItem(int item) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for(int i=0; i<index; i++) {
			if(products[i].getTag() == item) {
				
				System.out.println("없어진 상품:"+products[i].toString());
				products[i] = null;
				index--;
				flag = true;
			}
		}
		if(flag == false)
			System.out.println("해당하는 상품이 없습니다.");
	}
	private void getSum() {
		// TODO Auto-generated method stub
		int sum =0;
		
		for(int i=0; i<index; i++) {
			if(products[i] != null)
				sum += products[i].getPrice();
		}
		System.out.println(sum);
	}
	
}
