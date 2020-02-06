package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1966_숫자를정렬하자 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\1966.txt"));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int TC = sc.nextInt();
		
		
		for(int t=1; t<=TC; t++) {
			sb.append("#").append(t).append(" ");
			int N = sc.nextInt();
			int[] item = new int[N];
			for(int i=0; i<N; i++) {
				
				item[i] = sc.nextInt();
				
			}
			
			Arrays.sort(item);
			
			for(int i=0; i<item.length; i++) {
				sb.append(item[i]).append(" ");
			}
			sb.append("\n");
//			System.out.println();
		}
		System.out.println(sb);
	}

}
