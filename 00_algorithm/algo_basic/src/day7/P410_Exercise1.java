package day7;

import java.util.Arrays;

public class P410_Exercise1 {

	private static int V = 13;
	private static String src ="1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13";
	private static Node [] tree = null;
	

	public static void main(String[] args) {
		makeTree();
		preorder(tree[1]);
	}
	
	private static Node getNode(int v) {
		if(tree[v] == null) {
			tree[v] = new Node(v);
		}
		
		return tree[v];
		
	}
	
	private static void preorder(Node node) {
		if(node != null) {
			
			preorder(node.l);
			System.out.println("node:"+node.v);
			preorder(node.r);
			
		}
	}
	
/*	private static void inorder(Node node) {
		if(node != null) {
			
			System.out.println("node:"+node.v);
			preorder(node.l);
			preorder(node.r);
			
		}
	}*/
	
	private static void makeTree() {
		// tree는 1번부터 시작한다.
		tree = new Node[V+1];
		String[] splited = src.split(" ");
		
		for(int i=0; i<splited.length; i+=2) {
			int parent = Integer.parseInt(splited[i]);
			int child = Integer.parseInt(splited[i+1]);
			System.out.println(parent+" : "+ child);
			
			Node pNode = getNode(parent);
			Node cNode = getNode(child);
			
			if(pNode.l==null) {
				pNode.l = cNode;
			}else {
				pNode.r = cNode;
			}
			
		}
		System.out.println(Arrays.toString(tree));
	}
	
	
	static class Node{
		int v;
		Node l, r;
		
		
		public Node(int v) {
			this.v = v;
		}


		@Override
		// 자식 객체를 그대로 쓰면 - 계속 자식의 toString 호출 -> 값으로 정리하기, nullpointer 조심
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("(").append(v).append(",")
			.append(l == null? "n":l.v).append(",")
			.append(r==null?"n":r.v).append(")");
			
			return sb.toString();
		}
		
	}
	
	
	

}
