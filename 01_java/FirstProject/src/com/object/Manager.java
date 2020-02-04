package com.object;

class Employee{
	int num;
	String name;
	int salary;

	// 생성자 추가
	//public Employee() {}

	public Employee(int num, String name, int salary) {
	
		this.num = num;
		this.name = name;
		this.salary = salary;
	}

	double getBonus() {
		//salary *2
		return salary*0.1;
	}
	
}
public class Manager extends Employee {
	
	int mcode;
	
	public Manager(int num, String name, int salary, int mcode) {
		super(num, name, salary); // super() 부모의 생성자 호출
		this.mcode = mcode;
	}

	@Override
	double getBonus() {
		// TODO Auto-generated method stub
		return salary*0.3;
	}
	
	
	
}
