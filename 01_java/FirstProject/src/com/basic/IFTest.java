package com.basic;

public class IFTest {

	public static void main(String[] args) {
		
		boolean a = true, b= false, c=true;
		
		if(a&c)
			System.out.println("level-1");
		
		if(a|b)
			System.out.println("level-2");
		
		if(a&b)
			System.out.println("level-3");
		
		int d=3, e=5;
		
		if(d++>3 && e++>4){
			System.out.println(d);
			System.out.println(e);
		}
		
		System.out.println(d);
		System.out.println(e);
		
		/*int a = 88, b =90;
		

		
		if (a>b)
			System.out.println("class-1");
		
		else if(a<b)
			System.out.println("class-2");
		
		else
			System.out.println("class-3");
		
		// 3항 연산자 ?
		int x = 100, y = 70;
		
		System.out.println((x>y)? "ok":"cancel"); 
		*/
		
		
	}

}
