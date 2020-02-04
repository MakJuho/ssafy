package com.object;

public class MovieTest {
	public static void main(String[] args) {
		Movie mv = new Movie();
		
		mv.title = "타이타닉";
		mv.director="봉준호";
		mv.grade = 5;
		mv.genre ="Comic";
		mv.summary = "Interesting";
		
		System.out.println(mv.title);
		System.out.println(mv.director);
		System.out.println(mv.grade);
		System.out.println(mv.genre);
		System.out.println(mv.summary);
	}

}
