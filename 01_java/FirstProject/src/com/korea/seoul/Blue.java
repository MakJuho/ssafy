package com.korea.seoul;
// same package
// 패키지가 같으면 private만 빼고 다 접근 가능.
public class Blue {
	void test() {
		Red r = new Red();
		System.out.println(r.a);
		System.out.println(r.b);
		System.out.println(r.c);
	}
}
