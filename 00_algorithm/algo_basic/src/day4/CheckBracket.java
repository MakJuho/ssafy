package day4;

import java.util.Stack;

public class CheckBracket {

	private static String src = "()())()))";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<src.length(); i++) {
			
			if(src.charAt(i) == ')') {
				if(st.isEmpty()) {
					System.out.println("invalid");
					System.exit(0);
				}else if(st.peek() == '(') {
					st.pop();
				}

			}else if(src.charAt(i) == '('){
				st.push(src.charAt(i));
			}
			
		}
		if(st.isEmpty()) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
	}

}
