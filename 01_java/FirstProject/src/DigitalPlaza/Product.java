package DigitalPlaza;

public class Product {
	
	private String name;
	private int price;
	private int tag;

	private String desc;
	
	public Product(String name, int price, String desc, int tag) {
		super();
		this.name = name;
		this.price = price;
		this.desc = desc;
		this.tag = tag;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", desc=" + desc + ", tag=" + tag + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
