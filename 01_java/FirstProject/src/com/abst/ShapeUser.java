package com.abst;

public class ShapeUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a = new int[8];
		Shape[] s = new Shape[3]; // 3칸짜리 배열 생성
		s[0] = new Circle(8);
		s[1] = new Rect(6,3);
		s[2] = new Rect(10,5);
		
		for(Shape value: s) {
			System.out.println(value.getClass().getSimpleName());
			System.out.println("area: "+value.getArea());
			System.out.println("circum: "+value.getCircum());
			System.out.println("=================================");
		}
	}

}
