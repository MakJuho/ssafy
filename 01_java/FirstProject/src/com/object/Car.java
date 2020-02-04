package com.object;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Car {

	int num;
	String owner;
	String model;
	
	/*Car() {
		num = 1111;
		owner = "juho";
		model = "maserati";
	}*/
	
	// this() : 생성자 안에서 다른 생성자 호출.
	public Car(){
		
		//this(0);
	}
	
	public Car(int num) {
		this(num, "xyz");
	}
	
	public Car(int num, String owner) {
//		this.num = num;
//		this.owner = owner;
		this(num, owner, "anonymous");
	}
	
	public Car(int num, String owner, String model) {
		this.num = num;
		this.owner = owner;
		this.model = model;
	}

	// method
	void run() {
		
		System.out.println("run run ...");
	}
	
	



	void stop() {
		System.out.println("stop");
		
	}
	
	void info() {
		// field값 출력
		System.out.println("num: "+num);
		System.out.println("owner: "+owner);
		System.out.println("model: "+model);
		System.out.println("==================");
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(4570);
		Car c3 = new Car(6656, "maserati");
		Car c4 = new Car(7780, "Benz", "Woo");
		
		c1.info();
		c2.info();
		c3.info();
		c4.info();
		
		Frame f = new Frame("Test");
		f.setLayout(new FlowLayout());
		Checkbox cb1 = new Checkbox("one");
		Checkbox cb2 = new Checkbox("two");
		Checkbox cb3 = new Checkbox("three");
		
		
		Button b = new Button("ok");
		Button c = new Button("cancel");
		
		
		f.add(b); // 창에 버튼 추가
		f.add(c);
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		
		f.setSize(500, 500);
		f.setVisible(true);
		
		
	}
}
