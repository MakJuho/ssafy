package com.basic;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 60;
		switch (score) { // long�� �� ������(char, short, int, byte), String���� ����
	
			case 90:
				System.out.println("level A");
				break;
			
			case 80:
				System.out.println("level B");
				break;
			
			case 70:
				System.out.println("level C");
				break;
				
			case 60:
				System.out.println("level D");
				break;
	
			default:
				System.out.println("level F");
				break;
		}
	}

}
