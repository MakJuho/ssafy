package com;

public class SingletonObjectUser {

	public static void main(String[] args) {
		SingletonObject s1 = SingletonObject.getInstance();
		SingletonObject s2 = SingletonObject.getInstance();
		SingletonObject s3 = SingletonObject.getInstance();
	
		s1.go();
		s2.go();
		s3.go();
		//System.out.println(s1==s2);
		
	
	}

}
