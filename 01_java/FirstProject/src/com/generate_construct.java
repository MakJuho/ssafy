package com;

public class generate_construct {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Child(30);
	}

}

class Child extends Parent{
	public Child() {
		System.out.println("C");
	}
	public Child(int n) {
		super(77);
		System.out.println("D");
	}
}

class Parent{
	public Parent() {
		System.out.println("A");
	}
	public Parent(int k) {
		this();
		System.out.println("B");
	}
}

