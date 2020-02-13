package day7;

public class P416_BinarySearchTree {

	private static Node root;
	
	public static void main(String[] args) {
		int[] nums = { 9, 4, 3, 12, 15, 13, 17};
		for(int i=0; i<nums.length; i++) {
			System.out.printf("���� ����: %d %b%n", nums[i], addNode(nums[i]));
		}
		
		System.out.printf("%d���: %s%n", 15, search(15));
		System.out.printf("%d���: %s%n", 9, search(9));
		System.out.printf("%d��� ���� %b: %s%n", 13, deleteNode(13), search(15));
		System.out.printf("%d��� ���� %b: %s%n", 12, deleteNode(12), search(9));
		System.out.printf("%d��� ���� %b: %s%n", 9, deleteNode(9), search(6));
	}

	// v�� �ش��ϴ� ��带 �߰��ϰ� ����� ��ȯ�Ѵ�.
	public static boolean addNode(int v) {
		Node newNode = new Node(v);
		
		// ���� root�� �����ٸ�... �̳��� root
		if(root == null) {
			root = newNode;
			return true;
		}
		
		Node current = root;
		while(true) { // �˻��� ������ ������..
			//���� �˻� Ʈ���� ������ ���� ���� �� ����.
			if(current.v == v) {
				return false;
			}else if(current.v > v) { // ���� ��尡 �� Ŀ�� �������� ��..
				// �������� ������ �ϴµ�...
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
	
	// v�� �ش��ϴ� ��带 ����� �� ����� ��ȯ�Ѵ�.
	public static boolean deleteNode(int v) {
		Node target = search(v);
		if(target == null) { // ������ �翬�� ������.
			return false;
		}else if(target.l ==null && target.r == null) {// �ڽ��� ���� ���
			// �θ�κ��� target�� �����ش�.
			if(target.p.l == target) {
				target.p.l = null;
			}else {
				target.p.r = null;
			}
			
		} else if(target.l == null || target.r == null) { // �ڽ��� �ϳ��� null�� ���
			Node child = target.l == null? target.r : target.l;
			
			if(target.p.l == target) {
				target.p.l = child;
			}else {
				target.p.r = child;
			}
			
		
		}else { // �� ���� �ڽ��� ���� ���
			// ������ sub tree���� ���� ū�� �� ������ �ڽ��� null�� �� ã��
			Node max = target.l;
			while(max.r != null) {
				max = max.r;
			}
			int newV = max.v;
			deleteNode(max.v); // �� �༮ ������ �̹� ���� �Ϸ�
			target.v = newV; // �� �ٲ��ֱ�
			
		}
		
		return true;
		
	}
	
	
	
	public static Node search(int v) {
		// root�� ���ٸ� Ž���� �͵� ����...
		if(root == null) {
			return null;
		}
		// root�������� Ž�� ����
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
		// �ڽ� ��ü�� �״�� ���� - ��� �ڽ��� toString ȣ�� -> ������ �����ϱ�, nullpointer ����
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
