package algo_basic.day1;

import java.util.Scanner;

public class SWEA_2068_최대수구하기 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 StringBuilder sb = new StringBuilder();
		 int []data = new int[10];
		
		 sc = new Scanner(str);
		 
		 int TC = sc.nextInt();
		 for(int t=1; t<=TC; t++) {
			 sb.append("#").append(t).append(" ");
			 int max = Integer.MIN_VALUE;
			 for(int i=0; i<data.length;i++) {
				 int num = sc.nextInt();
//				 System.out.println(sc.nextInt());
//				 data[i]=Integer.parseInt(sc.nextInt());
				 if(max < num) {
					 max = num;
				 }
			 }
			 sb.append(max).append("\n");
		 }
		 System.out.println(sb);
	}
	
	private static String str ="3\r\n" + 
			"3 17 1 39 8 41 2 32 99 2\r\n" + 
			"22 8 5 123 7 2 63 7 3 46\r\n" + 
			"6 63 2 3 58 76 21 33 8 1\r\n";
}
