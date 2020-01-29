package algo_basic.day1;

import java.util.Arrays;
import java.util.Comparator;

public class SortReview {
	
	public static void main(String[] args) {
		String[] src = {"dream", "is", "come", "true"};
		Arrays.sort(src);
		//System.out.println(Arrays.toString(src));
		
		
		// 글자 수의 오름차순으로 정렬
		Arrays.sort(src, Comparator.comparingInt(String::length));
//		System.out.println(Arrays.toString(src));
		
		Arrays.sort(src, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				Integer len1 = o1.length();
				Integer len2 = o2.length();
				
				if(len1.equals(len2)) {
					return o2.compareTo(o1);
				}
				
				return len1.compareTo(len2);
			}
			
		});		
		System.out.println(Arrays.toString(src));
	
		
		int[][] arr = {{1,2,3},{7,8,9},{4,5,6}};
		
		
		for(int[] row : arr) {
			System.out.println(Arrays.toString(row));
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {


			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				Integer sum_1=0;
				Integer sum_2=0;
				
				for(int i=0; i<3; i++) {
					sum_1+=o1[i];
					sum_2+=o2[i];
				}
				
//				System.out.println(sum_1.compareTo(sum_2));
				return sum_1.compareTo(sum_2);
								
//				return 0;
			}
		
		
		});
		
		for(int[] row : arr) {
			System.out.println(Arrays.toString(row));
		}
		
		
		
		
		
	}
	
}
