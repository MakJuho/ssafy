package com.basic;

public class LoopTest {
	public static void main(String[] args) {
		
		// for
	here:	for (int i = 0; i < 5; i++) { // label;
			for (int j = 0; j < 3; j++) {
				
				if(j==1) break here;
				System.out.print(i+","+j+" ");
			}
			System.out.println();
		}
		
		/*int cnt = 0; // 초기값
		
		while (cnt < 5) { // 조건식
			
			System.out.println("*");
			cnt++; // 증감식
		}*/
		
		/*//do~while
		int k = 99;
		do {
			
			System.out.println(k);
			k++;
		}while(k < 200);*/
		
		
		
		/*//for
		for(int i=0; i<5; i++) {
			System.out.println(i + "hello");
		}
		
		System.out.println();
		
		for (int i = 5; i > 0; i--) {
			System.out.println(i + "hello");
		}
		
		*/
		
	}
}
