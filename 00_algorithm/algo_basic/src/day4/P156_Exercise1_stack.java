package day4;

import java.util.Stack;

public class P156_Exercise1_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.push(100);
		stack.push(200);

		System.out.println(stack.peek()+" : "+stack.size());
		
		System.out.println(stack.pop()+" : "+stack.size());

		System.out.println(stack.pop()+" : "+stack.size());
		
//		System.out.println(stack.pop()+" : "+stack.size());
		
		if(!stack.isEmpty()) {
			System.out.println("아직 있쓰...");
		}else {
			System.out.println("비었으..");
		}
		
	}

}
