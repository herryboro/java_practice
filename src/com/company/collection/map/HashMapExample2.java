package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		Student student1 = new Student(3, "홍길동");		
		Student student2 = new Student(3, "홍길동");
		
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(student1, 95);
		map.put(student2, 95);
		
		System.out.println("총 Entry 수: " + map.size());
	}

}
