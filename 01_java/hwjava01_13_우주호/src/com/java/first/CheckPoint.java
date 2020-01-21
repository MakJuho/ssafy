package com.java.first;

import java.util.Scanner;

public class CheckPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.:");
		
		int height = myObj.nextInt(); 
		int weight = myObj.nextInt();
		
		int obesity = weight+100-height;
		
		System.out.println("비만수치는"+obesity+"입니다.");
		System.out.println("당신은 비만이군요");
		
		
	}

}
