package day6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetApiTest {

	public static void main(String[] args) {
		// HashSet은 중복X, 순서가 없다.
		//useSet(new HashSet<>());
		// LinkedHashSet은 중복 X, 넣은 순서대로 출력
		//useSet(new LinkedHashSet<>());
		// 알파벳 순서대로 정렬
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
			// 순서 기반한 다양한 검색 기능 제공
			System.out.println("Test 보다 앞에 있는 녀석들" + tset.headSet("Test"));
			System.out.println("Test 보다 뒤에 있는 녀석들" + tset.tailSet("Test"));
			System.out.println(tset.subSet("Done",  "Test"));
			System.out.println(tset.first()+" : "+tset.pollFirst());
		}
		
	}
	
	
}
