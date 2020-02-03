package SWExpert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SWEA_1234_비밀번호 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\1234.txt"));
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack();
		StringBuilder sb = new StringBuilder();
		
		int TC = 10;
		
		for(int t=1; t<=TC; t++) {
			int N = sc.nextInt();
			String str = sc.next();
			int []arr = new int[N];
			sb.append("#").append(t).append(" ");
			
			for(int i=0; i<N; i++) {
				if(st.isEmpty())
					st.push(Character.getNumericValue(str.charAt(i)));
				else if(st.peek() != Character.getNumericValue(str.charAt(i)))
					st.push(Character.getNumericValue(str.charAt(i)));
				else {
					st.pop();
				}
			}
			
			int st_len = st.size();
			int temp[] = new int[st_len];
			while(!st.isEmpty())
			{
				
				for(int i=st_len-1; i>=0; i--)
					temp[i] = st.pop();
				for(int i=0; i<st_len; i++) {
					sb.append(temp[i]);
				}
			}
			sb.append("\n");
			
			
			
			
		
			
		
		}
		System.out.println(sb);
		
		
		
		
	}

}
