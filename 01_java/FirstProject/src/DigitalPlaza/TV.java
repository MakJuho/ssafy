package DigitalPlaza;

public class TV extends Product {

	private int size;
	
	public TV(String name, int price, String desc, int tag, int size) {
		super(name, price, desc, tag);
		this.size = size;
	
	}

	@Override
	public String toString() {
		return super.toString()+"TV [size=" + size + "]";
	}
	
	
	
}
