package com;

// singleton pattern class : 객체 생성을 한번만 수행하고 그 이후로는 생성된 객체를 공유해서 사용하는 방식

// singleton pattern 설계 조건 :
/* 1. field : private, static
 * 2. 생성자 : private
 * 3. public method : 객체를 생성해서 리턴해 주는 static method
*/
public class SingletonObject {
	int cnt;
	
	private static SingletonObject instance;
	private SingletonObject() {}
	
	public static SingletonObject getInstance() {
		if(instance == null) {
			instance = new SingletonObject();
		}
		return instance;
	}
	
	
	public void go() {
		System.out.println("hello, singleton!!!!"+ ++cnt);
	}
	
}
