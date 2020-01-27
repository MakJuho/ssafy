package algo_basic.day1;

import java.util.Scanner;

public class P84_BinarySearch {

	private static int[] ary = {2,4,7,9,11,19,23};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("찾으려는 값을 입력하세요:");
		int key = sc.nextInt();
		
		boolean rlt = binarySearch(key);
		
		System.out.println(rlt);
	}
	
	public static boolean binarySearch(int key) {
		int start = 0;
		int end = ary.length-1;
		
		while(start <= end) {
			int middle = (start+ end)/2;
			
			if(ary[middle] == key) {
				return true;
			}
			else if (ary[middle] > key) {
				end = middle-1;
			}
			else start = middle +1;
		}
		return false;
	}

}
