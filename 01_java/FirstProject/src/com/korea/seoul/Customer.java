package com.korea.seoul;

public class Customer {

	private int num;
	String name;
	String address;
	
	// 생성자
	public Customer(int num, String name, String address) {
		super();
		this.num = num;
		this.name = name;
		this.address = address;
	}
	
	public int getNum() {
		
		return num;
	}

	
	public void setNum(int num) {
		if(num > 0)
			this.num = num;
		else
			System.out.println("not valid number...");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	
}
