package algo_basic.day1;

import java.util.Scanner;

public class SWEA_2056_D1_연월일달력 {

	private static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) {
				
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb= new StringBuilder();
		
		sc = new Scanner(src);
		int TC = sc.nextInt();
		for(int t=1; t<=TC; t++) {
			sb.append("#").append(t).append(" ");
			String data = sc.next();
			String year = data.substring(0,4);
			String mStr = data.substring(4,6);
			int month = Integer.parseInt(data.substring(4,6));
			String dStr = data.substring(6);
			int day = Integer.parseInt(data.substring(6));
			if(month>0 && month < 13 && day >0 && day <= days[month]) {
				sb.append(year).append("/").append(mStr).append("/").append(dStr).append("\n");
			}else {
				sb.append(-1).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	private static String src ="5\r\n" + 
			"22220228\r\n" + 
			"20150002\r\n" + 
			"01010101\r\n" + 
			"20140230\r\n" + 
			"11111111";

	
		
	
}
