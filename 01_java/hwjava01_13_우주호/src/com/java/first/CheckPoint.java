package com.java.first;

import java.util.Scanner;

public class CheckPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("Ű�� �����Ը� �Է����ּ���.:");
		
		int height = myObj.nextInt(); 
		int weight = myObj.nextInt();
		
		int obesity = weight+100-height;
		
		System.out.println("�񸸼�ġ��"+obesity+"�Դϴ�.");
		System.out.println("����� ���̱���");
		
		
	}

}
