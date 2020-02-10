package JungOl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class JA_1828_냉장고 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		System.setIn(new FileInputStream("res\\1828.txt"));
		Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		int[][] arr = new int[TC+1][2];
		int[] temp = new int[10271];
		
		for(int t=1; t<=TC; t++) {
			arr[t][0] = sc.nextInt()+270; // low
			arr[t][1] = sc.nextInt()+270; // high
			
			for(int i=arr[t][0]; i<arr[t][1]; i++) {
				temp[i]++;
			}
			
		}
	
		
		
	}

}
