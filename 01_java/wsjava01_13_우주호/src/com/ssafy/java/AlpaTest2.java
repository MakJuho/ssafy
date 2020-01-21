package com.ssafy.java;

public class AlpaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char startChar = 'A';
		for(int i=0; i<5; i++) {
			for(int k=4-i; k>0; k--) {
				System.out.print("  ");
			}
			for(int j=0; j<=i; j++) {
				
				System.out.print(startChar+" ");
				startChar++;
			}
			System.out.println();
		}
	}

}
