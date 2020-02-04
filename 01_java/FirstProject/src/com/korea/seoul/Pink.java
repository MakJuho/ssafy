package com.korea.seoul;

import com.object.Car;

// same package, sub class
public class Pink extends Red {
	void test() {
		Pink p = new Pink();
		System.out.println(p.a);
		System.out.println(p.b);
		System.out.println(p.c);
		
		Car c = new Car();
		Customer jane = new Customer(123, "jane Kim", "la");
		jane.setNum(-123);
		System.out.println(jane.getNum());
		
		jane.setAddress("seoul");
		System.out.println(jane.getAddress());
		
	}
	

}
