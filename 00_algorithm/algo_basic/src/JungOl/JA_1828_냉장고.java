package JungOl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JA_1828_냉장고 {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		
		System.setIn(new FileInputStream("res\\1828.txt"));
		Scanner sc = new Scanner(System.in);
		
		
		int TC = sc.nextInt();
		int[][] arr = new int[TC][2];
		
		for(int t=1; t<=TC; t++) {
			arr[t][0] = sc.nextInt(); // low
			arr[t][1] = sc.nextInt(); // high
			
			
			
		}
	
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1 < o2) {
					
				}
				
				return 0;
			}
			
		});
		
		
		
	}

	

}
