package algo_basic.day1;

import java.util.Scanner;

public class SWEA_2050_D1_알파벳을숫자로변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
//		sc = new Scanner(str);
		String str = sc.next();
//		System.out.println(str);
//		System.out.println(str.length());
		for(int i=0; i<str.length(); i++) {
//			System.out.println(str.charAt(i));
			int rlt = str.charAt(i)-'A'+1;
			System.out.print(rlt+" ");
		}
		
		
	}
	
	private static String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	

}
