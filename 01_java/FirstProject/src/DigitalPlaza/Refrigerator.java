package DigitalPlaza;

public class Refrigerator extends Product {

	private String manu;
	
	public Refrigerator(String name, int price, String desc, int tag, String manu) {
		super(name, price, desc, tag);
		this.manu = manu;
		
	}

	@Override
	public String toString() {
		return super.toString()+"Refrigerator [manu=" + manu + "]";
	}
	
	
	
	
}
