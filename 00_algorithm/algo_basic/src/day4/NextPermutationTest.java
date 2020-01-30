package day4;

import java.util.Arrays;

public class NextPermutationTest {

	private static int[] nums = {1,2,3,4};
	
	public static void main(String[] args) {
		// nums의 다음 순열을 구해보자.
		
		//nextPermutation();
		
		// nums로 만들 수 있는 모든 순열을 뽑아보자.
		Arrays.sort(nums); // 정렬된 처음 상태에서 시작한다.
		do {
			System.out.println(Arrays.toString(nums));
		}while(nextPermutation());
		
		
	}

	public static boolean nextPermutation() {
		int i =0;
		
		// step1 : 뒤에서부터 nums[i]<nums[i+1]인 i 찾기
		for(i=nums.length-1-1; i>=0; i--) {
			if(nums[i] < nums[i+1])
				break;
//				System.out.println(i);
			
		}
		
		if(i<0) {
			return false;
		}
		
		
		// step2 : 뒤에서 부터 nums[i]보다 큰 첫번째 j 찾기
		int j;
		for(j=nums.length-1; j>=0; j--) {
			if(nums[i]< nums[j])
				break;
		}
		
//		System.out.println(i+" : "+j);
		
		
		// step 3 : swap
		int temp=nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		
		
		// step 4 : reverse
		for(int a = i+1, b = nums.length-1; a<b; a++, b--) {
			int tmp = nums[a];
			nums[a] = nums[b];
			nums[b] = tmp;
		}
		
		System.out.println(Arrays.toString(nums));
		
		return true;
		
	}
}
