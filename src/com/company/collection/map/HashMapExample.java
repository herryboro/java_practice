package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// Map 컬랙션 생성
		Map<String , Integer> map = new HashMap<String, Integer>();
		map.put("이순신", 85);
		map.put("김유신", 90);
		map.put("을지문덕", 80);
		map.put("강감찬", 95);
		System.out.println("총 Entry 수 : " + map.size());
		
		// 객체 찾기
		System.out.println("\t강감찬 : " + map.get("강감찬"));
		System.out.println("==================================");
		
		// 객체를 하나씩 처리
		Set<String> keySet  = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println("===================================");
		
		// 객체 삭제
		map.remove("을지문덕");
		System.out.println("총 Entry수: " + map.size());
		
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> enIterator = entrySet.iterator();
		
		while(enIterator.hasNext()) {
			Map.Entry<String, Integer> entry = enIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println("=====================================");
		
		// 객체 전체 삭제
		map.clear();
		System.out.println("총 객체 수: " + map.size());
	} 

}
