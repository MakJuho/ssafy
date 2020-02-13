package day6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetApiTest {

	public static void main(String[] args) {
		// HashSet�� �ߺ�X, ������ ����.
		//useSet(new HashSet<>());
		// LinkedHashSet�� �ߺ� X, ���� ������� ���
		//useSet(new LinkedHashSet<>());
		// ���ĺ� ������� ����
		useSet(new TreeSet<>());
	
		
		
	}
	public static void useSet(Set<String> set) {
		// add
		set.add("My");
		set.addAll(Arrays.asList("My", "Dreams", "Come", "True"));
		System.out.println(set.getClass().getName() + " : "+ set);
		for(String str: set) {
			System.out.println("for: "+str);
		}
		
		//System.out.println(set.size() + " : "+ set.contains("Hello")+" : "+ set.isEmpty() + " : "+set.remove("Hello"));
		
		Object [] arr =set.toArray();
		
		if(set instanceof TreeSet) {
			TreeSet<String> tset = (TreeSet) set;
			// ���� ����� �پ��� �˻� ��� ����
			System.out.println("Test ���� �տ� �ִ� �༮��" + tset.headSet("Test"));
			System.out.println("Test ���� �ڿ� �ִ� �༮��" + tset.tailSet("Test"));
			System.out.println(tset.subSet("Done",  "Test"));
			System.out.println(tset.first()+" : "+tset.pollFirst());
		}
		
	}
	
	
}
