package com.object;

public class Circle {
	int r;

	public Circle() {
		this(0);
	}

	public Circle(int r) {
		this.r = r;
	}
	
	
	// 생성자(default, r)
	// method
	
	double getCircum(){ // 원 둘레
		return 2*Math.PI*r;
	}
	
	double getArea(){ // 원 면적
		return Math.PI*r*r;
	}
	
}
