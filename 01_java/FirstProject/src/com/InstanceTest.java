package com;


class Animal{}
class Mammal extends Animal{}
class Tiger extends Animal{}
class Tree {}

public class InstanceTest {

	public static void main(String[] args) {
		
		Animal t = new Mammal();
		
		if(t instanceof Tiger) {
			System.out.println("instanceof Animal");
		}
		else if(t instanceof Mammal) {
			System.out.println("instanceof Mammal");
		}
		else if(t instanceof Animal) {
			System.out.println("instanceof Tree");
		}
		
		
	}

}
