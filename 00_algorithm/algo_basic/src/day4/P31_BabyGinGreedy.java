package day4;

import java.util.Arrays;

public class P31_BabyGinGreedy {

	private static String[] data = {"667767", "054060", "101123", "235777"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String str : data) {
			int [] counts = new int[10];
			for(int c=0; c<str.length(); c++) {
				int num = str.charAt(c) -'0';
				counts[num]++;
			}
			
//			System.out.println(str+" : "+Arrays.toString(counts));
		
		
			int cnt = 0;
			
			for(int i=0; i<counts.length; i++) {
				if(counts[i]>=3) {
					cnt++;
					counts[i]-=3;
					i--;			// 다시 이 칸에서부터 봐야해!! 4였다면..
				}else if(counts[i]>0 && counts[i+1]>0 && counts[i+2]>0) {
					cnt++;
					counts[i]-=1;
					counts[i+1]-=1;
					counts[i+2]-=1;
					i--;
				}
			}
			
			if(cnt == 2) {
				System.out.println(str+"은 Baby Gin");
			}else {
				System.out.println(str+"은 Baby Gin이 아님");
			}
		}
		
		
		
		
	}

}
