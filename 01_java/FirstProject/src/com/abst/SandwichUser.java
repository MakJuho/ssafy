package com.abst;

public class SandwichUser {
	public static void main(String[] args) {
		Sandwich[] sw = new Sandwich[2];
		sw[0] = new shrimp();
		sw[1] = new eggmayo();
		
		for(Sandwich value: sw) {
			System.out.println(value.getClass().getSimpleName());
			value.make();
			value.nutrition();
			value.calorie();
		}
	}
}
