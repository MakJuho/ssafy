package SWExpert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SWEA_8931_제로 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\8931.txt"));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int TC=sc.nextInt();
		Stack <Integer> st = new Stack<>();
		
		for(int t=1; t<=TC; t++) {
		
			sb.append("#").append(t).append(" ");
			int sum=0;
			int End = sc.nextInt();
			for(int i=0; i<End; i++) {
				int item = sc.nextInt();
				if(item != 0) {
					st.push(item);
				}else {
					st.pop();
				}
			}
			
			if(st.isEmpty()) {
				sb.append(0).append("\n");
			}else {

				while(!st.isEmpty()) {
					sum+=st.pop();
				}

				sb.append(sum).append("\n");
			}
		
		}
		System.out.println(sb);
	}

}
