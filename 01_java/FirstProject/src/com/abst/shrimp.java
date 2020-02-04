package com.abst;

public class shrimp extends Sandwich {

	@Override
	void make() {
		// TODO Auto-generated method stub
		System.out.println("새우 5마리, 치즈 2장, 스위트 칠리");
	}

	@Override
	public void nutrition() {
		// TODO Auto-generated method stub
		System.out.println("당류: 5, 단백질: 12, 포화지방: 1, 나트륨: 355");
	}

	@Override
	public void calorie() {
		// TODO Auto-generated method stub
		System.out.println("칼로리: 253");
		
	}

}
