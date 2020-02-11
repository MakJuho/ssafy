package com;

class Board{
	int no;
	String title;
}

public class Test {
	public static void main(String[] args) {
		Board[] arr = new Board[2];
		//arr[0] = new Board();
		arr[0].no = 1;
		arr[0].title = "A";
		
		System.out.println(arr[0].no);
		System.out.println(arr[0].title);
	}
}
