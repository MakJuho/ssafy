package com.abst;

public class eggmayo extends Sandwich {
	
	
	@Override
	void make() {
		// TODO Auto-generated method stub
		System.out.println("에그마요 2스쿱, 치즈 2장, 허니 머스타드, 스위트칠리");
	}

	@Override
	public void nutrition() {
		// TODO Auto-generated method stub
		System.out.println("당류: 7, 단백질: 17, 포화지방: 5, 나트륨: 450");
		
	}

	@Override
	public void calorie() {
		// TODO Auto-generated method stub
		System.out.println("칼로리 480");
	}
	
	
}
