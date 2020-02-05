package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Calculator {

	
	private static String src = "2+(3*4)/5";
	// 연산자별 우선순위
	private static Stack<Character> st = new Stack<>();
	
	//  후위 표현식 저장할 리스트
	private static List<Character> postfixNotation = new ArrayList<>();
	
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

	
/*	static void makeCalculator() {
		1. 연산자인지 피연산자인지 확인
		2. 연산자일 경우 비교
		3. 피연산자일 경우 그대로 리스트에 입력
		int order;
		
		
		for(int i=0; i<src.length(); i++) {
			if(Character.isDigit(src.charAt(i))) {
				// 숫자인 경우
				postfixNotation.add(src.charAt(i));
				
			}else {
				// 숫자가 아닌 경우
				// 우선순위가 보다 낮은 지 확인 후, 비슷하거나 높다면(peek)으로 확인, 낮을 때까지 뺸다. 
				if(getInStackOrder(st.peek()) >=  getInStackOrder(src.charAt(i)))
					// pop()
				
					
				getInStackOrder(src.charAt(i));
				
			}
		
		}
		
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<src.length(); i++) {
			char token = src.charAt(i);
			int tokenOrder = getInStackOrder(token);
			
			if(tokenOrder == 0) {
				// 숫자
				postfixNotation.add(token);
			}else if(token == '(') {
				st.push(token);
			}else if(token == ')') {
				char top = st.pop();
				while(true) {
					
					if(top == '(') {
						break;
					}else {
						postfixNotation.add(top);
					}
					
				}
			}else {
				while(!st.isEmpty()) {
					char top = st.peek(); 
					if(getInStackOrder(top) >= tokenOrder) {
						postfixNotation.add(st.pop());
					}else {
						break;
					}
				}
				
				// 모든 정적 제거가 끝났다.
				st.push(token);
			}
			
		}
		
	 // 문장에 대한 처리 끝~
	// stack에 남은 녀석들이 있다면 pop --> add
		while(!st.isEmpty()) {
			
			postfixNotation.add(st.pop());	
		}
		System.out.println(postfixNotation);
		
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
		
		
		System.out.println("최종 연산 결과: "+calcStack.pop());
		
		/*for(int i=0; i<postfixNotation.size(); i++) {
			if(getInStackOrder(postfixNotation.get(i)) == 0) {
				st1.push((int)postfixNotation.get(i));
			}else {
				int a= st1.pop();
				int b= st1.pop();
				a 
				
			}
		}*/
		
		
		
		
	}
}
