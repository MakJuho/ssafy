package com.korea.busan;

import com.korea.seoul.Red;

public class Yellow extends Red{
	void test() {
		Yellow y = new Yellow();
		System.out.println(y.a);
		System.out.println(y.b); // 상속 관계라 가능
//		System.out.println(y.a);
	}
}
