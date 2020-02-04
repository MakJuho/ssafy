package com.object;

public class Test {

	// data, field, attribute, 전역변수
	// 객체 생성 시 default 값으로 setting
	int num;
	String name;
	boolean flag;
	double d;
	
	// 생성자(클래스 명과 동일 , 리턴 타입이 없어야됨, 객체 생성시에 자동호출 )
	public Test() {
	}
	
	
	// method
	void go() {
		int a =0;
		System.out.println("hello..."+a);
	}

	
	void stop() { 
		System.out.println(flag);
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		
		Test t = new Test(); // 객체 생성
		
		// t를 사용
		t.go();
		System.out.println(t.num);
		System.out.println(t.name);
		System.out.println(t.flag);
		
		t.stop();
		t.stop();
		t.stop();
		t.stop();
		t.stop();
	}
}
