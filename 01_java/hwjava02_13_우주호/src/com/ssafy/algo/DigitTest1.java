package com.ssafy.algo;

import java.util.Scanner;

public class DigitTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] ary = new int[10];
		
		while(true) {
			int input = sc.nextInt();
			if( input == 0) {
				break;
			}		
			ary[input/10]++;
		}
		
		for(int i=0; i<ary.length; i++) {
			if(ary[i] !=0) {
				System.out.println(i+":"+ary[i]+"°³");
			}
		}
	}

}
