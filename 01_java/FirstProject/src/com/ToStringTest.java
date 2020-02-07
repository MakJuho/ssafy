package com;


class Bus{
	int num;
	String color;
	String company;
	
	@Override
	public String toString() {
		return "Bus [num=" + num + ", color=" + color + ", company=" + company + "]";
	}
	
	
}

public class ToStringTest {

	public static void main(String[] args) {
		Bus b = new Bus();
		System.out.println(b);
		System.out.println(b.toString());
	}

}
