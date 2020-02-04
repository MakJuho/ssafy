package com.object;

public class BonusTest {

	void printBonus(Employee who) {
		System.out.println(who.getBonus());
	}
	
	/*void printBonus(Manager who) {
		System.out.println(who.getBonus());
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee q = new Employee(300, "kim", 4000);
		Employee x = new Manager(200, "lee", 5000, 11);
		//Truck t = q;
		
		Manager z = (Manager)x;
		System.out.println(z.getBonus());
		
		Manager q2 = (Manager)q;
		System.out.println(q2.getBonus());
		/*
		Employee tom = new Employee(123, "tom LEE", 3000);
		System.out.println(tom.getBonus());
//		System.out.println(getBonus());
	
		Manager molly = new Manager(200, "lee", 5000, 11);
		System.out.println(molly.getBonus());
		
		BonusTest bt = new BonusTest();
		bt.printBonus(tom);
		bt.printBonus(molly);*/
	}
	
	
}
