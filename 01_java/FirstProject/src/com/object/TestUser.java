package com.object;

public class TestUser {
	public static void main(String[] args) {
			
			Test t = new Test(); // 객체 생성
			Test t2 = new Test();
			
			// t를 사용
			t.go();
			System.out.println(t.num);
			System.out.println(t.name);
			System.out.println(t.flag);
			System.out.println(t.d);
			
			t.num = 2;
			
			t.stop();
			t.stop();
			t.stop();
			t.stop();
			t.stop();
		}
}
