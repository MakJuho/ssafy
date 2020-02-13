package day7;

public class P416_BinarySearchTree {

	private static Node root;
	
	public static void main(String[] args) {
		int[] nums = { 9, 4, 3, 12, 15, 13, 17};
		for(int i=0; i<nums.length; i++) {
			System.out.printf("삽입 연산: %d %b%n", nums[i], addNode(nums[i]));
		}
		
		System.out.printf("%d노드: %s%n", 15, search(15));
		System.out.printf("%d노드: %s%n", 9, search(9));
		System.out.printf("%d노드 삭제 %b: %s%n", 13, deleteNode(13), search(15));
		System.out.printf("%d노드 삭제 %b: %s%n", 12, deleteNode(12), search(9));
		System.out.printf("%d노드 삭제 %b: %s%n", 9, deleteNode(9), search(6));
	}

	// v에 해당하는 노드를 추가하고 결과를 반환한다.
	public static boolean addNode(int v) {
		Node newNode = new Node(v);
		
		// 아직 root가 없었다면... 이놈이 root
		if(root == null) {
			root = newNode;
			return true;
		}
		
		Node current = root;
		while(true) { // 검색에 실패할 때까지..
			//이진 검색 트리는 동일한 값이 있을 수 없다.
			if(current.v == v) {
				return false;
			}else if(current.v > v) { // 현재 노드가 더 커서 왼쪽으로 감..
				// 왼쪽으로 가려고 하는데...
				if(current.l == null) {
					current.p = current;
					current.l = newNode;
					return true;
				}else {
					current = current.l;
				}
			}else {
				if(current.r == null) {
					current.p = current;
					current.r = newNode;
					return true;
				}else {
					current = current.r;
				}
			}
			
			
		}
	}
	
	// v에 해당하는 노드를 지우고 그 결과를 반환한다.
	public static boolean deleteNode(int v) {
		Node target = search(v);
		if(target == null) { // 없으면 당연히 못지움.
			return false;
		}else if(target.l ==null && target.r == null) {// 자식이 없을 경우
			// 부모로부터 target을 지워준다.
			if(target.p.l == target) {
				target.p.l = null;
			}else {
				target.p.r = null;
			}
			
		} else if(target.l == null || target.r == null) { // 자식중 하나가 null인 경우
			Node child = target.l == null? target.r : target.l;
			
			if(target.p.l == target) {
				target.p.l = child;
			}else {
				target.p.r = child;
			}
			
		
		}else { // 두 명의 자식이 있을 경우
			// 왼쪽의 sub tree에서 가장 큰놈 즉 오른쪽 자식이 null인 놈 찾기
			Node max = target.l;
			while(max.r != null) {
				max = max.r;
			}
			int newV = max.v;
			deleteNode(max.v); // 이 녀석 삭제는 이미 구현 완료
			target.v = newV; // 값 바꿔주기
			
		}
		
		return true;
		
	}
	
	
	
	public static Node search(int v) {
		// root가 없다면 탐색할 것도 없고...
		if(root == null) {
			return null;
		}
		// root에서부터 탐색 시작
		Node current = root;
		
		while(true) {
			if(current.v == v) {
				return current;
			}else if(current.v > v) {
				current = current.l;
			}else {
				current = current.r;
			}
		}
	}
	
	
	static class Node{
		int v;
		Node l, r, p;
		
		
		public Node(int v) {
			this.v = v;
		}


		@Override
		// 자식 객체를 그대로 쓰면 - 계속 자식의 toString 호출 -> 값으로 정리하기, nullpointer 조심
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("(").append(v).append(",")
			.append(p == null? "n":p.v).append(",")
			.append(l == null? "n":l.v).append(",")
			.append(r==null?"n":r.v).append(")");
			
			return sb.toString();
		}
		
	}
}
