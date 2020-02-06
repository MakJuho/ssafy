package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SWEA_1218_괄호짝짓기 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res\\1218.txt"));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Character> st = new Stack<>();

		int TC = 10;
		for(int t=1; t<=TC; t++) {
			sb.append("#").append(t).append(" ");
			while(!st.isEmpty()) {
				st.pop();
			}
			int cnt = sc.nextInt();
			boolean isBreak = false;
			String item = sc.next();
			
			
			for(int i=0; i<cnt; i++) {
				
//				System.out.println(item.charAt(i));
				
				// 왼쪽 괄호를 stack에 쌓기
				if(item.charAt(i) == '(' || item.charAt(i) == '{' || item.charAt(i) == '<' 
						|| item.charAt(i) == '[') {
					st.push(item.charAt(i));
				}
				// 오른쪽 괄호를 stack에서 맨위에 peek으로 확인 후, pop으로 제거
				else {
					if(st.peek() == '(' && item.charAt(i) == ')') {
						st.pop();
					}else if(st.peek() == '{' && item.charAt(i) == '}') {
						st.pop();
					}else if(st.peek() == '<' && item.charAt(i) == '>') {
						st.pop();
					}else if(st.peek() == '[' && item.charAt(i) == ']') {
						st.pop();
					}else {
						sb.append(0).append("\n");
						isBreak = true;
						break;
					}
				}
					
			}
			// isEmpty로 확인 후 비어있을 경우 , 1 출력
			if(st.isEmpty() && !isBreak) {
				sb.append(1).append("\n");
			}else if(!st.isEmpty() && !isBreak){
				sb.append(0).append("\n");
			}
			
		}
		
		System.out.println(sb);
		
	}

}
