package day3;

import java.util.ArrayList;
import java.util.List;

public class p63_exercise {

	private static int[] arr = {-7,-3,-2,5,8};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("부분집합의 개수:"+(1<<arr.length));
	
		
		for(int i=1; i<(1<<arr.length); i++) {
			int sum=0;
			List<Integer> subset = new ArrayList<>(); 
			
			for(int j=0; j<arr.length; j++) {
				if( (i&(1<<j)) > 0 ) {
					
					subset.add(arr[j]);
					
				}
			}
			for (Integer integer : subset) {
				sum += integer;
			}
			
			if(sum == 0) {
				System.out.println(subset);
			}
					
		}
		
		
	}

}
