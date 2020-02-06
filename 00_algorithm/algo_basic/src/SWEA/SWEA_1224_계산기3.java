package SWEA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class SWEA_1224_계산기3 {


	//  후위 표현식 저장할 리스트
	private static List<Character> postfixNotation = new ArrayList<>();
	private static Stack<Character> st = new Stack<>();
	//private static String src = "2+(3*4)/5";
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("res\\1224.txt"));
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int TC = 10;
		
		for(int t=1; t<=TC; t++) {
			sb.append("#").append(t).append(" ");
			postfixNotation.clear();
			
			int len = sc.nextInt();
			String src = sc.next();
			
			for(int i=0; i<src.length(); i++) {
				
				char token = src.charAt(i);
				int tokenOrder = getInStackOrder(token);
				
				// 한글자씩 빼고 (이면 무조건 넣기, 숫자일 때도 넣기
				if(token == '(') {
					
					// 계산하면 우위 확인하기
					st.push(token);
					
				}else if(tokenOrder == 0) {
					postfixNotation.add(token);
				}else if(token == ')')
				{
					
					
					while(true) {
						char top = st.pop();
						if(top == '(')
							break;
						else {
							postfixNotation.add(top);
						}
					}
				}else {
					while(!st.isEmpty()) {
						char top = st.peek();
						if(getInStackOrder(top) >= tokenOrder){
							postfixNotation.add(st.pop());
						}else {
							break;
						}
						
					}
					
					st.push(token);
				}
			}
			
		
		
			while(!st.isEmpty()) {
				postfixNotation.add(st.pop());
			}
			//System.out.println(postfixNotation);
			
			Stack<Integer> calcStack = new Stack<>();
			
			for(Character c : postfixNotation) {
				
				if(getInStackOrder(c) == 0) {
					calcStack.push(c-'0');
				}else {
					Integer num1 = calcStack.pop();
					Integer num2 = calcStack.pop();
					if(c == '+') {
						calcStack.push(num2+num1);
						
					}else if(c == '-') {
						calcStack.push(num2-num1);
						calcStack.push(num2*num1);
					}else if(c == '*') {
						calcStack.push(num2*num1);
					}else if(c == '/') {
						calcStack.push(num2/num1);
					}
					
				}
				
			}
			
			sb.append(calcStack.pop()).append("\n");
//			System.out.println("최종 연산 결과: "+calcStack.pop());
		}
		System.out.println(sb);
		
	}
	

	public static int getInStackOrder(char c) {
		if(c=='*'||c=='/') {
			return 4;
		}else if(c=='+' || c == '-') {
			return 3;
		}else if(c=='(' || c==')') {
			return 1;
		}else {
			return 0;
		}
	}

}
