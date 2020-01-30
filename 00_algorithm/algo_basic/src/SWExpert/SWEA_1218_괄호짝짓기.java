package SWExpert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SWEA_1218_괄호짝짓기 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\1218.txt"));
		Scanner sc = new Scanner(System.in);
		
		Stack<Character> st_1 = new Stack<>();

		
		int TC = 10;
		for(int t=1; t<=TC; t++) {
			int cnt = sc.nextInt();
			String item = sc.next();
			
			
			for(int i=0; i<cnt; i++) {
//				System.out.println(item.charAt(i));
				if(item.charAt(i) == '(') {
					st_1.push(item.charAt(i));
				}else if(item.charAt(i) == ')') {
					if(!st_1.isEmpty()) {
						st_1.pop();
					}
				}
				
								
			}
			if(st_1.isEmpty() && st_2.isEmpty() && st_3.isEmpty() && st_4.isEmpty()) {
				System.out.println(1);
			}else
				System.out.println(0);
//			System.out.println(item);
			
		}
		
	}

}
