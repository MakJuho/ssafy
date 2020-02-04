package com.korea.busan;
import com.korea.seoul.Red;

// public >> protected >> default >> private(클래스 내부에서만 접근이 가능하다.)
public class Black {
	void test() {
		Red r = new Red();
		System.out.println(r.a);
	}
}
