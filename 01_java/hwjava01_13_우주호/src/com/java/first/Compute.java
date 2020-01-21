package com.java.first;

import java.util.Scanner;

public class Compute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력 해주세요:");
		
		int A = myObj.nextInt(); 
		int B = myObj.nextInt();
		System.out.println("곱 ="+A*B);
		System.out.println("몫 ="+A/B);
		
		
	}

}
