package algo_basic.day1;

import java.util.Arrays;
import java.util.Scanner;

public class sort {

	private static int[] nums = {55,7,78,12,42};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
//		for(int i=0; i<nums.length; i++) {
//			sc = nums[i];
//		}
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length-1; j++) {
				if(nums[j]> nums[j+1]) {
					swap(j, j+1);
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		
	}
	
	public static void swap(int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

}