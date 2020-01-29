package day3;

import java.util.ArrayList;
import java.util.List;

public class SubSetTest {

	private static char [] arr = {'A', 'B', 'C'};
	
	public static void main(String[] args) {
		System.out.println("부분집합의 개수: "+(1<<arr.length));
		
		for(int i=0; i< (1<<arr.length); i++) {
			List<Character> subset = new ArrayList<>();
			
			
//			System.out.println(i+" : "+Integer.toBinaryString(i));
			for(int j=0; j<arr.length; j++) {
				if( (i & (1<<j)) >0) {
//					System.out.print(arr[j]+",");
					subset.add(arr[j]);
				}
			}
			System.out.println();
		}
	}

}
