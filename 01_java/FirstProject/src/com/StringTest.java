package com;

public class StringTest {

	public static void main(String[] args) {
		System.out.println(StaticTest.scount);
		StaticTest.go();
		
		// TODO Auto-generated method stub
		String s = "mylimeorange";
		String t = new String("mylimeorange");
		
		System.out.println(s == t);
		System.out.println(s.equals(t));
		
		s.toUpperCase();
		System.out.println(s);
		
		s.concat("gogo");
		System.out.println(s); // 원본은 수정이 안됨.
		
		s=s+"hi~";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.substring(2,6));
		System.out.println(s.substring(5));
		
		
	}

}
