package day6;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapApiTest {

	public static void main(String[] args) {
		useMap(new HashMap<>( ));
		useMap(new LinkedHashMap<>( )); // �Է� �״�� ���	
		useMap(new TreeMap<>( )); // Ű �� ������� ����
	}
	
	public static void useMap(Map<Integer, String> map) {
		int [] arr = {-1, -1, 0, 2, -2, 1};
		for(int i : arr) {
			map.put(i, Integer.toString(i));
		}
		// HashMap - Ű �ߺ� x, ���� x, (value�� �ߺ� ����)
		System.out.println(map.getClass().getName()+" : "+map);
		
		
		Set<Integer> keys = map.keySet();
		for(Integer key: keys) {
			System.out.println("for: "+key+" : "+map.get(key));
		}
		
		Collection<String> vals = map.values(); 
		// map�� ������ �ϳ� �ϳ�..
		Set<Entry<Integer, String>> entrys = map.entrySet();
		for(Entry<Integer, String> ent: entrys) {
			System.out.println("entry: "+ent.getKey()+" : "+ ent.getValue());
		}
		
		
		if(map instanceof TreeMap) {
			TreeMap<Integer, String> tmap = (TreeMap<Integer, String>)map;
			// key�� ���������ϴ� �پ��� �˻� ����
			System.out.println("head: "+tmap.headMap(0));
			System.out.println("tail: "+tmap.tailMap(0));
			System.out.println("sub: "+tmap.subMap(-1, 1));
		
		}
		
	}
	
	

}
