package algo_basic.day1;

import java.util.Arrays;

public class P43_countingSort {
	
	private static int[] nums = {0, 4, 1, 3, 1, 2, 4, 1};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max =0;
		for(int i=0; i<nums.length; i++) {
			max = Math.max(max,  nums[i]);
		}
		int[] counts = new int[max+1];
		
		for(int i=0; i<nums.length; i++) {
			counts[nums[i]]++;
		}
		
		for(int i=0; i<counts.length-1;i++) {
			counts[i+1] = counts[i] + counts[i+1];
		}
		
		int[] temp = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			int num = nums[i];
			int idx = counts[num]-1;
			temp[idx] = num;
			counts[num]--;
		}
		
		System.out.println(Arrays.toString(temp));

	}

}
