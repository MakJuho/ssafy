package algo_basic.day1;

import java.util.Scanner;

public class SWEA_1204_D2_�ֺ�����ϱ�{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int TC = sc.nextInt();
		int[] nums = new int[1000];
		
	
		for(int t=0; t<TC; t++) {
			int point=0;
			int max = Integer.MIN_VALUE;
			int[] checkBox = new int[101];
			int TC_num = sc.nextInt();
			
			sb.append("#").append(TC_num).append(" ");
			
			for(int i=0; i<nums.length; i++) {
				nums[i] = sc.nextInt();
				//System.out.println(nums[i]);
				checkBox[nums[i]]++;
			}
			
			for(int j=1; j<checkBox.length; j++) {
				//max = Math.max(max, checkBox[j]);
				if(max <= checkBox[j]) {
					max = checkBox[j];
					point = j;
				}
				
			}
			
			sb.append(point).append("\n");
		}
		
		
		
	
		
		System.out.println(sb);
	}

	
	

}
