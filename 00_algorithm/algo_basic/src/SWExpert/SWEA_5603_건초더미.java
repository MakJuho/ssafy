package SWExpert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA_5603_건초더미 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\5603.txt"));
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);

		int TC= sc.nextInt();
		
		for(int t=1; t<=TC; t++) {
			sb.append("#").append(t).append(" ");
			int N = sc.nextInt(); // 건초더미 개수
			int []arr = new int[N];
			int tot =0, avg=0;
			int cnt=0;
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
				tot+=arr[i];
			}
			
			avg = tot/N;
			
			for(int j=0; j<N; j++) {
				cnt += Math.abs(avg-arr[j]);
//				System.out.print(avg-arr[j]+" ");
			}
			
			sb.append(cnt/2).append("\n");
		}
		System.out.println(sb);
	}

}
