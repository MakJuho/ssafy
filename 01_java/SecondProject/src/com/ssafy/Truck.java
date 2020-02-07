package com.ssafy;

public class Truck extends Car{
	
	int ton;

	public Truck(String num, String model, int price, int ton) {
		super(num, model, price);
		this.ton = ton;
	}
	
}

