package com.object;
class Truck{}

// super class, 부모 클래스
class Parent{
	String name = "Tom";
	String address = "seoul";
	
	// 생성자
	Parent() {
		System.out.println("Parent 생성자");
		System.out.println(getClass());
	}
	
	
	void printName() {
		System.out.println("name:"+name);
	}
	
	void printAddress() {
		System.out.println("address:"+address);
	}
}

// subclass, 자식 클래스
public class Child extends Parent{
	int age = 25;
	
	Child(){
		System.out.println("Child 생성자");
	}
	
	// method overriding 부모로부터 상속받은 메소드를 자식 클래스에 맞게 재정의 함.
	/*void printName() {
		System.out.println("name: Tomson");
	}*/
	
	void callSuper() {
		super.printName(); // 부모의 printName() 사용. static method 안에서는 호출이 안됨.
		this.printName(); // 
	
	}
	
	@Override // annotation : 부모 메소드와 동일해야 되는것 (리턴타입, 메소드이름, 파라미터 리스트)
	protected void printName() {
		System.out.println("name: Tomson");
	}

	public static void main(String[] args) {
		
		
		Child c = new Child();
		Object c3 = new Child();
		Parent c2 = new Child();
		Child c1 = new Child();
		
		
		c.printName();
		c.callSuper();
		c.printAddress();
		
		
	}
}
