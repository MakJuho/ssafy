package algo_basic.day1;

import java.util.Scanner;

public class SWEA_2058_D1_자릿수더하기 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		sc = new Scanner(src);
		int data = sc.nextInt();
		
		int sum=0;
		
		while(data%10!=0) {
			sum +=data%10;
			data = data/10;
		}
		System.out.println(sum);
	}
	
	private static String src = "6789";

	
}
